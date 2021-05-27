package data.entity;

import data.entity.Car;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "crush", schema = "public")
public class Crush {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private Date date;

    @Column( name = "crush_position")
    private Integer crushPosition;

    @OneToMany
    @JoinColumn( name = "car", referencedColumnName = "id")
    private List<Car> crushMembers;

}
