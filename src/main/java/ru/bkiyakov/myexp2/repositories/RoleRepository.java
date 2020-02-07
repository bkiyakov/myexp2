package ru.bkiyakov.myexp2.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.bkiyakov.myexp2.models.Role;

public interface RoleRepository extends MongoRepository<Role, Long> {
}
