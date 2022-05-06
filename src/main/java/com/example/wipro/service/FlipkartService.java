package com.example.wipro.service;

import com.example.wipro.model.Flipkart;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface FlipkartService {
    public void createFlipkart( Flipkart flipkart);
    public List<Flipkart> getAll();
    public String update( Flipkart flipkart);
    public String deleteById( Integer id);

    }
