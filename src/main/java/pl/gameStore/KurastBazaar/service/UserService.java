package pl.gameStore.KurastBazaar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.gameStore.KurastBazaar.dao.UserDao;
import pl.gameStore.KurastBazaar.entities.User;


@Service
public class UserService
{
    @Autowired
    private UserDao userDao;

    public User createUser(User user)
    {
        return userDao.save(user);
    }

    public Optional<User> getUserById(final Integer userId)
    {
        return userDao.findById(userId);
    }

    public Iterable<User> getAllUsers()
    {
        return userDao.findAll();
    }

    public void deleteUser(final Integer userId)
    {
        userDao.deleteById(userId);
    }
//
//    public User updateUser(final Integer userId, final String newEmail)
//    {
//        Optional<User> userFromDb = userDao.findById(userId);
//        userFromDb.orElse().setEmail();
//        User updateUser = userDao.save(userFromDb);
//        return updateUser;
//    }
}

