package com.example.wipro.controller;

import com.example.wipro.model.Flipkart;
import com.example.wipro.service.FlipkartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FlipkartController {
    @Autowired
    FlipkartService flipkartService;


    @PostMapping("/create")
    public void createFlipkart(@RequestBody Flipkart flipkart){

        flipkartService.createFlipkart(flipkart);

    }
    @GetMapping("/getAll")
    public List<Flipkart>getAll(){
        List<Flipkart> list   = flipkartService.getAll();
        return list;

    }
    @PutMapping("/update")
    public String update(@RequestBody Flipkart flipkart){
        String new1 =flipkartService.update(flipkart);
        return new1;

    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
       String s = flipkartService.deleteById(id);
        return s;
    }

}
