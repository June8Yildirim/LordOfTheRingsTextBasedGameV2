package Places;

import Weapon.IWeapon;
import Weapon.WeaponBase;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface IPlace {
    public PlaceBase.PLACENAME getType();
    public String getName();
    public int getDifficulties();
    public List<IWeapon> getWeapons();
    public List<IPlace> getConnections();
    public String getDescription();
    public Map<String, Integer> getExits();
}
