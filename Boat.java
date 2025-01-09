public class Boat {

    // Define global variables
    public static int vulk = 1; // VULK :: ако е на ЛЕВИЯ БРЯГ е 1 = ако е на ДЕСНИЯ БРЯГ е 10 (т.е. 1 * 10);
    public static int koza = 2; // KOZA :: ако е на ЛЕВИЯ БРЯГ е 2 = ако е на ДЕСНИЯ БРЯГ е 20 (т.е. 2 * 10);
    public static int zelka = 3; // ZELKA :: ако е на ЛЕВИЯ БРЯГ е 3 = ако е на ДЕСНИЯ БРЯГ е 30 (т.е. 3 * 10);

    public static boolean answer = true;
 
    public static void main(String[] args) {
 

        // проверка дали всички са прехвърлени на десния бряг
        while (vulk == 1 || koza == 2 || zelka == 3) {


            // Try to move VULK to RIGHT :: ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
            if (vulk == 1) {

                vulk = vulk * 10;

                System.out.println();
                System.out.println("Try to move 'vulk' To The RIGHT !");


                if (isForbiddenOnTheLEFT()) {
                    vulk = vulk / 10;
                    System.out.println("Can't move 'vulk' To The RIGHT !");


                } else if (isForbiddenOnTheRIGHT()) {
                    if (koza == 20) {
                        koza = koza / 10;
                        System.out.println("Moving BACK 'koza' To The LEFT !");
                    } else if (zelka == 30) {
                        zelka = zelka / 10;
                        System.out.println("Moving BACK 'zelka' To The LEFT !");
                    } else {
                        vulk = vulk / 10;
                        System.out.println("Moving BACK 'vulk' To The LEFT !");
                    }
                }

                else{
                    System.out.println("Vulk is on the RIGHT !");
                }

            } // end try vulk


            // Try to move KOZA to RIGHT :: ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
            if (koza == 2) {

                koza = koza * 10;

                System.out.println();
                System.out.println("Try to move 'koza' To The RIGHT !");


                if (isForbiddenOnTheLEFT()) {
                    koza = koza / 10;
                    System.out.println("Can't move 'koza' To The RIGHT !");


                } else if (isForbiddenOnTheRIGHT()) {
                    if (vulk == 10) {
                        vulk = 1;
                        System.out.println("Moving BACK 'vulk' To The LEFT !");
                    }
                    else if (zelka == 30) {
                        zelka = zelka / 10;
                        System.out.println("Moving BACK 'zelka' To The LEFT !");
                    } else {
                        koza = koza / 10;
                        System.out.println("Moving BACK 'koza' To The LEFT !");
                    }
                }

                else{
                    System.out.println("Koza is on the RIGHT !");
                }

            } // end try koza


            // Try to move ZELKA to RIGHT :: ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
            if (zelka == 3) {

                zelka = zelka * 10;

                System.out.println();
                System.out.println("Try to move 'zelka' To The RIGHT !");


                if (isForbiddenOnTheLEFT()) {
                    zelka = zelka / 10;
                    System.out.println("Can't move 'zelka' To The RIGHT !");


                } else if (isForbiddenOnTheRIGHT()) {
                    if (koza == 20) {
                        koza = koza / 10;
                        System.out.println("Moving BACK 'koza' To The LEFT !");
                    } else if (vulk == 10) {
                        vulk = vulk / 10;
                        System.out.println("Moving BACK 'vulk' To The LEFT !");
                    } else {
                        zelka = zelka / 10;
                        System.out.println("Moving BACK 'zelka' To The LEFT !");
                    }
                }

                else {
                    System.out.println("Zelka is on the RIGHT !");
                }

            } // end try zelka

        } // end while


        System.out.println();
        System.out.println("Vulk is : " + vulk + "  on the RIGHT ! ! !");
        System.out.println("Koza is : " + koza + "  on the RIGHT ! ! !");
        System.out.println("Zelka is : " + zelka + "  on the RIGHT ! ! !");


    }


    // UTILITY METHODS :: /////////////////////////////////////////////////////////////////////////////////////////////
    public static boolean isForbiddenOnTheLEFT() {
        answer = (vulk == 1 && koza == 2 && zelka != 3) || (koza == 2 && zelka == 3 && vulk != 1);
        return answer;
    }


    public static boolean isForbiddenOnTheRIGHT() {
        answer = (vulk == 10 && koza == 20 && zelka != 30) || (koza == 20 && zelka == 30 && vulk != 10);
        return answer;

    }
}
