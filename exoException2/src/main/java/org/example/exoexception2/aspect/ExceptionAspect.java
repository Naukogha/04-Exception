package org.example.exoexception2.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExceptionAspect {
    @Pointcut("@annotation(org.example.exoexception2.annotation.Exception)")
    public void ExceptionPointcut() {

    }

    @AfterThrowing(value = "ExceptionPointcut()", throwing = "exception")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable exception) {
        System.out.println("Exception levée : " + exception.getMessage());
    }


}
