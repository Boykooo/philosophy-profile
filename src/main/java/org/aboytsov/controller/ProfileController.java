package org.aboytsov.controller;

import lombok.RequiredArgsConstructor;
import org.aboytsov.dto.ProfileCreationRequestDto;
import org.aboytsov.dto.ProfileViewDto;
import org.aboytsov.service.ProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/profiles")
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping("/{id}")
    public ProfileViewDto getById(@PathVariable UUID id) {
        ProfileViewDto profileViewDto = profileService.getById(id);
        return profileViewDto;
    }

    @PostMapping
    public UUID create(@RequestBody ProfileCreationRequestDto profileCreationRequest) {
        UUID id = profileService.create(profileCreationRequest);
        return id;
    }

}
