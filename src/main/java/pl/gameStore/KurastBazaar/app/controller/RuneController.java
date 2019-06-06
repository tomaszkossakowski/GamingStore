package pl.gameStore.KurastBazaar.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.gameStore.KurastBazaar.app.dto.RuneDto;
import pl.gameStore.KurastBazaar.app.entities.Rune;
import pl.gameStore.KurastBazaar.app.service.runes.RuneService;

@Controller
@RequestMapping("/rune")
public class RuneController {

    private final RuneService runeService;

    @Autowired
    public RuneController(RuneService runeService) {
        this.runeService = runeService;
    }

    @GetMapping("")
    public String showAllPlayers(final Model model) {
        if (runeService.findAll().isEmpty()) {
            runeService.findAll();
        }
        model.addAttribute("runes", runeService.findAll());
        return "/rune";
    }

    @GetMapping("findById/{id}")
    @ResponseBody
    public RuneDto findById(@PathVariable final Long id) {
        return runeService.findById(id);
    }

    @GetMapping("findByName/{name}")
    @ResponseBody

    public RuneDto findByName(@PathVariable final String name) {
        return runeService.findByName(name);
    }

    @PostMapping("/create")
    @ResponseBody
    public RuneDto createRune(@RequestBody final Rune rune) {
        return runeService.create(rune);
    }

    @DeleteMapping("/deleteRuneById/{id}")
    @ResponseBody
    public String deleteRuneById(@PathVariable Long id) {
        RuneDto rune = runeService.findById(id);
        runeService.delete(id);
        return "pomyslnie usunieto rune " + rune.getName();
    }

    @DeleteMapping("/deleteRuneByName/{name}")
    @ResponseBody
    public String deleteRuneByName(@PathVariable String name) {
        RuneDto rune = runeService.findByName(name);
        runeService.deleteByName(name);
        return "pomyslnie usunieto rune " + rune.getName();
    }

}
