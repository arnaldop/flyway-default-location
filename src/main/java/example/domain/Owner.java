package example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Owner {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int ownerAge;

}
