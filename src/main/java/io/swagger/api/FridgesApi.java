package io.swagger.api;

import org.fridgeguard.model.Error;
import org.fridgeguard.model.Fridge;
import org.fridgeguard.model.FridgeContent;
import org.fridgeguard.model.ProductItem;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-24T13:57:21.660Z")

@Api(value = "fridges", description = "the fridges API")
public interface FridgesApi {

    @ApiOperation(value = "Gets list of fridges", notes = "", response = Fridge.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Fridge.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Fridge.class) })
    @RequestMapping(value = "/fridges",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Fridge>> fridgesGet();


    @ApiOperation(value = "Deletes existent Fridge", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Fridge deleted", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    @RequestMapping(value = "/fridges/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> fridgesIdDelete(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id);


    @ApiOperation(value = "Gets content of specified fridge", notes = "", response = FridgeContent.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FridgeContent.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = FridgeContent.class) })
    @RequestMapping(value = "/fridges/{id}/items",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<FridgeContent>> fridgesIdItemsGet(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id);


    @ApiOperation(value = "Creates new item in a fridge", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Fridge item created", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    @RequestMapping(value = "/fridges/{id}/items",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> fridgesIdItemsPost(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id,
        @ApiParam(value = ""  ) @RequestBody ProductItem item);


    @ApiOperation(value = "Deletes Fridge Item", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Fridge Item deleted", response = Void.class) })
    @RequestMapping(value = "/fridges/items/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> fridgesItemsIdDelete(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id);


    @ApiOperation(value = "Updates Fridge Item", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Fridge Item updated", response = Void.class) })
    @RequestMapping(value = "/fridges/items/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> fridgesItemsIdPut(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id);


    @ApiOperation(value = "Creates new fridge", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    @RequestMapping(value = "/fridges",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> fridgesPost(@ApiParam(value = ""  ) @RequestBody Fridge fridge);

}
