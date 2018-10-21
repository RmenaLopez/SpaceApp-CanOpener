package com.spaceapps.canopener.SpaceAppCanOpener.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spaceapps.canopener.SpaceAppCanOpener.entity.ItemCheckListEntity;
import com.spaceapps.canopener.SpaceAppCanOpener.service.ItemCheckListService;

@RestController
public class ItemCheckListController {


    private ItemCheckListService itemCheckListService;

    @Autowired
    public ItemCheckListController(ItemCheckListService itemCheckListService) {
        this.itemCheckListService = itemCheckListService;
    }

    @GetMapping("/test")
    public ItemCheckListEntity testWe (){
        return itemCheckListService.testWe();
    }


}
