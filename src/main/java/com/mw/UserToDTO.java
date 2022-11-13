package com.mw;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserToDTO {

    UserToDTO mapper = Mappers.getMapper(UserToDTO.class);

    @Mapping(source = "name", target = "name")
    UserDTO userToUserDTO(User user);
}
