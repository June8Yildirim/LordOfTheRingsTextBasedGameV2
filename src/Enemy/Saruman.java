package Enemy;

import Weapon.*;

import java.util.ArrayList;
import java.util.List;
import static Enemy.EnemyBase.wrapText;
public class Saruman implements IEnemy {
    private int enemyDamage;
    private int enemyHp;
    private EnemyBase.EnemyNames type;
    private String enemyName;
    private int enemyXp;
    private String desc;
    private List<IWeapon> weapons;

    public Saruman() {
        this.type = EnemyBase.EnemyNames.SARUMAN;
        this.enemyName = "Saruman";
        this.enemyDamage = 25;
        this.enemyHp = 110;
        this.enemyXp = 3;
        this.desc = wrapText("A wizard who joins forces with Sauron. A former friend of Gandalf, Saruman has been tempted by evil and has allied with Sauron. At his mighty tower, Orthanc, he creates countless Uruk-hai, monsters that terrorize Middle-earth.");
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
        return this.desc;
    }

    @Override
    public List<IWeapon> getEnemyInventory() {
        this.weapons.add(new Spell());
        this.weapons.add(new Sword());
        this.weapons.add(new Stuff());
        return this.weapons;
    }
    @Override
    public String toString() {
        int count = 1;
        StringBuilder strBuild = new StringBuilder();
        strBuild.append("\n=====================================\n");

        strBuild.append("Enemy's Weapons\n");
        for (IWeapon weapon : this.weapons) {
            strBuild.append(count++ + ". " + weapon+"\n");
        }
        strBuild.append("\n=====================================\n");
        strBuild.append("Name of Enemy: ").append(this.enemyName).append(", ").append("\nEnemy's Hp: ").append(this.enemyHp).append(".").append("\nEnemy's Xp: ").append(this.enemyHp).append(".").append("\nEnemy's make a damage : ").append(this.enemyDamage).append(".");
        strBuild.append("\n=====================================\n");
        strBuild.append(this.desc);
        strBuild.append("\n=====================================\n");
        return strBuild.toString();
    }
}
