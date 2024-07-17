package org.aboytsov.mapper;

import org.aboytsov.dto.ProfileCreationRequestDto;
import org.aboytsov.dto.ProfileViewDto;
import org.aboytsov.entity.Profile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {

    Profile toEntity(ProfileCreationRequestDto profileCreationRequestDto);

    ProfileViewDto toViewDto(Profile profile);
    
}
