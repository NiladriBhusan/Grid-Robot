import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.webTemplate.config.jpa",
        "com.webTemplate.config.web",
        "com.webTemplate.config.security",
        "com.webTemplate.service",
        "com.idealo.controller",
        "com.idealo.service"
})
public class Application {
        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }
}
