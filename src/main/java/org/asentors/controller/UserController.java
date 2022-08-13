package org.asentors.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.asentors.model.User;
import org.asentors.service.UserService;


@Controller
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("")
    public String usersList( ModelMap model) {
        model.addAttribute("usersList",userService.getAllUsers());
        model.addAttribute("userModel",new User());
        return "usersPage";
    }
    @PostMapping("/addUser")
    public  String addUser(@ModelAttribute User usr) {
        userService.create(usr);
        return "redirect:/";
    }
    @PostMapping("/delete")
    public  String deleteUser(@ModelAttribute User usr) {
        userService.delete(usr);
        return "redirect:/";
    }
    @PostMapping("/update")
    public  String updateUser(@ModelAttribute User usr) {
        userService.update(usr);
        return "redirect:/";
    }
}