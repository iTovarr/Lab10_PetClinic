package com.tecsup.petclinic.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pets")
@Data
@NoArgsConstructor
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "owner_id")
    private Integer ownerId;

    @Column(name = "type_id")
    private Integer typeId;

    // Constructor personalizado para inicializar mascotas rápidamente
    public Pet(String name, Integer ownerId, Integer typeId) {
        this.name    = name;
        this.ownerId = ownerId;
        this.typeId  = typeId;
    }
}