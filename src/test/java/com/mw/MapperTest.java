package com.mw;


import org.mapstruct.factory.Mappers;

public class MapperTest {

    public void testMapper(User user){
        User marc = User.builder().build();
        UserDTO user2 = UserToDTO.mapper.userToUserDTO(marc);
        System.out.println(user != null);
    }
}
