package Enemy;

import Weapon.IWeapon;
import Weapon.WeaponBase;

import java.util.ArrayList;
import java.util.List;

public class Gollum implements IEnemy{
    private int enemyDamage;
    private int enemyHp;
    private String enemyName;
    private int enemyXp;
    private String desc;
    private List<IWeapon> weapons;

    public Gollum(EnemyBase.EnemyNames type, String name, int damage, int hp, int xp) {
        this.enemyName = name;
        this.enemyDamage = damage;
        this.enemyHp = hp;
        this.enemyXp = xp;
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
        return "A wretched swamp creature who covets the ring. Before becoming obsessed with the ring, Gollum was a hobbit named Sméagol. His transformation into the disgusting, raw-fish-eating Gollum serves as a cautionary tale about the evil effects of the ring. Both Gollum and Sméagol are vastly different from Frodo. Gollum is a living reminder of a possible alternate life for Frodo, and, while Frodo is incorruptible, Sméagol is weak-willed and criminal. From the moment he first laid eyes on the ring, Sméagol was obsessed with it, and years later it is still Gollum’s sole reason for living. Gollum leads Frodo and Sam to Mordor, and his intentions are constantly suspect. Usually he seems to be waiting for an opportunity to steal the ring, but at times he appears to be a faithful servant, won over by Frodo’s generous spirit. His desire for the ring eventually wins out, and this desire ultimately leads to the destruction of the ring and his own death at Mount Doom. As is Sauron’s, Gollum’s identity is tied up with the ring. Whereas Sauron is pure evil, however, Gollum is pure weakness. He is always the ring’s victim.";
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
