package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberSerivce memberSerivce = new MemberServiceImpl();
    @Test
    void join(){
        //given ~주어지고
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when ~할 때
        memberSerivce.join(member);
        Member findMember = memberSerivce.findMember(1L);

        //then ~게 된다.
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
