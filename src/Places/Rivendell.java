package Places;

import Weapon.Elfbow;
import Weapon.ElrondRing;
import Weapon.IWeapon;
import Weapon.WeaponBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Rivendell implements IPlace{
    private String desc;
    private PlaceBase.PLACENAME type;
    private int difficulties;
    private String Name;
    private List<IPlace> getConnection;
    private List<IWeapon> placeWeapons;


    public Rivendell() {
        this.difficulties = 6;
        this.Name = "Rivendel";
        this.type = PlaceBase.PLACENAME.RIVENDELL;
        getConnection = new ArrayList<>();
//        this.getConnection.add(new HelmsDeep());
//        this.getConnection.add(new Moria());
        this.placeWeapons = new ArrayList<>();
        this.placeWeapons.add(new Elfbow());
        this.placeWeapons.add(new ElrondRing());

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
    public List<IPlace> getConnections() {
        return this.getConnection;
    }

    @Override
    public String getDescription() {
        return "Imladris, known to men as Rivendell, is Elrond Halfelven's refuge in the western reaches of the Misty Mountains. Bilbo Baggins visits during the Quest of Erebor (2941), and later takes up residence there. In 3018 Frodo Baggins reaches Rivendell with the One Ring and the council of Elrond creates the Fellowship of the Ring.";
    }

    @Override
    public Map<String, Integer> getExits() {
        return null;
    }


}
