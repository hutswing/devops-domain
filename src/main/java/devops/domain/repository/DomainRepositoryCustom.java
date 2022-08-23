package devops.domain.repository;

import devops.domain.dto.DomainDto;
import devops.domain.dto.DomainSearchCondition;

import java.util.List;

public interface DomainRepositoryCustom {
    List<DomainDto> search(DomainSearchCondition condition);
}
