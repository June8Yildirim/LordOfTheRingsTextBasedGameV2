package Enemy;

import Weapon.IWeapon;
import Weapon.WeaponBase;


import java.util.ArrayList;
import java.util.List;

public class Nazgul implements IEnemy{
    private int enemyDamage;
    private int enemyHp;
    private String enemyName;
    private int enemyXp;
    private String desc;
    private List<IWeapon> weapons;

    public Nazgul(EnemyBase.EnemyNames type, String name, int damage, int hp, int xp) {
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
        return "The Nazgûl (B. S.; \"The Ringwraiths\") or Úlairi (Q.[2]), also known as the Black Riders or simply The Nine, were the dreaded ring-servants of the Dark Lord Sauron in Middle-earth throughout the Second and Third Ages, who in the later years of the Third Age dwelt in Minas Morgul and Dol Guldur.";
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
