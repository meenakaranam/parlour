package com.org.hcl.controller;


import com.org.hcl.model.Parlour;
import com.org.hcl.service.ParlourService;
import org.hibernate.loader.plan.spi.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class ParlourController {
    @Autowired
    ParlourService parlourService;


    @PostMapping("/create")
    public void createParlour(@RequestBody Parlour parlour) {
        parlourService.createParlour(parlour);


    }
     @GetMapping("/getAll")
    public List<Parlour> getAll(){
         List<Parlour> rr= parlourService.getAll();
         return rr;

     }
     @PutMapping("/update")
    public void updateParlour(@RequestBody Parlour parlour ) {
         parlourService.createParlour(parlour );


     }
     @DeleteMapping("/deleteByName/{name}")
    public String deleteByName(@PathVariable String name){
        String hh= parlourService.deleteByName(name);
        return hh;
     }


}

