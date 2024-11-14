package web.springBoot.repo;

import web.springBoot.model.User;

import java.util.List;

public interface UserRepository {
    void updateUser(User user);

    void deleteUser(int id);

    void saveUser(User user);

    List<User> findAll();

    User findById(int id);
}
