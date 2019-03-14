package com.endava.amcourse.mvc.dao;

import com.endava.amcourse.mvc.model.Gender;
import com.endava.amcourse.mvc.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.endava.amcourse.mvc.model.Gender.FEMALE;
import static com.endava.amcourse.mvc.model.Gender.MALE;


@Component
public class UserDao {

    public static List<User> users = new ArrayList<>(Arrays.asList(
            new User(1, "Ann",20, "123",FEMALE),
            new User(2, "Petru",20, "123", MALE),
            new User(3, "Kate", 20, "123", FEMALE),
            new User(4, "Vasea", 20, "123",MALE)
    ));

    public static User getUserById(int id) {
        for (User u : users) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }


    public static List<User> getUserByGender(Gender gender) {
        return users.stream()
                .filter( u -> u.getGender() == gender)
                .collect(Collectors.toList());
    }

//    boolean validateUser(User user) {
//        return users.getAllUsers().stream()
//                .anyMatch(u -> user.getUsername().equals(u.getUsername()) && user.getPassword().equals(u.getPassword()));
//    }

    public static void addUser(User user) {
        users.add(new User(user.getUsername(),user.getAge(),user.getPassword(),user.getGender()));
    }

    public static List<User> getAllUsers() {
        return users;
    }
}
