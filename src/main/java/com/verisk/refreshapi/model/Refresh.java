package com.verisk.refreshapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Refresh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date date;

    @Column(unique = true)
    private int attempsNumber;

    @Column(unique = true)
    private State state;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Environment environment;

    @PrePersist
    protected void onCreate() {
        if(attempsNumber == 1){
            setState(State.Done);
        }
        else{
            setState(State.Testing);
        }
    }
}
