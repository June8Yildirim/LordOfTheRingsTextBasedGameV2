package Enemy;

import Weapon.IWeapon;
import Weapon.OneRing;
import Weapon.Warhammer;
import Weapon.WeaponBase;


import java.util.ArrayList;
import java.util.List;

public class Sauron implements IEnemy{
    private int enemyDamage;
    private int enemyHp;
    private EnemyBase.EnemyNames type;
    private String enemyName;
    private int enemyXp;
    private String desc;
    private List<IWeapon> weapons;

    public Sauron() {
        this.enemyName = "Sauron";
        this.type = EnemyBase.EnemyNames.SAURON;
        this.enemyDamage = 30;
        this.enemyHp = 140;
        this.enemyXp = 10;
        this.desc= "The Abhorred or the eponymous Lord of the Rings, was a fallen Maia, creator of the One Ring, a gifted student of Vala Aulë the Smith and lieutenant of Melkor (Morgoth). After his master's defeat by the Valar, Sauron became the second Dark Lord and sought to conquer Arda by creating the Rings of Power." +
                "In the Second Age, he was defeated in the War of the Last Alliance of Elves and Men united under kings Gil-galad and Elendil. In the final battle, Isildur managed to cut the One Ring from Sauron's finger, dismantling the Dark Lord's corporeal form and power. After centuries lying dormant, rebuilding his strength, Sauron returned to power late in the Third Age, but was permanently crippled in the War of the Ring after destruction of the One Ring in the fires of Mount Doom by a hobbit Frodo Baggins.";
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
        return this.desc;}

    @Override
    public List<IWeapon> getEnemyInventory() {
        this.weapons.add(new Warhammer());
        this.weapons.add(new OneRing());

        return this.weapons;
    }


}
