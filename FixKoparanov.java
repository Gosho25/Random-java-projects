import java.util.Arrays;

public class FixKoparanov { 
    public static void main(String[] args) {
        ArrayList<String> cl222 = new ArrayList<>();
        cl222.add("S1");
        cl222.add("Missing"); 
        cl222.add("S3"); 
        cl222.add("==");
        cl222.add("S5");
        cl222.add("S6"); 
        cl222.add("S7");
        cl222.add("S8");
        cl222.add("Missing");
        cl222.add("S10");
        cl222.add("S11");
        cl222.add("S12");
        cl222.add("S13");
        cl222.add("S14");
        cl222.add("S15");
        cl222.add("S16");
        cl222.add("S17");
        cl222.add("Missing");
        cl222.add("S19");
        cl222.add("S20");
        cl222.add("S21");
        cl222.add("S22");
        cl222.add("Missing");
        cl222.add("S24");
        cl222.add("S25");
        cl222.add("S26");
        cl222.add("Missing");
        cl222.add("S28");
        cl222.add("S29");
        cl222.add("Missing");

        System.out.println("======= Attendees =======");
        for(String here : cl222){
            if(Objects.equals(here, "Missing")){
                continue;
            }
            else{
                System.out.println(here);
            }
        }
        System.out.println("===============");


        for(String miss : cl222){
            if(miss != "Missing"){
                continue;
            }
            else{
                System.out.println(miss);
            }
        }

    }

}
