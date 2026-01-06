package inheritance;

public class Animal {

    private String name;

    public Animal() {

    }
    public Animal(String name) {
        this.name = name;
    }

    public void walk(){
        System.out.println(this.name+" is walking");
    }

    public void sound(){
        System.out.println(this.name+" is sounding");
    }
//    public String sound(String a){
//        System.out.println(a+" is sounding");
//        return a;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
