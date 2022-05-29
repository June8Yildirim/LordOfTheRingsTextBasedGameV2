package Enemy;

import Weapon.Axe;
import Weapon.IWeapon;
import Weapon.Sword;
import Weapon.WeaponBase;

import java.util.ArrayList;
import java.util.List;

public class Troll implements IEnemy {
    private int enemyDamage;
    private int enemyHp;
    private String enemyName;
    private int enemyXp;
    private String desc;
    private List<IWeapon> weapons;

    public Troll() {
        this.enemyName = "Troll";
        this.enemyDamage = 12;
        this.enemyHp = 50;
        this.enemyXp = 1;
        this.weapons = new ArrayList<>();
        this.desc = "Stone-trolls tended to be dumb and ill-tempered. Stone-trolls ate things such as wild fowl, wild pigs/boars, dwarves, hobbits, and fish (if they could actually catch them). They hunted simply by chasing or ambushing the animals, then hitting them with a weapon such as an axe or a club.";
    }
    @Override
    public String getEnemyName() {
        return this.enemyName;
    }

    @Override
    public int getEnemyDamage() {
        return this.enemyDamage;
    }

    @Override
    public int getEnemyHp() {
        return enemyHp;
    }

    @Override
    public void setEnemyHp(int hp) {
        this.enemyHp = hp;
    }

    @Override
    public String getEnemyDesc() {
        return this.desc;    }

    @Override
    public List<IWeapon> getEnemyInventory() {
        this.weapons.add(new Axe());
        this.weapons.add(new Sword());
        return this.weapons;
    }

}
