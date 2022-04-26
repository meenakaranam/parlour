package com.org.hcl.service;

import com.org.hcl.model.Parlour;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ParlourService {
    public void createParlour(Parlour parlour);

    public List<Parlour> getAll();
    public void updateParlour( Parlour parlour );
    public String deleteByName( String name);

    }

