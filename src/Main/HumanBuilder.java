package Main;

public class HumanBuilder implements IAnimalBuilder{
    Human human = new Human();

    @Override
    public String getName() {
        return "Human";
    }

    @Override
    public void setLegs() {
        human.legs=2;
    }

    @Override
    public void setIntelligence() {
        human.intelligence="high";
    }

    @Override
    public void setTail() {
        human.tail=false;
    }

    public Human getResult(){
        System.out.println("Human was born from space");
        return human;
    }
}
