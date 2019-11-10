package service;


import dataBase.DAO;
import dataBase.UseDAO;
import entity.UserEntity;


public class UserService implements Service {
    DAO dao;

    @Override
    public UserEntity getUserByIdService(long userId){
        dao = new UseDAO();
        return dao.getUserById(userId);
    }

    @Override
    public boolean deleteUserByIdService(UserEntity userEntity)  {
        dao = new UseDAO();
        return dao.deleteUserById(userEntity);
    }

    @Override
    public boolean createUser(UserEntity userEntity) {
        dao = new UseDAO();
        return dao.createUser(userEntity);
    }

    @Override
    public boolean userUpdate(UserEntity userEntity) {
        dao = new UseDAO();
        return dao.userUpdate(userEntity);
    }
}
