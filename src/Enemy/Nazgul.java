package Enemy;

import Weapon.IWeapon;
import Weapon.Spell;
import Weapon.Stuff;
import Weapon.WeaponBase;


import java.util.ArrayList;
import java.util.List;

public class Nazgul implements IEnemy{
    private int enemyDamage;
    private EnemyBase.EnemyNames type;
    private int enemyHp;
    private String enemyName;
    private int enemyXp;
    private String desc;
    private List<IWeapon> weapons;

    public Nazgul(){
        this.enemyName = "Nazgul";
        this.enemyDamage = 22;
        this.enemyHp = 130;
        this.enemyXp = 3;
        this.desc = "The Nazgûl (B. S.;\"The Ringwraiths\") or Úlairi (Q.[2]), also known as the Black Riders or simply The Nine, were the dreaded ring-servants of the Dark Lord Sauron in Middle-earth throughout the Second and Third Ages, who in the later years of the Third Age dwelt in Minas Morgul and Dol Guldur.";
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
        this.weapons.add(new Spell());
        this.weapons.add(new Stuff());
        return this.weapons;
    }

}
