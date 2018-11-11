package pl.gameStore.KurastBazaar.dao;

import org.springframework.data.repository.CrudRepository;

import pl.gameStore.KurastBazaar.entities.User;


public interface UserDao extends CrudRepository<User, Integer>
{
}
