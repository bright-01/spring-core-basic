package spring.basic.core.order;

import spring.basic.core.discount.DiscountPolicy;
import spring.basic.core.discount.FixDiscountPolicy;
import spring.basic.core.member.Member;
import spring.basic.core.member.MemberService;
import spring.basic.core.member.MemberServiceImpl;

public class OrderServiceImpl implements OrderService{
    private final MemberService memberService = new MemberServiceImpl();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberService.findMember(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
