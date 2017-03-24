package aspects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AspectConfig {
	
	@Bean
	public Audience audience(){
		return new Audience();
	}
	
	@Bean
	public Stage stage(){
		return new Stage();
	}
}
