package org.aboytsov.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aboytsov.dto.ProfileCreationRequestDto;
import org.aboytsov.dto.ProfileViewDto;
import org.aboytsov.entity.Profile;
import org.aboytsov.mapper.ProfileMapper;
import org.aboytsov.repository.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProfileService {

    private final ProfileRepository profileRepository;
    private final ProfileMapper profileMapper;

    public ProfileViewDto getById(UUID id) {
        Profile profile = profileRepository.findById(id).orElseThrow(RuntimeException::new);
        return profileMapper.toViewDto(profile);
    }

    public UUID create(ProfileCreationRequestDto profileCreationRequest) {
        Profile profile = profileMapper.toEntity(profileCreationRequest);
        return profileRepository.save(profile).getId();
    }

}
