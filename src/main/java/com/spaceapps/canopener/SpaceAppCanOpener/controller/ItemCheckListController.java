package com.spaceapps.canopener.SpaceAppCanOpener.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spaceapps.canopener.SpaceAppCanOpener.entity.ItemCheckListEntity;
import com.spaceapps.canopener.SpaceAppCanOpener.service.ItemCheckListService;
import com.sun.deploy.net.HttpResponse;

@RestController
public class ItemCheckListController {

    private final String ITEM_CHECKLIST_URL = "/list/items";

    private ItemCheckListService itemCheckListService;

    @Autowired
    public ItemCheckListController(ItemCheckListService itemCheckListService) {
        this.itemCheckListService = itemCheckListService;
    }

    @PostMapping(ITEM_CHECKLIST_URL)
    public ItemCheckListEntity createNewItemCheckList (@RequestBody ItemCheckListEntity itemCheckListEntity,
                                                       HttpServletResponse response){

        ItemCheckListEntity res = itemCheckListService.createNewItemCheckList(itemCheckListEntity);
        response.setStatus(HttpStatus.CREATED.value());
        return res;
    }

    @GetMapping(ITEM_CHECKLIST_URL)
    public ItemCheckListEntity getItemList (@RequestParam String userEmail,
                                            @RequestParam String listName){
        return itemCheckListService.getItemList(listName,userEmail);
    }

    @DeleteMapping(ITEM_CHECKLIST_URL)
    public void deleteItemList(@RequestParam String userEmail,
                                              @RequestParam String listName,
                                                HttpServletResponse response){
        itemCheckListService.deleteItemList(listName,userEmail);
        response.setStatus(HttpStatus.OK.value());
    }

    @PutMapping(ITEM_CHECKLIST_URL)
    public ItemCheckListEntity updateNewItemCheckList (@RequestBody ItemCheckListEntity itemCheckListEntity,
                                                       HttpServletResponse response){

        ItemCheckListEntity res = itemCheckListService.updateItemCheckList(itemCheckListEntity);
        response.setStatus(HttpStatus.OK.value());
        return res;
    }


}
