package dev.user.register.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="users")
@Getter
@Setter
@Service
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //it will populate db generated ID thats not mean auto incemental. it just whats db has return put it.
    private  Long id;

    private String fullName;

    private String password;

    private boolean active;

    //by default for many to many fetchtype is lazy. for one to one eager
    @ManyToMany(fetch = FetchType.EAGER) //here eager is fine because might be less roles or we need every time roles with user
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id" , referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private List<Role> roles;

    private String email;



}
