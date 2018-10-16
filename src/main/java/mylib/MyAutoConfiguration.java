package mylib;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
	* @author <a href="mailto:josh@joshlong.com">Josh Long</a>
	*/
@Configuration
@EnableConfigurationProperties(MyProperties.class)
public class MyAutoConfiguration {

	@Bean
	Bar bar(Foo foo) {
		return new Bar(foo);
	}

	@Bean
	Foo foo(MyProperties myProperties) {
		return new Foo(myProperties.getMessage());
	}
}
