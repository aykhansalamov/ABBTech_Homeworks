package homework4;

public class Pet {
    String species;
    String nickname;
    int trickLevel;
    int age;
    String [] habits;

    public Pet () {

    }
    
    @Override
    public String toString(){
        return species + ", ";
    }


    public Pet (String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.trickLevel = trickLevel;
        this.age = age;
        this.habits = habits;

    }

    public  void eat() {
        System.out.println("I am eating.");
    }
    public void respond() {
        System.out.println("Hello, owner. I am " + this.nickname + ". I miss you!");
    }
    public void foul() {
        System.out.println("I need to cover it up.");
    }
}
