package spring.basic.core.member;

public class MemberServiceImpl implements MemberService{

    // 인터페이스를 의존 하지만 구현 클래스도 의존 하고 있다.
    // DIP 위반
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
