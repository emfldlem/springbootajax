package com.template.boot.Model;

import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
public class SearchCriteria {

    @NotBlank(message = "username can't empty!")
    String username;
}
