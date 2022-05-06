package com.example.wipro.service;

import com.example.wipro.model.Flipkart;
import com.example.wipro.repository.FlipkartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class FlipkartServiceImpl implements FlipkartService{
    @Autowired
    FlipkartRepo flipkartRepo;
    @Override
    public void createFlipkart(Flipkart flipkart) {
        flipkartRepo.save(flipkart);
    }

    @Override
    public List<Flipkart> getAll() {
        List<Flipkart> list1 =flipkartRepo.findAll();
        return list1;
    }

    @Override
    public String update(Flipkart flipkart) {
       flipkartRepo.save(flipkart);
        return "success";
    }

    @Override
    public String deleteById(Integer id) {
        flipkartRepo.deleteById(id);
        return "naveen";

    }

}
