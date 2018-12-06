package com.deives.HelpDesk.api.service.Impl;

import com.deives.HelpDesk.api.entity.User;
import com.deives.HelpDesk.api.repository.UserRepository;
import com.deives.HelpDesk.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User createOrUpdate(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public Optional<User> findyById(String id) {
        return this.userRepository.findById(id);
    }

    @Override
    public void delete(String id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public Page<User> findAll(int page, int count) {
        Pageable pages =  PageRequest.of(page,count);
        return this.userRepository.findAll(pages);
    }
}
