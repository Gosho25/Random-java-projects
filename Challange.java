public class Challange {
    public static String getFirstPart(String s) {
        if(s.contains("," )){
            int commaIndex = s.indexOf(",");
            return s.substring(0, commaIndex);
        }else{  
            return "NONE";
        }
    }
}
