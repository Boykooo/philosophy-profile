package org.aboytsov.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class ProfileViewDto {

    private UUID id;
    private String email;
    private String fullName;
    private String lastName;
}
