package io.swagger.api;

import org.fridgeguard.model.HealthStatus;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-24T13:57:21.660Z")

@Api(value = "health", description = "the health API")
public interface HealthApi {

    @ApiOperation(value = "Gets basic status info", notes = "", response = HealthStatus.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Succressful response", response = HealthStatus.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = HealthStatus.class) })
    @RequestMapping(value = "/health",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<HealthStatus> healthGet();

}
