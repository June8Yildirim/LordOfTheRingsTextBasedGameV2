package Enemy;

import Weapon.IWeapon;
import Weapon.WeaponBase;


import java.util.ArrayList;
import java.util.List;

public class Sauron implements IEnemy{
    private int enemyDamage;
    private int enemyHp;
    private String enemyName;
    private int enemyXp;
    private String desc;
    private List<IWeapon> weapons;

    public Sauron(EnemyBase.EnemyNames type, String name, int damage, int hp, int xp) {
        this.enemyName = name;
        this.enemyDamage = damage;
        this.enemyHp = hp;
        this.enemyXp = xp;
        weapons = new ArrayList<>();

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
        return "The Abhorred or the eponymous Lord of the Rings, was a fallen Maia, creator of the One Ring, a gifted student of Vala Aulë the Smith and lieutenant of Melkor (Morgoth). After his master's defeat by the Valar, Sauron became the second Dark Lord and sought to conquer Arda by creating the Rings of Power.\" +\n" +
                "In the Second Age, he was defeated in the War of the Last Alliance of Elves and Men united under kings Gil-galad and Elendil. In the final battle, Isildur managed to cut the One Ring from Sauron's finger, dismantling the Dark Lord's corporeal form and power. After centuries lying dormant, rebuilding his strength, Sauron returned to power late in the Third Age, but was permanently crippled in the War of the Ring after destruction of the One Ring in the fires of Mount Doom by a hobbit Frodo Baggins.";
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
