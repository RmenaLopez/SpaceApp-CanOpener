package com.spaceapps.canopener.SpaceAppCanOpener.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spaceapps.canopener.SpaceAppCanOpener.entity.ActionCheckListEntity;
import com.spaceapps.canopener.SpaceAppCanOpener.repository.ActionCheckListRepository;

@Service
@Transactional
public class ActionCheckListService {

    private ActionCheckListRepository actionCheckListRepository;

    @Autowired
    public ActionCheckListService(ActionCheckListRepository actionCheckListRepository) {
        this.actionCheckListRepository = actionCheckListRepository;
    }

    public ActionCheckListEntity getActionList(String listName, String userEmail){
        return actionCheckListRepository.getByNameAndUserEmail(listName, userEmail);
    }

    public ActionCheckListEntity createNewActionCheckList(ActionCheckListEntity actionCheckListEntity) {
        return this.actionCheckListRepository.save(actionCheckListEntity);
    }

    public void deleteActionList(String listName, String userEmail) {
        actionCheckListRepository.deleteByNameAndUserEmail(listName, userEmail);
    }

    public ActionCheckListEntity updateActionCheckList(ActionCheckListEntity actionCheckListEntity) {
        actionCheckListRepository.deleteByNameAndUserEmail(actionCheckListEntity.getName(), actionCheckListEntity.getUserEmail());
        actionCheckListRepository.flush();
        return actionCheckListRepository.saveAndFlush(actionCheckListEntity);
    }
}
