package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    @Override
    Optional<Member> findByName(String name);
    //findBy?
    //JPQL : select m from Member m where m.name = ? 을 이렇게 짜줌
    //이게 SQL로 번역되어 실행됨
}
