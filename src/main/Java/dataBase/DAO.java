package dataBase;


import entity.UserEntity;

public interface DAO {
    UserEntity getUserById(long userId);
    boolean deleteUserById(UserEntity userEntity);
    boolean createUser(UserEntity userEntity);
    boolean userUpdate (UserEntity userEntity);
}
