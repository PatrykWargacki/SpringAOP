package aspects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {

	public static void main(String[] args) {

		ApplicationContext context =
				new AnnotationConfigApplicationContext(aspects.AspectConfig.class);
		
		Performance perf = context.getBean(Performance.class);
		perf.perform();
		
	}

}
