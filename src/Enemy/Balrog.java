package Enemy;

import Weapon.BalrogWhip;
import Weapon.GorthmogAxe;
import Weapon.IWeapon;


import java.util.ArrayList;
import java.util.List;
import static Enemy.EnemyBase.wrapText;
import static Enemy.EnemyBase.wrapText;

public class Balrog implements IEnemy{
    private int enemyDamage;
    private int enemyHp;
    private EnemyBase.EnemyNames type;
    private String enemyName;
    private int enemyXp;
    private String desc;
private  List<IWeapon> weapons;
    public Balrog() {
        this.desc = wrapText("Strife and Hate was the Lord of Balrogs during the First Age, and the greatest Balrog ever to walk Middle-earth. As the High Captain of Angband, his only equal in rank was Sauron. He fought many battles in the name of his master Morgoth, and was personally responsible for killing two of the High Kings of the Ñoldor. Gothmog, like the rest of his kind, carried a fiery whip into battle, but was also known for wielding a great black axe, feared by elves across the continent of Beleriand.");
        this.enemyName = "Balrog";
        this.enemyDamage = 25;
        this.enemyHp = 110;
        this.enemyXp = 4;
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
        return this.desc;   }

    @Override
    public List<IWeapon> getEnemyInventory() {
        this.weapons.add(new BalrogWhip());
        this.weapons.add(new GorthmogAxe());
        return this.weapons;
    }

}
