package com.example.pathfinder.models.entities;

import com.example.pathfinder.models.entities.enums.RoleNameEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private RoleNameEnum role;

    public Role() {
    }

    public RoleNameEnum getName() {
        return role;
    }

    public void setName(RoleNameEnum name) {
        this.role = name;
    }
}
