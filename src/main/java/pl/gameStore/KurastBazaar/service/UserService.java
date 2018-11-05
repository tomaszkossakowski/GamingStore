package pl.gameStore.KurastBazaar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.gameStore.KurastBazaar.dao.UserDao;
import pl.gameStore.KurastBazaar.entities.User;


@Service
public class UserService
{
    @Autowired
    private UserDao userDao;
    public User createUser(final User user)
    {
        return userDao.save(user);
    }

    public User getUserById(final Integer userId)
    {
        return userDao.findOne(userId);
    }
}
