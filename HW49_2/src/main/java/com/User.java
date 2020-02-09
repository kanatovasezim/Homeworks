package com;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class User {
    private int ID;
    private String login;
    private String password;
    private String email;
    private String gender;
}
