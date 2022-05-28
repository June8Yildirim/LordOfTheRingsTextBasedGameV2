package Places;

import Weapon.GandalfStaff;
import Weapon.Glamdring;
import Weapon.IWeapon;
import Weapon.WeaponBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Isengard implements IPlace{
    private String description;
    private PlaceBase.PLACENAME type;
    private int difficulties;
    private String Name;
    private List<IPlace> getConnection;
    private List<IWeapon> placeWeapons;

    public Isengard() {
        this.difficulties = 8;
        this.Name = "Isengard";
        this.type = PlaceBase.PLACENAME.ISENGARD;
        getConnection = new ArrayList<>();
//        this.getConnection.add(new HelmsDeep());
//        this.getConnection.add(new Moria());
        this.placeWeapons = new ArrayList<>();
        this.placeWeapons.add(new Glamdring());
        this.placeWeapons.add(new GandalfStaff());

    }
    @Override
    public PlaceBase.PLACENAME getType() {
        return PlaceBase.PLACENAME.ISENGARD;
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
        return "An extremely defensible fortress in Rohan built by the Númenoreans ages before the War of the Ring takes place. Saruman took up residence there at the invitation of the king of Rohan. He fortified it further and built an army of orcs. From Orthanc, Isengard's 500-foot-tall tower of unbreakable stone, Saruman seeks the One Ring for himself.";
    }

    @Override
    public Map<String, Integer> getExits() {
        return null;
    }

}
