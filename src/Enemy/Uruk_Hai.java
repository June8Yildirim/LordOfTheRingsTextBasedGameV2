package Enemy;


import Weapon.IWeapon;


import java.util.ArrayList;
import java.util.List;

public class Uruk_Hai implements IEnemy{
    private int enemyDamage;
    private EnemyBase.EnemyNames type;
    private int enemyHp;
    private String enemyName;
    private int enemyXp;
    private String desc;
    private List<IWeapon> weapons;

    public Uruk_Hai() {
        this.enemyName = "UrukHai";
        this.enemyDamage = 15;
        this.enemyHp = 85 ;
        this.enemyXp = 2;
        this.desc = "Uruk-hai (for short, Uruks) were brutal warriors of Middle-earth, and the strongest Orcs, who dwelt in Mordor and Isengard." +
                "In The Lord of the Rings, the term Uruk-hai refers chiefly to those bred in Isengard, and in one context are alternatively called Isengarders, while Uruks from Mordor are called Black Uruks or Uruks of Mordor. ";
        this.weapons =new ArrayList<>();
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
        return this.desc;
    }

    @Override
    public List<IWeapon> getEnemyInventory() {
        return this.weapons;
    }

}
