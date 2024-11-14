package web.springBoot.service;

import web.springBoot.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    void update(User user);

    void delete(int id);

    List<User> findAll();

    User findById(int id);
}
