package com.TemperatureSystem.persistence;

import com.TemperatureSystem.persistence.crud.UserCrudRepository;
import com.TemperatureSystem.persistence.entity.User;

import java.util.List;

public class UserRepository {
    private UserCrudRepository userCrudRepository;

    // CREATE / UPDATE
    public User save(User user){
        return userCrudRepository.save(user);
    }

    // READ
    public List<User> getAll(){
        return (List<User>) userCrudRepository.findAll();
    }

    // DELETE
    public void delete(int id){
        userCrudRepository.deleteById(id);
    }
}
