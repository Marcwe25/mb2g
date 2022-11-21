package com.mw;

import com.mw.entties.User;
import jaxb.gen.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMap {

    UserMap INSTANCE = Mappers.getMapper(UserMap.class);

    UserModel userToUserModel(User user);

    User userModelToUser(UserModel user);
}
