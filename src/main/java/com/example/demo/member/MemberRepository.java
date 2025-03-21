package com.example.demo.member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// allows us to interact with the Member database
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByName(String name); // retrieves member by their name
}
