package com.deives.HelpDesk.api.repository;
import com.deives.HelpDesk.api.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String>{
    User findByEmail(String email);

}