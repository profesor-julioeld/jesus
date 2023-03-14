package com.s2daw.demo.controllers;


import com.s2daw.demo.dao.BarRepository;
import com.s2daw.demo.models.Bar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    @Autowired
	BarRepository barRepository;

    // Get lista con todas lineas
    @RequestMapping(value = "/api/bar", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> getLineas() {
   	 try {
   		 Iterable<Bar> lineas = barRepository.findAll();
   		 return new ResponseEntity<>(lineas, HttpStatus.OK);

   	 } catch (Exception ex) {
   		 return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
   	 }

    }
}

