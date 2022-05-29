package Enemy;

import Weapon.Axe;
import Weapon.IWeapon;
import Weapon.Sword;
import Weapon.WeaponBase;

import java.util.ArrayList;
import java.util.List;

public class Goblin implements IEnemy{
    private int enemyDamage;
    private int enemyHp;
    private EnemyBase.EnemyNames type;
    private String enemyName;
    private int enemyXp;
    private String desc;
    private List<IWeapon> weapons;

    public Goblin() {
        this.type = EnemyBase.EnemyNames.GOBLIN;
        this.enemyName = "Goblin";
        this.enemyDamage = 15;
        this.enemyHp = 75;
        this.enemyXp = 1;
        this.desc = "There must be a description";
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
        return this.desc;
    }

    @Override
    public List<IWeapon> getEnemyInventory() {
        this.weapons.add(new Sword());
        this.weapons.add(new Axe());
        return this.weapons;
    }

}
