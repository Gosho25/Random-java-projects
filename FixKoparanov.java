import java.util.Arrays;

public class FixKoparanov {
    public static void main(String[] args) {
        String[] list = new String[30];
        list[0] = "Student1";
        list[1] = "Student2";
        list[2] = "Student3";
        list[3] = "===== (Student4 left school) :( =====";
        list[4] = "Student5";
        list[5] = "Student6";
        list[6] = "Student7";
        list[7] = "Student8";
        list[8] = "Отсъства";
        list[9] = "Student10";
        list[10] = "Student11";
        list[11] = "Student12";
        list[12] = "Student13";
        list[13] = "Student14";
        list[14] = "Student15";
        list[15] = "Отсъства";
        list[16] = "Student17";
        list[17] = "Student18";
        list[18] = "Student19";
        list[19] = "Student20";
        list[20] = "Student21";
        list[21] = "Student22";
        list[22] = "Student23";
        list[23] = "Student24";
        list[24] = "Student25";
        list[25] = "Student26";
        list[26] = "Student27";
        list[27] = "Отсъства";
        list[28] = "Student29";
        list[29] = "Student30";


        StringBuilder nonAbsentStudents = new StringBuilder();
        
        for (int i = 0; i < list.length; i++) {
            if (!Objects.equals(list[i], "Отсъства")) {
                // Append to the result string if not "Отсъства"
                nonAbsentStudents.append(list[i]).append(", ");
            }
        }

        // Output the students who are not "Отсъства"
        System.out.println("Students: " + nonAbsentStudents.toString().replaceAll(", $", ""));

    }

}
