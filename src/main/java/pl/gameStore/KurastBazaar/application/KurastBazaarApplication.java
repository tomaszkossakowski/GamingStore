package pl.gameStore.KurastBazaar.application;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pl.gameStore.KurastBazaar.entities.User;
import pl.gameStore.KurastBazaar.service.UserService;


@SpringBootApplication
public class KurastBazaarApplication implements CommandLineRunner
{
    @Autowired
    private UserService userService;

    @Autowired
    private DataSource dataSource;

    public static void main(String[] args)
    {
        SpringApplication.run(KurastBazaarApplication.class, args);
    }

    @Override
    public void run(final String... args) throws Exception
    {
        User user = new User();

        user.setUserName("test");
        user.setUserLogin("login");
        user.setPassword("pass");
        user.setUserInfo("info");
        user.setEmail("mail@test");
        user.setCreationDate(null);
        user.setDeleted(null);
        user.setPasswordChanged(false);

        userService.createUser(user);
        System.out.println("DataSource::" + dataSource);
    }
}
