package pl.gameStore.KurastBazaar.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.gameStore.KurastBazaar.app.dao.UserDao;
import pl.gameStore.KurastBazaar.app.entities.User;

@Service
public class UserService
{
    @Autowired
    private UserDao userDao;

    public User createUser(User user)
    {
        return userDao.save(user);
    }

    public User getUserById(final Integer userId)
    {
        return userDao.findOne(userId);
    }

    public Iterable<User> getAllUsers()
    {
        return userDao.findAll();
    }

    public void deleteUser(final Integer userId)
    {
        userDao.delete(userId);
    }

    public User updateUser(final Integer userId, final String newEmail)
    {
        User userFromDb = userDao.findOne(userId);
        userFromDb.setEmail(newEmail);
        return userDao.save(userFromDb);
    }
}

