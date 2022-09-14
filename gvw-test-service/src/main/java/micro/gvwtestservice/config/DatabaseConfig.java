package micro.gvwtestservice.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
@Getter
@Setter
@ToString
public class DatabaseConfig {

    private String driverClassName;

    private String url;

    private String username;

    private String password;

}
