package pl.gameStore.KurastBazaar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import pl.gameStore.KurastBazaar.entities.User;
import pl.gameStore.KurastBazaar.service.UserService;


@SpringBootApplication
public class KurastBazaarApplication
{
    public static void main(String[] args)
    {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(KurastBazaarApplication.class, args);

        UserService userService = applicationContext.getBean("userService", UserService.class);
        User user = new User();
        user.setEmail("mail@test");
        userService.createUser(user);
    }
}
