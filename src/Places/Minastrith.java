package Places;

import Weapon.IWeapon;
import Weapon.Narsil;
import Weapon.OneRing;
import Weapon.WeaponBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Minastrith implements IPlace{
    private String desc;
    private PlaceBase.PLACENAME type;
    private int difficulties;
    private String Name;
    private List<IPlace> getConnection;
    private List<IWeapon> placeWeapons;

    public Minastrith() {
        this.difficulties = 15;
        this.Name =  "Minastrith";
        this.type = PlaceBase.PLACENAME.MINASTRITH;
        getConnection = new ArrayList<>();
//        this.getConnection.add(new HelmsDeep());
        this.placeWeapons = new ArrayList<>();
        this.placeWeapons.add(new Narsil());
        this.placeWeapons.add(new OneRing());

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
    public List<IPlace> getConnections() {
        return this.getConnection;
    }

    @Override
    public String getDescription() {
        return "The Southern counterpart to Arnor. Gondor was ruled by Elendil and his two sons until the War of the Last Alliance, when Elendil and Anarion were killed and Isildur became the high king of both kingdoms. The kingship lasted until the year 2050 of the Third Age, when the last king rode out to meet the challenge of the Witch-King of Angmar and was never seen again. After this stewards ruled until Aragorn took back the kingship of both Arnor and Gondor. Gondor had three main cities and several smaller ones. The main cities were Minas Anor (Minas Tirith), Minas Ithil (Minas Morgul), and Osgiliath.";
    }

    @Override
    public Map<String, Integer> getExits() {
        return null;
    }

}
