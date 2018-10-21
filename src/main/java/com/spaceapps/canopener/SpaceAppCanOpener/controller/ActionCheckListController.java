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

import com.spaceapps.canopener.SpaceAppCanOpener.entity.ActionCheckListEntity;
import com.spaceapps.canopener.SpaceAppCanOpener.entity.ItemCheckListEntity;
import com.spaceapps.canopener.SpaceAppCanOpener.repository.ActionCheckListRepository;
import com.spaceapps.canopener.SpaceAppCanOpener.service.ActionCheckListService;

@RestController
public class ActionCheckListController {

    private final String ACTION_CHECKLIST_URL = "/list/actions";

    private ActionCheckListService actionCheckListService;

    @Autowired
    public ActionCheckListController(ActionCheckListService actionCheckListService) {
        this.actionCheckListService = actionCheckListService;
    }

    @PostMapping(ACTION_CHECKLIST_URL)
    public ActionCheckListEntity createNewItemCheckList (@RequestBody ActionCheckListEntity actionCheckListEntity,
                                                       HttpServletResponse response){

        ActionCheckListEntity res = actionCheckListService.createNewActionCheckList(actionCheckListEntity);
        response.setStatus(HttpStatus.CREATED.value());
        return res;
    }

    @GetMapping(ACTION_CHECKLIST_URL)
    public ActionCheckListEntity getItemList (@RequestParam String userEmail,
                                              @RequestParam String listName){
        return actionCheckListService.getActionList(listName,userEmail);
    }

    @DeleteMapping(ACTION_CHECKLIST_URL)
    public void deleteItemList(@RequestParam String userEmail,
                                              @RequestParam String listName,
                                                HttpServletResponse response){
        actionCheckListService.deleteActionList(listName,userEmail);
        response.setStatus(HttpStatus.OK.value());
    }

    @PutMapping(ACTION_CHECKLIST_URL)
    public ActionCheckListEntity updateNewItemCheckList (@RequestBody ActionCheckListEntity actionCheckListEntity,
                                                       HttpServletResponse response){

        ActionCheckListEntity res = actionCheckListService.updateActionCheckList(actionCheckListEntity);
        response.setStatus(HttpStatus.OK.value());
        return res;
    }


}
