package Main;
//Builder pattern
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        HumanBuilder humanBuilder = new HumanBuilder();
        director.makeAnimal(humanBuilder);

        Human human1=humanBuilder.getResult();

        CowBuilder cowBuilder=new CowBuilder();
        director.makeAnimal(cowBuilder);

        Cow cow= cowBuilder.getCow();

        DolphinBuilder dolphinBuilder= new DolphinBuilder();
        director.makeAnimal(dolphinBuilder);

        Dolphin dolphin=dolphinBuilder.getDolphin();

    }
}
