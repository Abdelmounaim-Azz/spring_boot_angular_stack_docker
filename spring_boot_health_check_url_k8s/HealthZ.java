package NAME_PACKAGE;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HealthZ implements HealthIndicator {
    @GetMapping("/healthz")
    public Health health() {
        Health.Builder status = Health.up();
        return status.build();
    }
}
