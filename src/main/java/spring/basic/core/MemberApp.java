package spring.basic.core;

import spring.basic.core.member.Grade;
import spring.basic.core.member.Member;
import spring.basic.core.member.MemberService;
import spring.basic.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member memberA = new Member(1L, "memberA Name", Grade.VIP);
        memberService.join(memberA);

        Member findMember = memberService.findMember(memberA.getId());
        System.out.println("new Member = "+ memberA.getName());
        System.out.println("new find Member = "+ findMember.getName());

    }
}
