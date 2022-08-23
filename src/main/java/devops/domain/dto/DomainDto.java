package devops.domain.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class DomainDto {
    private String name;
    private LocalDateTime domainCreatedDate;
    private LocalDateTime domainExpiredDate;
    private LocalDateTime domainModifiedDate;

    @QueryProjection
    public DomainDto(String name, LocalDateTime domainCreatedDate, LocalDateTime domainExpiredDate, LocalDateTime domainModifiedDate) {
        this.name = name;
        this.domainCreatedDate = domainCreatedDate;
        this.domainExpiredDate = domainExpiredDate;
        this.domainModifiedDate = domainModifiedDate;
    }
}
