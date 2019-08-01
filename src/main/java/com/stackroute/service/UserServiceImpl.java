package com.stackroute.service;

import com.stackroute.domain.User;
import com.stackroute.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

   private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository1)
    {
        this.userRepository = userRepository1;
    }


    @Override
    public User saveUser(User user) {
        User saveUser1= userRepository.save(user);
        return saveUser1;
    }

    @Override
    public User getUserById(int  id) {
      User retrivedUser= userRepository.findById(id).get();
      return retrivedUser;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
