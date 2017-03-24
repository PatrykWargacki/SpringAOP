package aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	@Pointcut("execution(** aspects.Performance.perform(..))")
	public void performance(){}
	
	@Around("performance()")
	public void aroundPerformance(ProceedingJoinPoint jp){
		try{
			System.out.println("Widzowie siadaja");
			jp.proceed();
			System.out.println("Koniec przedstawienia");
			System.out.println("Widzowie wstaja i klaszcza");
		}catch(Throwable e){
			System.out.println("Widzowie wstaja i rzucaja pomidorami");
		}
	}
	/*
	@Before("performance()")
	public void beforePerform(){
		System.out.println("Widzowie siadaja");
	}
	
	@After("performance()")
	public void afterPerform(){
		System.out.println("Koniec przedstawienia");
	}
	
	@AfterReturning("performance()")
	public void applause(){
		System.out.println("Widzowie wstaja i klaszcza");
	}
	
	@AfterThrowing("performance()")
	public void buuu(){
		System.out.println("Widzowie wstaja i rzucaja pomidorami");
	}
	*/
}
