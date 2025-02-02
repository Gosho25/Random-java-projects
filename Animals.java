class Animal {
    String type;
    String voice;

    public Animal(String type, String voice) {
        this.type = type;
        this.voice = voice;
    }  
} 
 
class Main2 { 
    public static void main(String[] args) {
        Animal cow = new Animal("cow", "Moo");
        Animal dog = new Animal("dpg", "Woof");
        System.out.println(cow.type + " is making " + cow.voice);
        System.out.println(dog.type + " is making " + dog.voice);
    }
}
