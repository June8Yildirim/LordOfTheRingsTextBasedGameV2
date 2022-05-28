package Places;

import Weapon.IWeapon;
import Weapon.Orcrist;
import Weapon.WeaponBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HelmsDeep implements IPlace{
    private String desc;
    private PlaceBase.PLACENAME type;
    private int difficulties;
    private String Name;
    private List<IPlace> getConnection;
    private List<IWeapon> placeWeapons;


    public HelmsDeep() {
        this.difficulties = 13;
        this.Name =  "Helms Deep";
        this.type = PlaceBase.PLACENAME.HELMSDEEP;
        getConnection = new ArrayList<>();
//        this.getConnection.add(new Isengard());
//        this.getConnection.add(new Rivendell());
//        this.getConnection.add(new Minastrith());
        this.placeWeapons = new ArrayList<>();
        this.placeWeapons.add(new Orcrist());

    }
    @Override
    public PlaceBase.PLACENAME getType() {
        return PlaceBase.PLACENAME.HELMSDEEP;
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
        return "When he learns of Saruman's intentions of destroying Rohan, King Théoden decides to evacuate Edoras and move his people to Helm's Deep. While on the move, a pack of Wargs attack, but are driven off. At Helm's Deep, Théoden finds that many of his men are too old or too young, but he is still confident that the hold cannot be overrun since it has never fallen. Hopes are bolstered by the arrival of Haldir and a force of Elves." +
                "\nSoon, a huge force of Saruman's Uruk-hai arrive and surround the hold. The attack begins and the hold stands until a hole is blasted in the Deeping Wall. Outlying positions are overrun and Haldir is killed. King Théoden orders that they fall back into the fortress itself. He begins to despair, but Aragorn suggests one last charge out of the Hornburg. As they charge out, Gandalf arrives with Éomer and a force of Rohirrim.";
    }

    @Override
    public Map<String, Integer> getExits() {
        return null;
    }

}
