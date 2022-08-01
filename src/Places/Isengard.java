package Places;

import Enemy.IEnemy;
import Enemy.Saruman;
import Enemy.Troll;
import Enemy.Uruk_Hai;
import Weapon.GandalfStaff;
import Weapon.Glamdring;
import Weapon.IWeapon;
import static Places.PlaceBase.wrapText;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Isengard implements IPlace{
    private String description;
    private PlaceBase.PLACENAME type;
    private int difficulties;
    private String Name;
    private List<IEnemy> enemies;
    private List<IWeapon> placeWeapons;

    public Isengard() {
        this.difficulties = 8;
        this.description = wrapText("An extremely defensible fortress in Rohan built by the Númenoreans ages before the War of the Ring takes place. Saruman took up residence there at the invitation of the king of Rohan. He fortified it further and built an army of orcs. From Orthanc, Isengard's 500-foot-tall tower of unbreakable stone, Saruman seeks the One Ring for himself.");
        this.Name = "Isengard";
        this.type = PlaceBase.PLACENAME.ISENGARD;
        enemies = new ArrayList<>();
        this.placeWeapons = new ArrayList<>();
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
    public List<IEnemy> getEnemies() {
        enemies.add(new Saruman());
        enemies.add(new Troll());
        enemies.add(new Uruk_Hai());
        return this.enemies;
    }


    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Map<String, Integer> getExits() {
        return null;
    }

}
