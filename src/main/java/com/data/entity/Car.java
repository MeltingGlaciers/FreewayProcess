package com.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "car", schema = "public")
public class Car {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private Integer status;

    @Column(name = "init_speed")
    private Integer initSpeed;

    @ManyToOne
    @JoinColumn(name = "crush_id", referencedColumnName = "id")
    private Crush crush;

    @ManyToOne
    @JoinColumn(name = "freeway_id", referencedColumnName = "id")
    private Freeway freeway;

}
