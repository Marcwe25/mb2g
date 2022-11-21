package com.mw;


import com.mw.entties.User;
import jaxb.gen.UserModel;

public class UserControler {

    public UserModel getUserModel(User user){
        return UserMap.INSTANCE.userToUserModel(user);
    }
}
