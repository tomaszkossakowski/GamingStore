package pl.gameStore.KurastBazaar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import pl.gameStore.KurastBazaar.entities.User;
import pl.gameStore.KurastBazaar.service.UserService;


@RestController
@RequestMapping("/kurastbazaar/user")
@RequiredArgsConstructor
public class UserController
{
    @Autowired
    private UserService userService;

    @PostMapping("/createuser")
    public User createUser(User user)
    {
        return userService.createUser(user);
    }

    @GetMapping("/user/{userId}")
    public User getUserById(@PathVariable("userId") Integer userId)
    {
       return userService.getUserById(userId);
    }
}
