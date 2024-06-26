package com.testimoniaprints.restfulapi.controller;

import com.testimoniaprints.restfulapi.entity.Piso;
import com.testimoniaprints.restfulapi.service.PisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PisoController {

    @Autowired
    PisoService pisoService;

    @GetMapping("/findAllPiso")
    public List<Piso> findAllPiso(){
        return pisoService.findAllPiso();
    }

    @PostMapping("/savePiso")
    public Piso savePiso(@RequestBody Piso piso){
        return pisoService.savePiso(piso);
    }
}
