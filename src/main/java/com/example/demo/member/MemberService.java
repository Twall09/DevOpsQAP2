package com.example.demo.member;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // saves or updates member in the database
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    // retrieves all members
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
