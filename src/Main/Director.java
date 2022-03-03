package Main;

public class Director {
    void makeAnimal(IAnimalBuilder builder){
        System.out.println("Director is forcing AnimalBuilder to make a "+builder.getName()+"...");
        builder.setTail();
        builder.setIntelligence();
        builder.setLegs();
    }
}
