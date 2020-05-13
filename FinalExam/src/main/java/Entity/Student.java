package Entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
// студентов (id, ФИО, курс, дата регистрации, сумма контракта)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    String name;

    @Column
    Course course;

    @CreatedDate
    @Column
    Date date_registration;

    @Column
    Long contract;


}
