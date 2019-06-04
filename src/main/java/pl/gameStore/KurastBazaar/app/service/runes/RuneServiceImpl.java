package pl.gameStore.KurastBazaar.app.service.runes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gameStore.KurastBazaar.app.dao.RuneDao;
import pl.gameStore.KurastBazaar.app.entities.Rune;
import pl.gameStore.KurastBazaar.app.exceptions.InvalidRuneIdException;
import pl.gameStore.KurastBazaar.app.exceptions.InvalidRuneNameException;
import pl.gameStore.KurastBazaar.app.exceptions.RuneAlreadyExistException;

import java.util.List;
import java.util.Optional;
@Service
public class RuneServiceImpl implements RuneService {

    private  final RuneDao runeDao;

    @Autowired
    public RuneServiceImpl(final RuneDao runeDao) {
        this.runeDao = runeDao;
    }

    @Override
    public Rune findBydId(final Long id) {
        Optional<Rune> rune = runeDao.findById(id);
        return rune.orElseThrow(InvalidRuneIdException::new);

    }

    @Override
    public Rune findBydName(final String name) {
        Rune rune = runeDao.findByName(name);
        if (!rune.getName().isEmpty()) {
            return rune;
        } else throw new InvalidRuneNameException();

    }

    @Override
    public List<Rune> findAll() {
        return runeDao.findAll();
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
    public Rune create(final Rune rune) {
        if (!rune.getName().equals(runeDao.findByName(rune.getName()))) {
            return runeDao.save(rune);

        } else throw new RuneAlreadyExistException();
    }
}