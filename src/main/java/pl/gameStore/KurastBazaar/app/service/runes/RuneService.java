package pl.gameStore.KurastBazaar.app.service.runes;

import pl.gameStore.KurastBazaar.app.entities.Rune;

import java.util.List;

public interface RuneService {
    Rune findBydId(final Long id);

    Rune findBydName(final String name);

    List<Rune> findAll();

    Rune create(final Rune rune);

    void delete(final Long id);

    void deleteByName(final String name);
}
