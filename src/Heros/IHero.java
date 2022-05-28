package Heros;

import Weapon.IWeapon;
import Weapon.WeaponBase;


import java.util.List;

public interface IHero {
    public String getHeroName();
    public int getHeroHp();
    public int getHeroMaxHp();
    public int getHeroDamage();
    public void setHeroHp(int hp);
    public void setHeroDamage(int damage);
    public String getHeroDescription();
    public List<IWeapon> getHerosInventory();
    public void addWeaponToInventoryList(IWeapon weapon);
    public void removeWeaponToInventoryList(IWeapon weapon);
}
