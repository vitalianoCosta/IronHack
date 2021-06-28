package week3_2606;

public class Exercise {


    public static void main(String[] args) {
     //   String firstName = "";
     //   String lastName = "to";

        try {
            System.out.println(fullName("jo", ""));
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
    }
    public static String fullName(String str1, String str2) {
        String fullName = str1 + " " + str2;
        if (str1 == null || str1.isEmpty() || str2 == null || str2.isEmpty()){
            throw new NullPointerException("It's empty or null");
        }
        return fullName;
    }
//tete merge
}
