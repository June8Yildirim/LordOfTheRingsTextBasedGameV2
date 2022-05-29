package Places;

import Enemy.*;
import Weapon.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Moria implements IPlace {
    private String desc;
    private PlaceBase.PLACENAME type;
    private int difficulties;
    private String Name;
    private List<IEnemy> enemies;
    private List<IWeapon> placeWeapons;
    private Map<String, Integer> exits;
    private int locId;

    public Moria(int locId, Map<String, Integer> exits) {
        this.locId = locId;
        if (exits != null){
            this.exits = new HashMap<String, Integer>(exits);
        }else {
            this.exits = new HashMap<String, Integer>();
        }
        this.difficulties = 10;
        this.Name = "Moria";
        this.desc ="Khazad-dûm lies deep in the center of the Misty Mountains and was the stronghold of Durin, eldest of the Seven Fathers of the Dwarves. After the destruction of Beleriand many dwarves emigrated to Khazad-dûm, making it the greatest of dwarven cities. The dwarves of Khazad-dûm found enthusiastic trading partners and fellow craftspeople in the elven smiths of Eregion, and they shared the longest peaceful relationship between the two races. Khazad-dûm was also the only place where the rare metal mithril could be found, but in mining mithril, the dwarves accidentally freed the balrog. The dwarves fled Khazad-dûm and hence forth it was known as Moria, the \"Black Chasm.\"";
        this.type = PlaceBase.PLACENAME.MORIA;
        enemies = new ArrayList<>();
        this.placeWeapons = new ArrayList<>();
        this.placeWeapons.add(new Orcrist());
        this.placeWeapons.add(new Axe());

    }
    @Override
    public PlaceBase.PLACENAME getType() {
        return PlaceBase.PLACENAME.MORIA;
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
        this.enemies.add(new Balrog());
        this.enemies.add(new Troll());
        this.enemies.add(new Orch());
        this.enemies.add(new Goblin());
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
