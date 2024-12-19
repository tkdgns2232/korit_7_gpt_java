package com.korit.main;

import com.korit.controller.UserController;
import com.korit.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserController userController = new UserController(userService);
        userController.signUp();
        userController.signIn();
        
    }
}
