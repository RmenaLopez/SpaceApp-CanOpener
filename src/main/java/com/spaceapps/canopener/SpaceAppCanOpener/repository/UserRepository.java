package com.spaceapps.canopener.SpaceAppCanOpener.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spaceapps.canopener.SpaceAppCanOpener.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User getByEmail (String email);

}
