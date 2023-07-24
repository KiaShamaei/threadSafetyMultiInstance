package com.example.transactionmanagement.service;

import com.example.transactionmanagement.entity.UserEntity;
import com.example.transactionmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

        @Autowired
        private UserRepository userRepository;

        public List<UserEntity> getAllUsers() {
            return userRepository.findAll();
        }

        public UserEntity getUserById(Long id) {
            return userRepository.findById(id).orElse(null);
        }

        public UserEntity createUser(UserEntity user) {
            return userRepository.save(user);
        }

        public void deleteUserById(Long id) {
            userRepository.deleteById(id);
        }
}
