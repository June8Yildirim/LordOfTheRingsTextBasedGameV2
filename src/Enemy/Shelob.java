package Enemy;

import Weapon.IWeapon;
import Weapon.Poison;
import Weapon.Sword;
import Weapon.WeaponBase;

import java.util.ArrayList;
import java.util.List;

public class Shelob implements IEnemy{
    private int enemyDamage;
    private int enemyHp;
    private EnemyBase.EnemyNames type;
    private String enemyName;
    private int enemyXp;
    private String desc;
    private List<IWeapon> weapons;

    public Shelob () {
        this.type = EnemyBase.EnemyNames.SHELOB;
        this.enemyName = "Shelob";
        this.enemyDamage = 21;
        this.enemyHp = 90;
        this.enemyXp = 2;
        this.desc = "Shelob was a great Spider and the greatest offspring of Ungoliant, the primordial spider. In the Third Age she lived in Mordor and was known to feed indiscriminately, preying on the inhabitants. She was encountered by Frodo Baggins and Samwise Gamgee in their quest to destroy the One Ring.";
        this.weapons = new ArrayList<>();
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
        this.weapons.add(new Sword());
        this.weapons.add(new Poison());
        return this.weapons;
    }

}
