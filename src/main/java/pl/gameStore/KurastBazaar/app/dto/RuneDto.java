package pl.gameStore.KurastBazaar.app.dto;

import lombok.Data;

@Data
public class RuneDto {
    private String name;
    private int minimumLvl;
    private String weaponBuff;
    private String shieldBuff;
    private String armourBuff;
    private String source;
}
