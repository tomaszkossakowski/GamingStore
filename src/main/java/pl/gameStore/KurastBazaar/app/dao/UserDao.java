package pl.gameStore.KurastBazaar.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gameStore.KurastBazaar.app.entities.User;


public interface UserDao extends JpaRepository<User, Integer> {
}
