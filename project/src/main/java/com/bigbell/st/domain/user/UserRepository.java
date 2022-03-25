package com.bigbell.st.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);

	boolean existsByUsername(String username);

	boolean existsByEmail(String email);

}
