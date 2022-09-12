package hello.core.member;

public class MemberServiceImpl implements MemberService {

    //depending on both MemberRepository (interface) and MemoryMemberRepository (implementing class)
    //violating the Dependency Inversion Principle (i.e. "D" of the SOLID principles)
//    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
