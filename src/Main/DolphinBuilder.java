package Main;

public class DolphinBuilder implements IAnimalBuilder{
    Dolphin dolphin = new Dolphin();

    @Override
    public String getName() {
        return "Dolphin";
    }

    @Override
    public void setLegs() {
        dolphin.legs=0;
    }

    @Override
    public void setIntelligence() {
        dolphin.intelligence="Medium";
    }

    @Override
    public void setTail() {
        dolphin.tail=true;
    }

    public Dolphin getDolphin() {
        System.out.println("Dolphin was born from water");
        return dolphin;
    }
}
