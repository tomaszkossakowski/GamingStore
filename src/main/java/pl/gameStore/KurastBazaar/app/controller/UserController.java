package pl.gameStore.KurastBazaar.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.gameStore.KurastBazaar.app.service.UserService;
import pl.gameStore.KurastBazaar.app.entities.User;


@RestController
@RequestMapping("/kurastBazaar/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user)
    {
        return userService.createUser(user);
    }

    @GetMapping("/user/{userId}")
    public Optional<User> getUserById(@PathVariable("userId") Integer userId)
    {
        return userService.getUserById(userId);
    }

    @GetMapping("user/allusers")
    public Iterable<User>getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/user/{userId}")
    public void deleteTicket(@PathVariable("userId")Integer userId){
        userService.deleteUser(userId);
    }

//    @PutMapping("/user/{userId}/{newEmail:.+}")
//    public User updateUser(@PathVariable("userId")Integer userId,@PathVariable("newEmail")String newEmail){
//        return userService.updateUser(userId,newEmail);
//    }
}
