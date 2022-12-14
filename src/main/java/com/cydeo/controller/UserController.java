package com.cydeo.controller;


import com.cydeo.enums.State;
import com.cydeo.model.User;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String allUsers(Model model){

        model.addAttribute("users",userService.findAllUsers() );

        return "/user/register-page";

    }

    @GetMapping("/create-page")
    public String addUserButton(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("states", State.values());
        return "/user/create-page";
    }

    @PostMapping("/create")
    public String submitFormButton(@ModelAttribute("user") User user){

        userService.save(user);

        return "redirect:/user/register";

    }







}
