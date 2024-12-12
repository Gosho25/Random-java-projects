public class Person {
    //без да дефинираме променливи не можем да ги ползваме в конструктура
    public int age;
    public String name;
    public Person(int age, String name){//Конструктора трябва да се казва така, както се казва и класа
        this.age = age;//this показва, че искаме ТЕЗИ години в public int-a
        this.name = name;//няма ли ги дава ГРЕШКА
    }

    public static void main(String[] args) {
       Person bobu = new Person(23, "Bobu");//пишем данните подред така, както са подред в конструктура
        //Person е името на класа и съсздаваме НОВ обект(обекта е bobu) за конструктура Person
        System.out.println(bobu.age);
        System.out.println(bobu.name);//трябва да покажем кое искаме да принтираме
        System.out.println("Име на човека: " + bobu.name + " " + "\n" + "Години на човека: " + bobu.age);
        // \n трябва да е в кавички за да го принтира на нов ред
    }

}
