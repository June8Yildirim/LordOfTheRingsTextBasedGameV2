package Places;

import Enemy.*;
import Weapon.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Places.PlaceBase.wrapText;

public class Shire implements IPlace{
    private String desc;
    private PlaceBase.PLACENAME type;
    private int difficulties;
    private String Name;
    private List<IEnemy> enemies;
    private List<IWeapon> placeWeapons;
    private Map<String, Integer> connections;
    private int locId;

    public Shire(int locId, Map<String, Integer> exits) {
        this.locId = locId;
        if (exits != null){
            this.connections = new HashMap<String, Integer>(exits);
        }else {
            this.connections = new HashMap<String, Integer>();
        }
        this.difficulties = 5;
        this.Name = "Shire";
        this.desc = wrapText("Located in the northwest of Middle-earth, the Shire is a loosely organized territory in which most of Middle-earth's hobbits live. It is a bucolic, agricultural land that has seen little of the evil growing to the east. The Baggins family home of Bag End is in Hobbiton, a large town in the western farthing, or district, of the Shire.");
        this.type = PlaceBase.PLACENAME.SHIRE;
        this.enemies = new ArrayList<>();
        this.placeWeapons = new ArrayList<>();
        this.placeWeapons.add(new Sword());
        this.placeWeapons.add(new Axe());
        this.placeWeapons.add(new Knife());
        this.placeWeapons.add(new Spears());
    }


    @Override
    public PlaceBase.PLACENAME getType() {
        return PlaceBase.PLACENAME.SHIRE;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public int getDifficulties() {
        return this.difficulties;
    }

    @Override
    public List<IWeapon> getWeapons() {
        return this.placeWeapons;
    }

    @Override
    public List<IEnemy> getEnemies() {
        this.enemies.add(new Goblin());
        this.enemies.add(new Troll());
        this.enemies.add(new Orch());
        this.enemies.add(new Nazgul());
        return this.enemies;
    }

    @Override
    public String getDescription() {
        return  this.desc;    }

    @Override
    public Map<String, Integer> getExits() {
        return connections;
    }

    @Override
    public String toString() {
        int count = 1;
        StringBuilder strBuild = new StringBuilder();
        strBuild.append("\n=====================================\n");

        strBuild.append("Place's Weapons\n");
        for (IWeapon weapon : this.placeWeapons) {
            strBuild.append(count++ + ". " + weapon+"\n");
        }

        count = 1;
        strBuild.append("Place encounterable Enemies\n");
        for (IEnemy enemy : this.enemies) {
            strBuild.append(count++ + ". " + enemy+"\n");
        }

        count = 1;
        strBuild.append("Place's Connection\n");
        for (Map.Entry<String, Integer> place : getExits().entrySet()) {
            strBuild.append(count++ + ". " + place+"\n");
        }
        strBuild.append("\n=====================================\n");
        strBuild.append("Name of Place: ").append(this.Name).append(", ").append("\nPlace's challenging rate: ").append(this.difficulties).append(".");
        strBuild.append("\n=====================================\n");
        strBuild.append(this.desc);
        strBuild.append("\n=====================================\n");
        return strBuild.toString();
    }

//    public String wrapText(String desc){
//        int LINE_LENGTH = 0;
//        StringBuilder str = new StringBuilder();
//        String[] wordList = desc.split(" ");
//        for (int i = 0; i < wordList.length; i++) {
//            if( LINE_LENGTH <= 10){
//                str.append(wordList[i]+" ");
//                LINE_LENGTH++;
//            }else{
//                str.append("\n");
//              LINE_LENGTH = 0;
//            }
//        }
//      return   str.toString();
//    }

}
