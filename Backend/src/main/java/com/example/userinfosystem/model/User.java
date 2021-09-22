package com.example.userinfosystem.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "user_table")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native", strategy="native")
    private int id;
    @Column(name = "user_name")
    private String username;
    private String password;
    private String hobbies;
    private String nationality;
    @Column(name = "mobile_no")
    private long mobileNo;
    private String gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;
    private String email;
    private String comments;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;


}
