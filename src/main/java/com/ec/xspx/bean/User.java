package com.ec.xspx.bean;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor//我运行时缺少无参构造会报错
public class User {

    private int userId;
    private String userName;
    private String userPassword;




}
