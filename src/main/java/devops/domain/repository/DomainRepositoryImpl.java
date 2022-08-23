package devops.domain.repository;

import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import devops.domain.dto.DomainDto;
import devops.domain.dto.DomainSearchCondition;
import devops.domain.dto.QDomainDto;
import devops.domain.entity.Domain;
import devops.domain.entity.QDomain;

import javax.persistence.EntityManager;
import java.util.List;

import static org.springframework.util.StringUtils.hasText;
import static devops.domain.entity.QDomain.domain;

public class DomainRepositoryImpl implements DomainRepositoryCustom{

    private final JPAQueryFactory queryFactory;

    public DomainRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<DomainDto> search(DomainSearchCondition condition) {
        return queryFactory
                .select(new QDomainDto(domain.name, domain.domainCreatedDate, domain.domainExpiredDate, domain.domainModifiedDate))
                .from(domain)
                .fetch();
    }

//    @Override
//    public List<DomainDto> search(DomainSearchCondition condition) {
//        return queryFactory
//                .select(Projections.bean(DomainDto.class,
//                        domain.name,
//                        domain.domainCreatedDate,
//                        domain.domainExpiredDate,
//                        domain.domainModifiedDate ))
//                .from(domain)
//                .fetch();
//    }


    private BooleanExpression nameEq(String name) {
        return hasText(name) ? domain.name.eq(name) : null;
    }
}
