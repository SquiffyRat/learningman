package com.quiz.learningman.service;

import com.quiz.learningman.entity.Member;
import com.quiz.learningman.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {
    private final MemberRepository memberRepository;

    private void checkDuplicateMember(Member member) {
        Member checkMember = memberRepository.findByEmail(member.getEmail());
        if (checkMember != null) {
            throw new IllegalStateException("이미 가입한 회원입니다.");
        }
    }

    public Member saveMember(Member member) {
        checkDuplicateMember(member);

        return memberRepository.save(member);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Member member = memberRepository.findByEmail(email);

        // 일치하는 email이 없을 경우 예외
        if (member == null) {
            throw new UsernameNotFoundException(email);
        }

        return User.builder().username(member.getEmail())
                .password(member.getPassword())
                .roles(member.getRole().toString())
                .build();
    }
}
