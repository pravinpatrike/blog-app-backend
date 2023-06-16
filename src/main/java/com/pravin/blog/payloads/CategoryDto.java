package com.pravin.blog.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

    private Integer categoryId;

    @NotBlank
    @Size(min = 4,max = 10)
    private String categoryTitle;

    @NotBlank
    @Size(min = 10,max = 200)
    private String categoryDescription;
}
