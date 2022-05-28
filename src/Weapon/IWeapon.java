package Weapon;

import java.util.List;

public interface IWeapon {
    public String getName();
    public String getWeaponDescription();
    public int getDamage();
    public List<IWeapon> getWeapons();

}
