package com.pinkong.portal.repository;

import com.pinkong.portal.domain.MemberBrandAttention;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 会员关注Repository
 * Created by pinkong on 2018/8/2.
 */
public interface MemberBrandAttentionRepository extends MongoRepository<MemberBrandAttention,String> {
    MemberBrandAttention findByMemberIdAndBrandId(Long memberId, Long brandId);
    int deleteByMemberIdAndBrandId(Long memberId,Long brandId);
    Page<MemberBrandAttention> findByMemberId(Long memberId, Pageable pageable);
    void deleteAllByMemberId(Long memberId);
}
