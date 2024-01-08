package com.mysite.sbb.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SiteUser, Long> {

	// Optional : Nullable 자료형
	Optional<SiteUser> findByusername(String username);
}