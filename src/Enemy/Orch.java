package Enemy;

import Weapon.IWeapon;
import Weapon.Sword;
import Weapon.WeaponBase;

import java.util.ArrayList;
import java.util.List;

public class Orch implements IEnemy{
    private int enemyDamage;
    private EnemyBase.EnemyNames type;
    private int enemyHp;
    private String enemyName;
    private int enemyXp;
    private String desc;
    private List<IWeapon> weapons;

    public Orch() {
        this.type= EnemyBase.EnemyNames.ORCH;
        this.enemyName = "Orch";
        this.enemyDamage = 8;
        this.enemyHp = 30;
        this.enemyXp = 1;
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
        return "Orcs were the primary foot soldiers of the Dark Lords' armies and sometimes the weakest (but most numerous) of their servants. They were created by the first Dark Lord, Morgoth, before the First Age and served him and later his successor in their quest to dominate Middle-earth. Before Oromë first found the Elves at Cuiviénen, Melkor kidnapped some of them and cruelly tortured them, twisting them into the first Orcs.";
    }

    @Override
    public List<IWeapon> getEnemyInventory() {
        this.weapons.add(new Sword());
        return this.weapons;
    }


}
