package com.company.model;


import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@XmlRootElement (name = "person")
public class Person {
    private int id;
    private String name;
    private int year_birth;
    private int gender; // Man - 0, Woman - 1;
    private Date registr_time;
}
