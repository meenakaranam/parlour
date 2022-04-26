package com.org.hcl.service;

import com.org.hcl.model.Parlour;
import com.org.hcl.repository.ParlourRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ParlourServiceImpl implements ParlourService {

    @Autowired
    ParlourRepo parlourRepo;

    @Override
    public void createParlour(Parlour parlour) {
        parlourRepo.save(parlour);
    }

    @Override
    public List<Parlour> getAll() {
        List<Parlour> mm= parlourRepo.findAll();
        return mm;
    }

    @Override
    public void updateParlour(Parlour parlour) {
        parlourRepo.save(parlour);


    }

    @Override
    public String deleteByName(String name) {
        parlourRepo.deleteByName(name);
        return "sucessfully deleted";
    }

}
