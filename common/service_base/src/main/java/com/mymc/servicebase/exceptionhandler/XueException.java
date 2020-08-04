package com.mymc.servicebase.exceptionhandler;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class XueException extends  RuntimeException{
    private Integer code;
    private String msg;
}
