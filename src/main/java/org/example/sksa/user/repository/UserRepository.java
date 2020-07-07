package org.example.sksa.user.repository;

import org.example.sksa.user.entity.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends JpaSpecificationExecutor<User>, CrudRepository<User,Long> {
    List<User> findByName(String name);
}
