package micro.gvwtestservice;

import lombok.RequiredArgsConstructor;
import micro.gvwtestservice.config.DatabaseConfig;
import micro.gvwtestservice.config.GvwConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConfigController {

    private final GvwConfig serviceConfig;

    private final DatabaseConfig databaseConfig;

    @GetMapping("/all")
    public String getAll() {
        return serviceConfig.toString() + "\n"
                + databaseConfig.toString()
                ;
    }
}
