package com.nagarro.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nagarro.app.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

