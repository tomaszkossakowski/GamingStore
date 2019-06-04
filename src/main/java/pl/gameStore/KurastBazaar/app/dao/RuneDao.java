package pl.gameStore.KurastBazaar.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gameStore.KurastBazaar.app.entities.Rune;

public interface RuneDao extends JpaRepository<Rune, Long> {
    Rune findByName(String name);

    void deleteByName(String name);
}
