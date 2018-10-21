package com.spaceapps.canopener.SpaceAppCanOpener.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spaceapps.canopener.SpaceAppCanOpener.entity.ListsContainerEntity;

@Repository
public interface ListsContainerRepository extends JpaRepository<ListsContainerEntity, Long> {
    List<ListsContainerEntity> getByUserEmail(String userEmail);
}
