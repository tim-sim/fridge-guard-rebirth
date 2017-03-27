package org.fridgeguard.rest;

import io.swagger.api.UsersApi;
import org.fridgeguard.model.Error;
import org.fridgeguard.model.UserEdit;
import org.fridgeguard.model.UserView;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-24T13:57:21.660Z")

@Controller
public class UsersApiController implements UsersApi {



    public ResponseEntity<List<UserView>> usersGet() {
        // do some magic!
        return new ResponseEntity<List<UserView>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> usersIdDelete(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> usersIdPut(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id,
        @ApiParam(value = ""  ) @RequestBody UserEdit user) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> usersPost(@ApiParam(value = ""  ) @RequestBody UserEdit user) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
