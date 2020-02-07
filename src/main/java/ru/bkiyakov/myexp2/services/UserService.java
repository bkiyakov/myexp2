package ru.bkiyakov.myexp2.services;

import org.springframework.stereotype.Service;
import ru.bkiyakov.myexp2.models.User;

import java.util.List;

@Service
public interface UserService {
    List<User> findAll();
    User findById(Long id);
    User findByUsername(String username);
    boolean save(User user);
    boolean delete(Long userId);
}
