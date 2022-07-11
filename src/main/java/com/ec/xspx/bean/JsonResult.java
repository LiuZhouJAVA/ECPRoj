package com.ec.xspx.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JsonResult<E>
{
    private int code;   //接口状态码

    private String message;   //接口返回消息

    private E content;  //响应内容
}
