package pl.gameStore.KurastBazaar.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.gameStore.KurastBazaar.entities.User;


@Repository
public interface UserDao extends CrudRepository<User, Integer>
{
    User findOne(Integer userId);
}
