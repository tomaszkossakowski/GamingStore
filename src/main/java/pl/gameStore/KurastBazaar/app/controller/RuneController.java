package pl.gameStore.KurastBazaar.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.gameStore.KurastBazaar.app.service.runes.RuneService;

@RestController
@RequestMapping("/rune")
public class RuneController {

    private final RuneService runeService;

    @Autowired
    public RuneController(RuneService runeService) {
        this.runeService = runeService;
    }


}
