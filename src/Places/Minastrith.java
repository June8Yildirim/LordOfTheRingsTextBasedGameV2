package Places;

import Enemy.*;
import Weapon.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static Places.PlaceBase.wrapText;

public class Minastrith implements IPlace{
    private String desc;
    private PlaceBase.PLACENAME type;
    private int difficulties;
    private String Name;
    private List<IEnemy> enemies;
    private List<IWeapon> placeWeapons;


    public Minastrith() {
        this.difficulties = 15;
        this.Name =  "Minastrith";
        this.type = PlaceBase.PLACENAME.MINASTRITH;
        this.desc = wrapText("The Southern counterpart to Arnor. Gondor was ruled by Elendil and his two sons until the War of the Last Alliance, when Elendil and Anarion were killed and Isildur became the high king of both kingdoms. The kingship lasted until the year 2050 of the Third Age, when the last king rode out to meet the challenge of the Witch-King of Angmar and was never seen again. After this stewards ruled until Aragorn took back the kingship of both Arnor and Gondor. Gondor had three main cities and several smaller ones. The main cities were Minas Anor (Minas Tirith), Minas Ithil (Minas Morgul), and Osgiliath.");
        this.enemies = new ArrayList<>();
        this.placeWeapons = new ArrayList<>();
        this.placeWeapons.add(new Narsil());
        this.placeWeapons.add(new OneRing());
        this.placeWeapons.add(new Ringil());
        this.placeWeapons.add(new Glamdring());

    }
    @Override
    public PlaceBase.PLACENAME getType() {
        return PlaceBase.PLACENAME.MINASTRITH;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public int getDifficulties() {
        return this.difficulties;
    }

    @Override
    public List<IWeapon> getWeapons() {
        return this.placeWeapons;
    }

    @Override
    public List<IEnemy> getEnemies() {
        this.enemies.add(new Nazgul());
        this.enemies.add(new Sauron());
        this.enemies.add(new Angmar());
        this.enemies.add(new Shelob());
        this.enemies.add(new Dragon());
        this.enemies.add(new Orch());
        this.enemies.add(new Troll());
        this.enemies.add(new Uruk_Hai());
        return this.enemies;
    }


    @Override
    public String getDescription() {
        return this.desc;    }

    @Override
    public Map<String, Integer> getExits() {
        return null;
    }

}
