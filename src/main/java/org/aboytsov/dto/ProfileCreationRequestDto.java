package org.aboytsov.dto;

import lombok.Data;

@Data
public class ProfileCreationRequestDto {

    private String email;
    private String firstName;
    private String lastName;
}
