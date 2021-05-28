package com.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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
    @JoinColumn( name = "freeway_id", referencedColumnName = "id")
    List<Car> cars;

    @OneToMany
    @JoinColumn( name = "freeway_id", referencedColumnName = "id")
    List<Crush> crushes;

}
