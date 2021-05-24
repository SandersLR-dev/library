package com.library.domain.dto.author;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AuthorDto {

    @NotBlank(message = "Name is mandatory")
    String name;

    @NotBlank(message = "Surname is mandatory")
    String surname;
}