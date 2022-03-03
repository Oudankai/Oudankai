package io.getarrays.userservice01.service;

import io.getarrays.userservice01.domain.Role;
import io.getarrays.userservice01.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String userName, String roleName);
    User getUser(String userName);
    List<User> getUsers();
}
