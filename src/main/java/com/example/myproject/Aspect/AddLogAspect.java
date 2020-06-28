package com.example.myproject.Aspect;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AddLogAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(AddLogAspect.class);
    private final String POINT_CUT = "execution(* com.example.myproject.controller..*.*(..))";

    @Pointcut(POINT_CUT)
    public void pointcut() {
    }

    @AfterReturning(value = "pointcut()")
    public void afterRunning() {
        LOGGER.info("do everything afterRunning");
    }


    @Before(value = "pointcut()")
    public void before() {
        LOGGER.info("do everything before");
    }

    @After("pointcut()")
    public void after() {
        LOGGER.info("do everything after");
    }


}
