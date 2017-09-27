package aop.concert;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {

	@Pointcut("execution(** aop.concert.Performance.perform(..))")
	public void performance() {
	}

	@Before("performance()")
	public void silenceCellPhones() {
		System.out.println("Aspect: Silencing cell phones.");
	}

	@After("performance()")
	public void clap() {
		System.out.println("Aspect: Clap.");
	}
}
