package com.endava.amcourse.mvc.service;

import com.endava.amcourse.mvc.dao.UserDao;
import com.endava.amcourse.mvc.model.Gender;
import com.endava.amcourse.mvc.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

   // private final UserDao userDao;

    public static List<User> getUsersByGender(Gender gender) {
        return UserDao.getUserByGender(gender);
    }

    public static void addUser(User user) {
        UserDao.addUser(new User(user.getUsername(),user.getAge(),user.getPassword(),user.getGender()));
    }

    boolean validateUser(UserDao userDao) {
        return false;
    }

    public static List<User> getAllUsers() {
        return UserDao.getAllUsers();
    }
}
