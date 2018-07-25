package com.template.boot.Model;

import lombok.Data;

import java.util.List;

@Data
public class AjaxResponseBody {

    String msg;

    List<User> result;


}
