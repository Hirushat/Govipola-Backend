package org.example.service;

import org.example.dto.User;
import org.example.entity.UserEntity;

import java.util.List;

public interface UserService {

    List<UserEntity> getFarmers();

    List<UserEntity> getMiddleman();

    List<UserEntity> getMiller();

    boolean addFarmer(User user);

    void deleteById(Long id);

    UserEntity findByUserName(String username);

    Boolean isExistUser(String userName);
}
