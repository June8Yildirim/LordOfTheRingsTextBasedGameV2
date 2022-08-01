package Enemy;

import Weapon.*;

import java.util.ArrayList;
import java.util.List;
import static Enemy.EnemyBase.wrapText;

public class Gollum implements IEnemy{
    private int enemyDamage;
    private int enemyHp;
    private EnemyBase.EnemyNames type;
    private String enemyName;
    private int enemyXp;
    private String desc;
    private List<IWeapon> weapons;

    public Gollum() {
        this.type = EnemyBase.EnemyNames.GOLLUM;
        this.enemyName = "Gollum";
        this.enemyDamage = 10;
        this.enemyHp = 100;
        this.enemyXp = 2;
        this.desc = wrapText("A wretched swamp creature who covets the ring. Before becoming obsessed with the ring, Gollum was a hobbit named Sméagol. His transformation into the disgusting, raw-fish-eating Gollum serves as a cautionary tale about the evil effects of the ring. Both Gollum and Sméagol are vastly different from Frodo. Gollum is a living reminder of a possible alternate life for Frodo, and, while Frodo is incorruptible, Sméagol is weak-willed and criminal. From the moment he first laid eyes on the ring, Sméagol was obsessed with it, and years later it is still Gollum’s sole reason for living. Gollum leads Frodo and Sam to Mordor, and his intentions are constantly suspect. Usually he seems to be waiting for an opportunity to steal the ring, but at times he appears to be a faithful servant, won over by Frodo’s generous spirit. His desire for the ring eventually wins out, and this desire ultimately leads to the destruction of the ring and his own death at Mount Doom. As is Sauron’s, Gollum’s identity is tied up with the ring. Whereas Sauron is pure evil, however, Gollum is pure weakness. He is always the ring’s victim.");
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
        this.weapons.add(new Sting());
        this.weapons.add(new OneRing());
        this.weapons.add(new Sword());

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
