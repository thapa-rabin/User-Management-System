package com.example.userinfosystem.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "address_table")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native", strategy="native")
    private int id;
    @Column(name = "city_name")
    private String cityName;
    @Column(name = "country_name")
    private String countryName;
}
