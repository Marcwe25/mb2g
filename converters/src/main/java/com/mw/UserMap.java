package com.mw;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMap {

    UserMap mapper = Mappers.getMapper(UserMap.class);

    //@Mapping(source = "email", target = "email")
    //UserModel userToUserDTO(User user);
}
