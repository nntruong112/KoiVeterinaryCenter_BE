package com.devteria.identity_service.repository;

import com.devteria.identity_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // cái này là để tương tác với cơ sở dữ liệu
public interface UserRepository extends JpaRepository<User,String > { // Class interface này là nơi tương tác cơ sở dữ liệu

    boolean existsByUsername(String username);
    Optional<User> findByUsername(String username);
}
