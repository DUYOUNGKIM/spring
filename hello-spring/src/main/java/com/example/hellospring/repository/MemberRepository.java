package com.example.hellospring1.repository;

import com.example.hellospring1.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member>findById(Long id);
    Optional<Member>findByName(String name);
    List<Member>findAll();

}
