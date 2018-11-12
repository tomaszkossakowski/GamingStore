package pl.gameStore.KurastBazaar.app.dao;

import org.springframework.data.repository.CrudRepository;

import pl.gameStore.KurastBazaar.app.entities.User;


public interface UserDao extends CrudRepository<User, Integer>
{
}
