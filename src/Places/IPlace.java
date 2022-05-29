package Places;

import Enemy.IEnemy;
import Weapon.IWeapon;
import java.util.List;
import java.util.Map;

public interface IPlace {
    public PlaceBase.PLACENAME getType();
    public String getName();
    public int getDifficulties();
    public List<IWeapon> getWeapons();
    public List<IEnemy> getEnemies();
    public String getDescription();
    public Map<String, Integer> getExits();

}
