package com.example.polls.repository;

import com.example.polls.model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findByEmail(String email);

  Optional<User> findByUsernameOrEmail(String usernam, String email);

  List<User> findByIdIn(List<Long> userIds);

  Optional<User> findByUsername(String uesrname);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);
}
