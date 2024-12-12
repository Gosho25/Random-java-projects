public class ChangePersonality {
    String name;
    int age;

    public ChangePersonality(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void celebrateBirthday(){
        age++;
    }

    public void changeName(String newName){
        this.name = newName;
    }
}
