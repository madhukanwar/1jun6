package com.example.Validation;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Register {

    public int id;
    @NotEmpty(message = "name can not empty")
    public String name;
    @NotEmpty(message = "age can not empty")
    public String age;
}
