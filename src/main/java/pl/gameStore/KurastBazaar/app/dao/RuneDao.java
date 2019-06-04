package pl.gameStore.KurastBazaar.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import pl.gameStore.KurastBazaar.app.entities.Rune;

public interface RuneDao extends JpaRepository<Rune, Long> {
    Rune findByName(String name);

    @Transactional
    void deleteByName(String name);
}
