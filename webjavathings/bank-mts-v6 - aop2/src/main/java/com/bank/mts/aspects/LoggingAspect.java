package com.bank.mts.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	private static Logger logger = Logger.getLogger("mts");

	// @Before("execution(* txr(..))")
	// public void beforeLog(JoinPoint joinPoint) {
	// logger.info(joinPoint.toShortString() + " initiated");
	// }
	
	
	// @After("execution(* txr(..))")
	// public void afterLog(JoinPoint joinPoint) {
	// logger.info(joinPoint.toShortString() + " finished");
	// }

	@Around("execution(* txr(..))")
	public void aroundLog(ProceedingJoinPoint joinPoint) {
		for (Object arg : joinPoint.getArgs()) {
			System.out.println(arg);
		}
		try {
			logger.info("before");
			joinPoint.proceed();
			logger.info("After Returning");
		} catch (Throwable e) {
			logger.error("After Throwing");
		} finally {
			logger.info("After");
		}
	}

}
