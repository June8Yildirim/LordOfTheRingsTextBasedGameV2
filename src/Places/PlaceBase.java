package Places;

import java.util.HashMap;
import java.util.Map;

public class PlaceBase {
    public enum PLACENAME {MORIA, HELMSDEEP, ISENGARD, RIVENDELL, MINASTRITH, SHIRE}

    public PlaceBase() {

    }

    public IPlace createPlace(String placeName) {
        IPlace place = null;
        Map<Integer, IPlace> locations = new HashMap<Integer, IPlace>();
        Map<String, Integer> exits = new HashMap<String, Integer>();
        switch (placeName) {
            case "Shire":
                exits.put("RIVENDELL",5);
                exits.put("MORIA",2);
                place = new Shire(1,exits);
                locations.put(1, place);
                break;
            case "Moria":
                exits.put("RIVENDELL",5);
                exits.put("ISENGARD",4);
                place = new Moria(2, exits);
                locations.put(2, place);
                break;
            case "HelmsDeep":
                exits.put("ISENGARD",4);
                exits.put("MINASTRITH",6);
                place = new HelmsDeep();
                locations.put(3, place);
                break;
            case "Isengard":
                exits.put("HELMSDEEP",3);
                exits.put("MORIA",2);
                place = new Isengard();
                locations.put(4, place);
                break;
            case "Rivendell":
                exits.put("SHIRE",1);
                exits.put("MORIA",2);
                place = new Rivendell();
                locations.put(5,place);
                break;
            case "Minastrith":
                exits.put("HELMSDEEP",3);
                place = new Minastrith();
                locations.put(6, place);
                break;
            default:
                System.out.println("Invalid entry!");
        }

        return place;
    }

    public static  String wrapText(String desc){
        int LINE_LENGTH = 0;
        StringBuilder str = new StringBuilder();
        String[] wordList = desc.split(" ");
        for (int i = 0; i < wordList.length; i++) {
            if( LINE_LENGTH <= 10){
                str.append(wordList[i]+" ");
                LINE_LENGTH++;
            }else{
                str.append("\n");
                LINE_LENGTH = 0;
            }
        }
        return   str.toString();
    }
}
