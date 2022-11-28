package ru.malyshev.renderfarm.service;

import ru.malyshev.renderfarm.model.User;

import java.util.List;

public interface UserService {

    User register(User user);

    User findByUsername(String username);
}
