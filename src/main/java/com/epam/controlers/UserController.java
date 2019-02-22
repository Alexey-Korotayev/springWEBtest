package com.epam.controlers;

import com.epam.entity.User;
import com.epam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @Autowired
    public UserService userService;

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        model.addAttribute("users",userService.findAll());
        return "usersList";
    }

    @GetMapping("/user/{id}")
    public String getById(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "showUser";
    }

    @GetMapping("/addUser")
    public String createUserPage() {
        return "createUser";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") User user) throws Exception {
        userService.addUser(user);
        return "redirect:/users";
    }

    @PostMapping("/editUser")
    public String updateUser(@ModelAttribute("user") User user) {
        userService.update(user);
        return "redirect:/users";
    }

    @GetMapping("/update/{id}")
    public String editUser(@PathVariable("id") int id,  Model model) {
        model.addAttribute( "user", userService.getUserById(id)) ;
        return "editUser";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        userService.deleteUserById(id);
        return "redirect:/users";
    }

}
