package devops.domain.service;

import devops.domain.repository.DomainRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DomainService {

    private final DomainRepository domainRepository;


}
