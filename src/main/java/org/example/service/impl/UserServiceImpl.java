package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.entity.RiceStockEntity;
import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    final ModelMapper mapper;


    @Override
    public List<UserEntity> getFarmers() {
        List<UserEntity> all = repository.findAll();
        List<UserEntity> farmers = new ArrayList<>();

        for(UserEntity userEntity : all){
            if(userEntity.getUserType().equalsIgnoreCase("farmer")){
                farmers.add(userEntity);
            }
        }
        return farmers;
    }

    @Override
    public List<UserEntity> getMiddleman() {
        List<UserEntity> all = repository.findAll();
        List<UserEntity> middleman = new ArrayList<>();

        for(UserEntity userEntity : all){
            if(userEntity.getUserType().equalsIgnoreCase("intermediate")){
                middleman.add(userEntity);
            }
        }
        return middleman;
    }

    @Override
    public List<UserEntity> getMiller() {
        List<UserEntity> all = repository.findAll();
        List<UserEntity> miller = new ArrayList<>();

        for(UserEntity userEntity : all){
            if(userEntity.getUserType().equalsIgnoreCase("miller")){
                miller.add(userEntity);
            }
        }
        return miller;
    }

    @Override
    public boolean addFarmer(User user) {
        if (user != null) {
            repository.save(mapper.map(user, UserEntity.class));
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public UserEntity findByUserName(String userName) {
        return repository.findByUserName(userName);
    }

    @Override
    public Boolean isExistUser(String userName) {
        return repository.existsByUserName(userName);
    }

}
