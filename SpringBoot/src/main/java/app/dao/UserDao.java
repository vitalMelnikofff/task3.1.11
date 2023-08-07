package app.dao;

import app.model.User;

import java.util.List;

public  interface UserDao {

    List<User> getAllUsers();

    void addUser(User user);

    User getUser(int id);

    void updateUser(User user);

    void deleteUser(User user);
}