package Enemy;

import Weapon.IWeapon;
import Weapon.MorgulBlade;

import java.util.ArrayList;
import java.util.List;
import static Enemy.EnemyBase.wrapText;

public class Angmar implements IEnemy{

    private int enemyDamage;
    private EnemyBase.EnemyNames type;
    private int enemyHp;
    private String enemyName;
    private int enemyXp;
    private String desc;
    private List<IWeapon> weapons;

    public Angmar() {
        this.type = EnemyBase.EnemyNames.ANGMAR;
        this.enemyName = "Angmar";
        this.enemyDamage = 24;
        this.enemyHp = 120;
        this.enemyXp = 4;
        this.desc = wrapText("One of Sauron’s most feared warriors. Unable to be killed by men, the witch-king is eventually felled by Éowyn, a woman, with the help of Merry, a hobbit. ");
        weapons =  new ArrayList<>();
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
        this.weapons.add(new MorgulBlade());
        return this.weapons;
    }

}
