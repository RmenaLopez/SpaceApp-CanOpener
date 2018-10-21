package com.spaceapps.canopener.SpaceAppCanOpener.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spaceapps.canopener.SpaceAppCanOpener.entity.NaturalDisasterListEntity;
import com.spaceapps.canopener.SpaceAppCanOpener.repository.NaturalDisasterRepository;

@Service
public class NaturalDisasterService {

    private NaturalDisasterRepository naturalDisasterRepository;

    @Autowired
    public NaturalDisasterService(NaturalDisasterRepository naturalDisasterRepository) {
        this.naturalDisasterRepository = naturalDisasterRepository;
    }


    public List<NaturalDisasterListEntity> getAllDisasters() {
        return naturalDisasterRepository.findAll();
    }
}
