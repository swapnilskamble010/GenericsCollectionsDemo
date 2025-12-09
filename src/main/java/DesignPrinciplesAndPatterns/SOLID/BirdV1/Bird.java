package DesignPrinciplesAndPatterns.SOLID.BirdV1;

public abstract class Bird {
    private String name;
    private int age;
    private int noOfLegs;
    private String type;

    public void eat() {
        System.out.println("Bird: "+ name + " is Eating");
    }

    public abstract void fly();

//    public void makeSound() {
//        if(type.equals("Peacock"))
//            System.out.println("Meow..Meow..");
//        else if(type.equals("Crow"))
//            System.out.println("Cow..Crow..");
//        else  if(type.equals("new type"))
//            System.out.println("New sound");
//    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
