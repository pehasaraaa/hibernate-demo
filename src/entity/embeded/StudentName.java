package entity.embeded;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Embeddable
public class StudentName {
    @Column(name = "first_name", length = 100, nullable = false)
    private String fName;
    @Column(name = "last_name", length = 100, nullable = false)
    private String lName;
}