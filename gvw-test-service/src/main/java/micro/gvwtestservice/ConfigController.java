package micro.gvwtestservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConfigController {

    private final ServiceConfig serviceConfig;

    @GetMapping("/name")
    public String getServiceName() {
        return serviceConfig.getName();
    }

    @GetMapping("/env")
    public String getServiceEnv() {
        return serviceConfig.getEnv();
    }

    @GetMapping("/description")
    public String getServiceDescription() {
        return serviceConfig.getEnv();
    }
}
