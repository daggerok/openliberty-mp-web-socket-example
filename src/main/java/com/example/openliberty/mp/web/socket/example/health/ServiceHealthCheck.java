package com.example.openliberty.mp.web.socket.example.health;

// import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
// @Health // deprecated, use @Readiness:
public class ServiceHealthCheck implements HealthCheck {

    @Override
    @Readiness
    public HealthCheckResponse call() {
        return HealthCheckResponse.named(ServiceHealthCheck.class.getSimpleName()).up().build();
    }
}
