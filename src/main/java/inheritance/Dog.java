package inheritance;

public class Dog extends Animal {
    String type;

    void bark() {
        System.out.println("Dog is Barking...");
    }

    public void setName() {
        setName("Sumo");
    }

    public void sound(){
        System.out.println(this.getName()+" is barking");
    }
}
