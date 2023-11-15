package com.vivero.service;

import com.vivero.entity.Calle;
import com.vivero.repository.CalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalleService {

    @Autowired
    private CalleRepository calleRepository;

    public List<Calle> getAll(){
        return calleRepository.findAll();
    }
}
