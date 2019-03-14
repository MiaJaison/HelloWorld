package com.endava.amcourse.mvc.controller;

import com.endava.amcourse.mvc.model.User;
import com.endava.amcourse.mvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import static com.endava.amcourse.mvc.dao.UserDao.*;

@Controller
@RequestMapping(value = "/")
public class HelloController {


    @RequestMapping(value = {"/", "/login"}, method =RequestMethod.GET)
    public String showLoginPage() {
        return "login";
    }

    @RequestMapping(value = "/error", method =RequestMethod.GET)
    public String loginErrorHandler(Model model){
        model.addAttribute("error", "Login or Password are invalid");
        return "login";
    }

    @RequestMapping(value = "/register", method =RequestMethod.GET)
    public String showRegisterPage(@ModelAttribute("user") User user) {
        return "register";
    }

    @RequestMapping(value = "/register", method =RequestMethod.POST)
    public String takeRegisterValues(@ModelAttribute("user") User user) {
        UserService.addUser(user);
        return "redirect:/show-users";
    }


//    @RequestMapping(value = "/model-and-view", method = RequestMethod.GET)
//    public ModelAndView printWelcome() {
//        return new ModelAndView("hello", "message", "Hello model and view!");
//    }


    @RequestMapping(value = "/show-users", method = RequestMethod.GET)
    public String showUsers(Model model) {
        model.addAttribute("userList", users);
        return "users";
    }

    @RequestMapping(value = "/show-user/by-id/{id}", method = RequestMethod.GET)
    public String showUserById(Model model, @PathVariable(name = "id") int id) {
        model.addAttribute("userById", getUserById(id));
        model.addAttribute("userList", users);
        return "users";
    }
}