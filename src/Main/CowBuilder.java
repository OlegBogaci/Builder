package Main;

public class CowBuilder implements IAnimalBuilder{
    Cow cow = new Cow();

    @Override
    public String getName() {
        return "Cow";
    }

    @Override
    public void setLegs() {
        cow.legs=4;
    }

    @Override
    public void setIntelligence() {
        cow.intelligence="Low";
    }

    @Override
    public void setTail() {
        cow.tail=true;
    }

    public Cow getCow() {
        System.out.println("Cow was born from earth");
        return cow;
    }
}
