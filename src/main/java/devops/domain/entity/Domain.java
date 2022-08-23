package devops.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "name", "domainExpiredDate"})
@Builder(toBuilder = true)
public class Domain extends BaseTimeEntity {

    @Id @GeneratedValue
    private long id;
    private String name;
    private LocalDateTime domainCreatedDate;
    private LocalDateTime domainExpiredDate;
    private LocalDateTime domainModifiedDate;

}
