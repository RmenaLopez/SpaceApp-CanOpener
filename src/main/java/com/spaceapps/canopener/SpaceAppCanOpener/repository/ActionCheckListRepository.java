package com.spaceapps.canopener.SpaceAppCanOpener.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spaceapps.canopener.SpaceAppCanOpener.entity.ActionCheckListEntity;
import com.spaceapps.canopener.SpaceAppCanOpener.entity.ItemCheckListEntity;

@Repository
public interface ActionCheckListRepository extends JpaRepository<ActionCheckListEntity, Long> {

    ActionCheckListEntity getByNameAndUserEmail(String name, String userEmail);

    void deleteByNameAndUserEmail(String name, String userEmail);

}
