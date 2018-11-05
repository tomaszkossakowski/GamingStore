package pl.gameStore.KurastBazaar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController
{
    @GetMapping("/")
    @ResponseBody
    public String test (){
        return "Hello world";
    }
}
