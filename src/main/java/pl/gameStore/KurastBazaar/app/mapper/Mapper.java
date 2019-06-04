package pl.gameStore.KurastBazaar.app.mapper;

import org.mapstruct.factory.Mappers;
import pl.gameStore.KurastBazaar.app.dto.RuneDto;
import pl.gameStore.KurastBazaar.app.entities.Rune;

@org.mapstruct.Mapper
public interface Mapper {
    Mapper INSTANCE = Mappers.getMapper(Mapper.class);

    RuneDto runeDto(Rune rune);
}
