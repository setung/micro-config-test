package micro.gvwtestservice.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "service")
@Getter
@Setter
@ToString
public class GvwConfig {

    private String name;

    private String env;

    private String description;

    private Integer number;

    private String email;
}