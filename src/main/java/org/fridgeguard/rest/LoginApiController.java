package org.fridgeguard.rest;

import org.fridgeguard.model.Login;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Timur Nasibullin
 * @since 3/28/2017
 */
public class LoginApiController {
    @PostMapping("/session")
    public ResponseEntity session(Login login) {
        return new ResponseEntity(HttpStatus.OK);
    }
}
