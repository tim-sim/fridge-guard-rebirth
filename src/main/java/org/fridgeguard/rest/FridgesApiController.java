package org.fridgeguard.rest;

import io.swagger.api.FridgesApi;
import org.fridgeguard.model.Error;
import org.fridgeguard.model.Fridge;
import org.fridgeguard.model.FridgeContent;
import org.fridgeguard.model.ProductItem;

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
public class FridgesApiController implements FridgesApi {



    public ResponseEntity<List<Fridge>> fridgesGet() {
        // do some magic!
        return new ResponseEntity<List<Fridge>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> fridgesIdDelete(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<FridgeContent>> fridgesIdItemsGet(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id) {
        // do some magic!
        return new ResponseEntity<List<FridgeContent>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> fridgesIdItemsPost(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id,
        @ApiParam(value = ""  ) @RequestBody ProductItem item) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> fridgesItemsIdDelete(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> fridgesItemsIdPut(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> fridgesPost(@ApiParam(value = ""  ) @RequestBody Fridge fridge) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
