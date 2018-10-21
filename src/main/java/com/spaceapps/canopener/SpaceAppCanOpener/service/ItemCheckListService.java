package com.spaceapps.canopener.SpaceAppCanOpener.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spaceapps.canopener.SpaceAppCanOpener.entity.ItemCheckListEntity;
import com.spaceapps.canopener.SpaceAppCanOpener.repository.ItemCheckListRepository;

@Service
@Transactional
public class ItemCheckListService {

    private ItemCheckListRepository itemCheckListRepository;

    @Autowired
    public ItemCheckListService(ItemCheckListRepository itemCheckListRepository) {
        this.itemCheckListRepository = itemCheckListRepository;
    }

    public ItemCheckListEntity getItemList(String listName, String userEmail){
        return itemCheckListRepository.getByNameAndUserEmail(listName, userEmail);
    }

    public ItemCheckListEntity createNewItemCheckList(ItemCheckListEntity itemCheckListEntity) {
        return itemCheckListRepository.save(itemCheckListEntity);
    }

    public void deleteItemList(String listName, String userEmail) {
        itemCheckListRepository.deleteByNameAndUserEmail(listName, userEmail);
    }

    public ItemCheckListEntity updateItemCheckList(ItemCheckListEntity itemCheckListEntity) {
        itemCheckListRepository.deleteByNameAndUserEmail(itemCheckListEntity.getName(), itemCheckListEntity.getUserEmail());
        itemCheckListRepository.flush();
        return itemCheckListRepository.saveAndFlush(itemCheckListEntity);
    }
}
