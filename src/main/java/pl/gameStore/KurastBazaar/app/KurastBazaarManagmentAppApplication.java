package pl.gameStore.KurastBazaar.app;

import java.time.ZonedDateTime;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pl.gameStore.KurastBazaar.app.entities.User;
import pl.gameStore.KurastBazaar.app.service.UserService;

@SpringBootApplication
public class KurastBazaarManagmentAppApplication implements CommandLineRunner
{
    @Autowired
    private UserService userService;

    @Autowired
    private DataSource dataSource;

    public static void main(String[] args)
    {
        SpringApplication.run(KurastBazaarManagmentAppApplication.class, args);
    }

    @Override
    public void run(final String... args)
    {
        User user = new User();

        user.setUserName("test");
        user.setUserLogin("login");
        user.setPassword("password");
        user.setUserInfo("information");
        user.setEmail("email@email.pl");
        user.setCreationDate(ZonedDateTime.now());
        user.setDeleted(null);
        user.setPasswordChanged(false);


        userService.createUser(user);
        System.out.println("DataSource::" + dataSource);
    }
}
