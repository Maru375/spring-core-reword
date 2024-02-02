package com.nhnacademy.edu.springframework.aop;

import com.nhnacademy.edu.springframework.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Slf4j
@Aspect
@Component
public class MethodAspect {

    @Around("execution(* com.nhnacademy.edu.springframework.sender.MessageSender.sendMessage(..)) && args(user, ..)")
    public Object timeLogger(ProceedingJoinPoint joinPoint, User user) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        log.info("Parameter: {}", user.toString());
        log.info("Method {} is start", joinPoint.getSignature().toShortString());

        Object result = joinPoint.proceed();
        stopWatch.stop();

        log.info("Method {} executed in {} ms", joinPoint.getSignature().toShortString(), stopWatch.getTotalTimeMillis());

        return result;
    }
}
