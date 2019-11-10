package service;

import entity.UserEntity;

import java.sql.SQLException;

public interface Service {
    UserEntity getUserByIdService(long userId);
    boolean deleteUserByIdService(UserEntity userEntity);
    boolean createUser(UserEntity userEntity);
    boolean userUpdate (UserEntity userEntity);
}
