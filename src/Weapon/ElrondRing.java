package Weapon;

import java.util.ArrayList;
import java.util.List;
import static Weapon.WeaponBase.wrapText;

public class ElrondRing implements IWeapon {
    private String weaponName;
    private int weaponDamage;
    private String weaponDesc;
    List<IWeapon> weapons;

    public ElrondRing() {
        this.weaponName = "Elrond Ring";
        this.weaponDamage = 15;
        this.weaponDesc = wrapText("Vilya was the strongest of the three Elven rings. Its exact powers are unknown, but it is believed that it gave its bearer healing powers and control over minor elements, such as water. Elrond’s ability to summon a torrent of water to chase off the Ringwraiths is thought to be in part powered by Vilya. History: Just before the death of Gil-galad, the High King of the Ñoldor in Middle-Earth, the ring was given to Elrond.");
        weapons = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.weaponName;
    }

    @Override
    public String getWeaponDescription() {
        return this.weaponDesc;
    }

    @Override
    public int getDamage() {
        return this.weaponDamage;
    }

    @Override
    public List<IWeapon> getWeapons() {
        return this.weapons;
    }

    @Override
    public String toString() {
        return this.weaponName + "'s: " + "\nSingle Damage: " + this.weaponDamage;
    }
}
