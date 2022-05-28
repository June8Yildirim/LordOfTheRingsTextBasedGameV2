package Places;

import Weapon.IWeapon;
import Weapon.Sting;
import Weapon.WeaponBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shire implements IPlace{
    private String desc;
    private PlaceBase.PLACENAME type;
    private int difficulties;
    private String Name;
    private List<IPlace> getConnection;
    private List<IWeapon> placeWeapons;
    private Map<String, Integer> connections;
    private int locId;

    public Shire(int locId, Map<String, Integer> exits) {
        this.locId = locId;
        if (exits != null){
            this.connections = new HashMap<String, Integer>(exits);
        }else {
            this.connections = new HashMap<String, Integer>();
        }
        this.difficulties = 5;
        this.Name = "Shire";
        this.type = PlaceBase.PLACENAME.SHIRE;
        this.getConnection = new ArrayList<>();
//        this.getConnection.add(new Moria());
        this.placeWeapons = new ArrayList<>();
        this.placeWeapons.add(new Sting());
    }


    @Override
    public PlaceBase.PLACENAME getType() {
        return PlaceBase.PLACENAME.SHIRE;
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
        return  "Located in the northwest of Middle-earth, the Shire is a loosely organized territory in which most of Middle-earth's hobbits live. It is a bucolic, agricultural land that has seen little of the evil growing to the east. The Baggins family home of Bag End is in Hobbiton, a large town in the western farthing, or district, of the Shire.";
    }

    @Override
    public Map<String, Integer> getExits() {
        return connections;
    }

}
