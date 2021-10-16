package com.example.pathfinder.models.entities;

import com.example.pathfinder.models.entities.enums.LevelEnum;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity{

    @Column(nullable = false, name = "full_name")
    private String fullName;

    @Column(nullable = false)
    private String username;

    @Column(name = "age")
    private Integer age;

    @Column(nullable = false)
    private String password;

    @Column()
    private String email;

    @Enumerated(EnumType.STRING)
    private LevelEnum level;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable( name = "users_roles",
                joinColumns = @JoinColumn(name = "user_entity_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "roles_id", referencedColumnName = "id"))
    private Set<Role> roles;


    public User() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
