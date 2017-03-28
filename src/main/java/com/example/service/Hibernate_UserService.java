package com.example.service;

import com.example.domain.Hibernate_User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
/**
 * Created by Administrator on 2017/3/12.
 */
public interface Hibernate_UserService extends JpaRepository<Hibernate_User, Long> {
    Hibernate_User findByName(String name);
    Hibernate_User findByNameAndAge(String name, Integer age);

    @Query("from Hibernate_User u where u.name=:name")
    Hibernate_User findUser(@Param("name") String name);
}