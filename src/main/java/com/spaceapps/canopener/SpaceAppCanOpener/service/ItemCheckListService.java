package com.spaceapps.canopener.SpaceAppCanOpener.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spaceapps.canopener.SpaceAppCanOpener.entity.ItemCheckListEntity;
import com.spaceapps.canopener.SpaceAppCanOpener.entity.ItemEntity;
import com.spaceapps.canopener.SpaceAppCanOpener.repository.ItemCheckListRepository;

@Service
public class ItemCheckListService {

    ItemCheckListRepository itemCheckListRepository;

    @Autowired
    public ItemCheckListService(ItemCheckListRepository itemCheckListRepository) {
        this.itemCheckListRepository = itemCheckListRepository;
    }

    public ItemCheckListEntity testWe (){

        ItemCheckListEntity testThing= new ItemCheckListEntity();
        testThing.setName("my awesome list");

        ItemEntity entity1 = new ItemEntity();
        ItemEntity entity2 = new ItemEntity();
        ItemEntity entity3 = new ItemEntity();

        entity1.setItemName("condones");
        entity2.setItemName("mostaza");
        entity3.setItemName("la keshu xD");

        testThing.getItems().add(entity1);
        testThing.getItems().add(entity2);
        testThing.getItems().add(entity3);

        ItemCheckListEntity result = itemCheckListRepository.save(testThing);
        return result;

    }

}
