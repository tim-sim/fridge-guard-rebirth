package org.fridgeguard.rest;

import io.swagger.api.HealthApi;
import org.fridgeguard.model.HealthStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthApiController implements HealthApi {
    @Override
    public ResponseEntity<HealthStatus> healthGet() {
        HealthStatus healthStatus = new HealthStatus();
        healthStatus.setStatus("Green");
        healthStatus.setTotalExpiredItems(0);
        healthStatus.setTotalFriges(0);
        healthStatus.setTotalItems(0);

        return new ResponseEntity<>(healthStatus, HttpStatus.OK);
    }
}
