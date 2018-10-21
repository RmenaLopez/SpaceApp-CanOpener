package com.spaceapps.canopener.SpaceAppCanOpener.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spaceapps.canopener.SpaceAppCanOpener.entity.NaturalDisasterListEntity;

public interface NaturalDisasterRepository extends JpaRepository<NaturalDisasterListEntity, Long> {
}
