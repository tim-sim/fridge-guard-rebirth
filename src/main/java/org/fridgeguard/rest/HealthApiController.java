package org.fridgeguard.rest;

import io.swagger.api.HealthApi;
import org.fridgeguard.model.HealthStatus;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-24T13:57:21.660Z")

@Controller
public class HealthApiController implements HealthApi {



    public ResponseEntity<HealthStatus> healthGet() {
        HealthStatus healthStatus = new HealthStatus();
        healthStatus.setStatus("Green");
        healthStatus.setTotalExpiredItems(0);
        healthStatus.setTotalFriges(0);
        healthStatus.setTotalItems(0);

        return new ResponseEntity<HealthStatus>(healthStatus, HttpStatus.OK);
    }

}
