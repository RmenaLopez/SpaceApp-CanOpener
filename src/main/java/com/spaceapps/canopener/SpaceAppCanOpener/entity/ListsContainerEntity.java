package com.spaceapps.canopener.SpaceAppCanOpener.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "lists_container_table")
public class ListsContainerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @NotNull
    @Column(name = "disaster_name")
    private String disasterName;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "container")
    private ItemCheckListEntity itemCheckLis;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "container")
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
}
