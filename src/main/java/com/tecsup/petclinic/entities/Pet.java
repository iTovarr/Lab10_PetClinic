package com.tecsup.petclinic.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "pets")
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

    // Constructor vacío requerido por JPA
    public Pet() {
    }

    // Constructor personalizado utilizado en las pruebas
    public Pet(String name, Integer ownerId, Integer typeId) {
        this.name = name;
        this.ownerId = ownerId;
        this.typeId = typeId;
    }

    // --- GETTERS Y SETTERS MANUALES (Adiós errores de compilación) ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ownerId=" + ownerId +
                ", typeId=" + typeId +
                '}';
    }
}