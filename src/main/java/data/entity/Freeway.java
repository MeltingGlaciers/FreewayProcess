package data.entity;

import data.entity.Car;
import data.entity.Crush;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "freeway", schema = "public")
public class Freeway {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private Integer length;

    @OneToMany
    @JoinColumn( name = "car", referencedColumnName = "id")
    List<Car> cars;

    @OneToMany
    @JoinColumn( name = "crush", referencedColumnName = "id")
    List<Crush> crushes;

}
