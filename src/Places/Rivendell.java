package Places;

import Enemy.*;
import Weapon.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static Places.PlaceBase.wrapText;

public class Rivendell implements IPlace{
    private String desc;
    private PlaceBase.PLACENAME type;
    private int difficulties;
    private String Name;
    private List<IEnemy> enemies;
    private List<IWeapon> placeWeapons;


    public Rivendell() {
        this.difficulties = 6;
        this.Name = "Rivendel";
        this.type = PlaceBase.PLACENAME.RIVENDELL;
        this.enemies = new ArrayList<>();
        this.desc =wrapText("Imladris, known to men as Rivendell, is Elrond Halfelven's refuge in the western reaches of the Misty Mountains. Bilbo Baggins visits during the Quest of Erebor (2941), and later takes up residence there. In 3018 Frodo Baggins reaches Rivendell with the One Ring and the council of Elrond creates the Fellowship of the Ring.");
        this.placeWeapons = new ArrayList<>();
        this.placeWeapons.add(new Elfbow());
        this.placeWeapons.add(new ElrondRing());
        this.placeWeapons.add(new Sting());
        this.placeWeapons.add(new Anduril());

    }
    @Override
    public PlaceBase.PLACENAME getType() {
        return PlaceBase.PLACENAME.RIVENDELL;
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
        this.enemies.add(new Uruk_Hai());
        this.enemies.add(new Goblin());
        this.enemies.add(new Orch());
        this.enemies.add(new Gollum());
        this.enemies.add(new Troll());
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
