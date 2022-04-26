package com.org.hcl.repository;

import com.org.hcl.model.Parlour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ParlourRepo extends JpaRepository<Parlour,Integer> {
    @Transactional
    void deleteByName(String name);

}
