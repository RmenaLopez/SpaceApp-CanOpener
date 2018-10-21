package com.spaceapps.canopener.SpaceAppCanOpener.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spaceapps.canopener.SpaceAppCanOpener.entity.NaturalDisasterListEntity;
import com.spaceapps.canopener.SpaceAppCanOpener.service.NaturalDisasterService;

@RestController
public class NaturalDisasterController  {
    final private String GET_DISASTERS_URL = "/disasters";

    private NaturalDisasterService naturalDisasterService;

    @Autowired
    public NaturalDisasterController(NaturalDisasterService naturalDisasterService) {
        this.naturalDisasterService = naturalDisasterService;
    }

    @GetMapping(GET_DISASTERS_URL)
    public List<NaturalDisasterListEntity> getAllDisasters (){
        return naturalDisasterService.getAllDisasters();
    }

}
