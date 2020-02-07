package ru.bkiyakov.myexp2.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.bkiyakov.myexp2.models.User;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, Long> {
    User findByUsername(String username);
}
