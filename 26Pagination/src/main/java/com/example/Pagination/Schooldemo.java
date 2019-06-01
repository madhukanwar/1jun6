package com.example.Pagination;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Schooldemo {

    @Id
    @GeneratedValue
    public int id;
    public String name;
    public String age;

}
