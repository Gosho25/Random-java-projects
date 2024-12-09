public class zad17 {
    public static void main(String[] args) {
        var x = 100;
        var y = false;
        var z = 1.2f;// f е излишно, защото намира че типът е float
        var z1 = 1.2;
        var l = 1.2;//При long  същото, но ако се добави l накрая дава грешка
        System.out.println(x);
        System.out.print(y);
        System.out.print(z);
        System.out.println(z1);
        System.out.println();
        //Syste.out.print(); - НЕ принтира НОВ РЕД
        System.out.println(l);
        //var-тип, който намира какъв е типа на променливата СЛЕД ЗАДАДЕНА СТОЙНОСТ(т.е. ще даде грешка, но ще бъде оправена след задаване на стойност на променливата)
        //използва се ако незнаем какъв тип да използваме за променливата
        //ВНИМАВАЙТЕ С УПОТРЕБАТА

        byte[] arr = {1, 2, 4, 5, 6};
        //var не може да се използва за деклариране на масиви

    }
}
