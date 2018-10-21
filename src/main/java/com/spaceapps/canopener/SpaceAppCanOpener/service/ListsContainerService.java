package com.spaceapps.canopener.SpaceAppCanOpener.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spaceapps.canopener.SpaceAppCanOpener.entity.ListsContainerEntity;
import com.spaceapps.canopener.SpaceAppCanOpener.repository.ListsContainerRepository;

@Service
public class ListsContainerService {

    private ListsContainerRepository listsContainerRepository;

    @Autowired
    public ListsContainerService(ListsContainerRepository listsContainerRepository) {
        this.listsContainerRepository = listsContainerRepository;
    }

    public ListsContainerEntity createContainer(ListsContainerEntity listsContainerEntity) {
        return listsContainerRepository.save(listsContainerEntity);
    }

    public List<ListsContainerEntity> getContainers(String userEmail) {
        return listsContainerRepository.getByUserEmail(userEmail);
    }
}
