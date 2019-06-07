package pl.gameStore.KurastBazaar.app.service.runes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gameStore.KurastBazaar.app.dao.RuneDao;
import pl.gameStore.KurastBazaar.app.dto.RuneDto;
import pl.gameStore.KurastBazaar.app.entities.Rune;
import pl.gameStore.KurastBazaar.app.exceptions.InvalidRuneIdException;
import pl.gameStore.KurastBazaar.app.exceptions.InvalidRuneNameException;
import pl.gameStore.KurastBazaar.app.exceptions.RuneAlreadyExistException;
import pl.gameStore.KurastBazaar.app.mapper.Mapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RuneServiceImpl implements RuneService {

    private final RuneDao runeDao;

    @Autowired
    public RuneServiceImpl(final RuneDao runeDao) {
        this.runeDao = runeDao;
    }

    @Override
    public RuneDto findById(final Long id) {
        Optional<Rune> rune = runeDao.findById(id);
        return Mapper.INSTANCE.runeDto(rune.orElseThrow(InvalidRuneIdException::new));

    }

    @Override
    public RuneDto findByName(final String name) {
        Optional<Rune> rune = Optional.ofNullable(runeDao.findByName(name));
        if (rune.isPresent()) {
            return Mapper.INSTANCE.runeDto(runeDao.findByName(name));
        } else {
            throw new RuneAlreadyExistException();
        }
    }

    @Override
    public List<RuneDto> findAll() {
//
//        List<Rune> asd = runeDao.findAll();
//        for (Rune rune : asd) {
//            System.out.println(rune.getSource());
//        }
//
//        List<RuneDto> asdd = runeDao.findAll()
//                .stream()
//                .map(Mapper.INSTANCE::runeDto)
//                .collect(Collectors.toList());
//        for (RuneDto runeDto : asdd) {
//            System.out.println(runeDto.getSource());
//        }
        return runeDao.findAll()
                .stream()
                .map(Mapper.INSTANCE::runeDto)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(final Long id) {
        Optional<Rune> rune = runeDao.findById(id);
        if (rune.isPresent())
            runeDao.deleteById(id);
        else {
            throw new InvalidRuneIdException();
        }
    }

    @Override
    public void deleteByName(final String name) {
        Rune rune = runeDao.findByName(name);
        if (!rune.getName().isEmpty()) {
            runeDao.deleteByName(name);
        } else {
            throw new InvalidRuneNameException();
        }
    }

    @Override
    public RuneDto create(final Rune rune) {
        return Mapper.INSTANCE.runeDto(runeDao.save(rune));
    }
}