package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	//this  is where we add all related advices for  logging
	
	//lets start with @Before advice
	
	//@Before("execution(public void addAccount())") //point cut expresion(predicate expression tells where advice should be applied)
	
	//@Before("execution(* add*(com.luv2code.aopdemo.Account))")//Matches exact types
	//@Before("execution(* add*(..))")//Matches any  number of parameters
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {
		
	}
	
	
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=======>>> Excecuting @Before  Advice on method()");
	}
	
	@Before("forDaoPackage()")
	public void apiAnalytics() {
		System.out.println("\n====>> In apianalytics()");
	}
	
}
