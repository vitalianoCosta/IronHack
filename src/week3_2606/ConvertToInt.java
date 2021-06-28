package week3_2606;

public class ConvertToInt {

public static int ConvertToInt(String str){
    try{
        return Integer.parseInt(str);
    }
    catch(NumberFormatException e){
        System.out.println("An error has occured");
        return 0;
    }
}

    public static void main(String[] args) {
        ConvertToInt in = new ConvertToInt();
        System.out.println(ConvertToInt("45"));
    }
}
