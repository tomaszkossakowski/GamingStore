package pl.gameStore.KurastBazaar.app.service.runes;

import pl.gameStore.KurastBazaar.app.dto.RuneDto;
import pl.gameStore.KurastBazaar.app.entities.Rune;

import java.util.List;

public interface RuneService {
    RuneDto findById(final Long id);

    RuneDto findByName(final String name);

    List<RuneDto> findAll();

    RuneDto create(final Rune rune);

    void delete(final Long id);

    void deleteByName(final String name);
}
