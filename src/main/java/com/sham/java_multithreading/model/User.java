package com.sham.java_multithreading.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "S_USER")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private Integer id;

    private String name;
    private String email;
    private String gender;
}
