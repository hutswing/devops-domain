package devops.domain.repository;

import devops.domain.entity.Domain;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class DomainRepositoryTest {

    @Autowired
    DomainRepository domainRepository;

    @Test
    @DisplayName("Domain Entity insert 테스트")
    public void insertTest() {
        String domainName = "naver.com";
        Domain domain = Domain
                .builder()
                .name(domainName)
                .build();
        domainRepository.save(domain);

        Domain findDomain = domainRepository.findByName(domainName);

        assertEquals(domainName, findDomain.getName());

    }

}