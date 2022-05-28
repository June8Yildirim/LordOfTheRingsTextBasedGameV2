package Enemy;

import Weapon.IWeapon;
import Weapon.WeaponBase;

import java.util.ArrayList;
import java.util.List;

public class Shelob implements IEnemy{
    private int enemyDamage;
    private int enemyHp;
    private String enemyName;
    private int enemyXp;
    private String desc;
    private List<IWeapon> weapons;
    public Shelob(EnemyBase.EnemyNames type, String name, int damage, int hp, int xp) {
        this.enemyName = name;
        this.enemyDamage = damage;
        this.enemyHp = hp;
        this.enemyXp = xp;
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
        return "Shelob was a great Spider and the greatest offspring of Ungoliant, the primordial spider. In the Third Age she lived in Mordor and was known to feed indiscriminately, preying on the inhabitants. She was encountered by Frodo Baggins and Samwise Gamgee in their quest to destroy the One Ring.";
    }

    @Override
    public List<IWeapon> getEnemyInventory() {
        return this.weapons;
    }

    @Override
    public void addWeaponToEnemy(IWeapon weapon) {
        weapons.add(weapon);
    }

    @Override
    public void removeWeaponToEnemy(IWeapon weapon) {
        weapons.remove(weapon);
    }
}
