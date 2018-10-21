package com.spaceapps.canopener.SpaceAppCanOpener.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spaceapps.canopener.SpaceAppCanOpener.entity.ItemCheckListEntity;

@Repository
public interface ItemCheckListRepository extends JpaRepository<ItemCheckListEntity, Long> {



}
