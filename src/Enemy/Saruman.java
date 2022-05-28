package Enemy;

import Weapon.IWeapon;
import Weapon.WeaponBase;

import java.util.ArrayList;
import java.util.List;

public class Saruman implements IEnemy {
    private int enemyDamage;
    private int enemyHp;
    private String enemyName;
    private int enemyXp;
    private String desc;
    private List<IWeapon> weapons;

    public Saruman(EnemyBase.EnemyNames type, String name, int damage, int hp, int xp) {
        this.enemyName = name;
        this.enemyDamage = damage;
        this.enemyHp = hp;
        this.enemyXp = xp;
        weapons  = new ArrayList<>();
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
        return "A wizard who joins forces with Sauron. A former friend of Gandalf, Saruman has been tempted by evil and has allied with Sauron. At his mighty tower, Orthanc, he creates countless Uruk-hai, monsters that terrorize Middle-earth.";
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
