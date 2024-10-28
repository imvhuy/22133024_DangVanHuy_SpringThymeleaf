package com.javaweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer categoryId;
    private String categoryName;
    private Boolean isEdit = false;



}
