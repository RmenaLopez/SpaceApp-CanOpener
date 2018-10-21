package com.spaceapps.canopener.SpaceAppCanOpener.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "lists_container_table")
public class ListsContainerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_email")
    private String userEmail;

    @NotNull
    @Column(name = "disaster_name")
    private String disasterName;

    @OneToOne(cascade = CascadeType.ALL)
    private ItemCheckListEntity itemCheckLis;

    @OneToOne(cascade = CascadeType.ALL)
    private ActionCheckListEntity actionCheckLis;

    public ListsContainerEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getDisasterName() {
        return disasterName;
    }

    public void setDisasterName(String disasterName) {
        this.disasterName = disasterName;
    }

    public ItemCheckListEntity getItemCheckLis() {
        return itemCheckLis;
    }

    public void setItemCheckLis(ItemCheckListEntity itemCheckLis) {
        this.itemCheckLis = itemCheckLis;
    }

    public ActionCheckListEntity getActionCheckLis() {
        return actionCheckLis;
    }

    public void setActionCheckLis(ActionCheckListEntity actionCheckLis) {
        this.actionCheckLis = actionCheckLis;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
