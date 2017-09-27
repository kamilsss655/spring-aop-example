package aop.concert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Performance performance = ctx.getBean(Performance.class);
		performance.perform();

	}

}
