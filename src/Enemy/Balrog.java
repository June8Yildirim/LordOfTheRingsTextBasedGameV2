package Enemy;

import Weapon.IWeapon;
import Weapon.WeaponBase;


import java.util.ArrayList;
import java.util.List;

public class Balrog implements IEnemy{
    private int enemyDamage;
    private int enemyHp;
    private String enemyName;
    private int enemyXp;
    private String desc;
private  List<IWeapon> weapons;
    public Balrog(EnemyBase.EnemyNames type, String name, int damage, int hp, int xp) {
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
        return "Strife and Hate was the Lord of Balrogs during the First Age, and the greatest Balrog ever to walk Middle-earth. As the High Captain of Angband, his only equal in rank was Sauron. He fought many battles in the name of his master Morgoth, and was personally responsible for killing two of the High Kings of the Ñoldor.\" +\n" +
                "Gothmog, like the rest of his kind, carried a fiery whip into battle, but was also known for wielding a great black axe, feared by elves across the continent of Beleriand. ";
    }

    @Override
    public List<IWeapon> getEnemyInventory() {
        return this.weapons;
    }

    @Override
    public void addWeaponToEnemy(IWeapon weapon) {

    }

    @Override
    public void removeWeaponToEnemy(IWeapon weapon) {

    }

}
