package com.ot.onetool.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    Integer uid;
    String  username;
    String password;
    String email;
    String qq;
    String tel;
    Integer isAdmin;
}
