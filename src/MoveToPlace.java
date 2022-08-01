import Places.IPlace;

public class MoveToPlace {
    private IPlace currentPlace;
    private String placeName;
    private String moveTo;
    public MoveToPlace(IPlace currentPlace, String placeName, String moveTo) {
            this.currentPlace = currentPlace;
            this.placeName = placeName;
            this.moveTo = moveTo;
    }

    public void move(){
        for (String place : currentPlace.getExits().keySet()){
            if (moveTo.equals("SHIRE")){

                currentPlace = GameStart.createPlace("Shire");
                System.out.println("You are moving at " + currentPlace.getName());
                GameStart.printSeparator(20);
                break;
            }else if(moveTo.equals("MORIA")){
                currentPlace = GameStart.createPlace("Moria");
                System.out.println("You are moving at " + currentPlace.getName());
                GameStart.printSeparator(20);
                break;
            }else if (moveTo.equals("RIVENDELL")){
                currentPlace = GameStart.createPlace("Rivendell");
                System.out.println("You are moving at " + currentPlace.getName());
                GameStart.printSeparator(20);
                break;
            }else if (moveTo.equals("ISENGARD")){
                currentPlace = GameStart.createPlace("Isengard");
                System.out.println("You are moving at " + currentPlace.getName());
                GameStart.printSeparator(20);
                break;
            }else if (moveTo.equals("HELMSDEEP")){
                currentPlace = GameStart.createPlace("Helmsdeep");
                System.out.println("You are moving at " + currentPlace.getName());
                GameStart.printSeparator(20);
                break;
            }else if (moveTo.equals("MINASTRITH")){
                currentPlace = GameStart.createPlace("Minastrith");
                System.out.println("You are moving at " + currentPlace.getName());
                GameStart.printSeparator(20);
                break;
            }else{
                System.out.println("No place to go");
            }
        }
    }
}
