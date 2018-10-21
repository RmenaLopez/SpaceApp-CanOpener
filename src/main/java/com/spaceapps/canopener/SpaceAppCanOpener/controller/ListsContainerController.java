package com.spaceapps.canopener.SpaceAppCanOpener.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spaceapps.canopener.SpaceAppCanOpener.entity.ListsContainerEntity;
import com.spaceapps.canopener.SpaceAppCanOpener.service.ListsContainerService;

@RestController
public class ListsContainerController {
    private final String LISTS_CONTAINER_URL = "/containers";

    private ListsContainerService listsContainerService;

    @Autowired
    public ListsContainerController(ListsContainerService listsContainerService) {
        this.listsContainerService = listsContainerService;
    }

    @PostMapping(LISTS_CONTAINER_URL)
    public ListsContainerEntity createContainer(@RequestBody ListsContainerEntity listsContainerEntity,
                                                HttpServletResponse response){
        listsContainerEntity.getItemCheckLis().setContainer(listsContainerEntity);
        listsContainerEntity.getActionCheckLis().setContainer(listsContainerEntity);
        ListsContainerEntity res = listsContainerService.createContainer(listsContainerEntity);
        response.setStatus(HttpStatus.CREATED.value());
        return res;
    }

    @GetMapping(LISTS_CONTAINER_URL)
    public List<ListsContainerEntity> getContainers(@RequestParam String userEmail,
                                                    HttpServletResponse response){
        List<ListsContainerEntity> res = listsContainerService.getContainers(userEmail);
        response.setStatus(HttpStatus.OK.value());
        return res;
    }
}
