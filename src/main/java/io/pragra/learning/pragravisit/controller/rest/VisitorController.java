package io.pragra.learning.pragravisit.controller.rest;

import io.pragra.learning.pragravisit.entity.PragraVisitor;
import io.pragra.learning.pragravisit.service.VisitorService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//
@RestController
public class VisitorController {
//
    private VisitorService service;

    public VisitorController(VisitorService service) {
        this.service = service;
    }
//
    @GetMapping(value = "/api/visitor",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PragraVisitor> getAllVisitor(
            @RequestParam(name = "lastname", required = false) String lastname,
            @RequestParam(name = "firstname", required = false) String firstname
    ){
        if(lastname != null && firstname !=null){
            return service.getAllByLastNameAndFirstName(lastname, firstname);
        }
        if(lastname==null && firstname != null) {
            return service.getAllbyFirstName(firstname);
        }
        if(lastname!=null && firstname == null) {
            return service.getAllbyLastName(lastname);
        }
        return  service.getAll();
    }
//
//
    @GetMapping(value = "/api/visitor/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public PragraVisitor getAllVisitor(@PathVariable("id") Integer id){
        return service.getById(id).orElseThrow();
    }
//
    @PutMapping(value = "/api/visitor",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public PragraVisitor update(@RequestBody PragraVisitor visitor){
        return service.updateVisitor(visitor);
    }
//
    @PostMapping(value = "/api/visitor",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public PragraVisitor create(@RequestBody PragraVisitor visitor){
        return service.createVisitor(visitor);
    }
//
    @DeleteMapping(value = "/api/visitor/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable("id") Integer id){
        service.deleteById(id);
    }
}