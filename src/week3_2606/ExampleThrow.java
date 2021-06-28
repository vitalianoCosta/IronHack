package week3_2606;

public class ExampleThrow {
    public static void main(String[] args) {
        int[] sampleArray = null;

        try{
            printArray(sampleArray);
        }catch(NullPointerException e){
            System.out.println("PrintArray only accepts properly initialized integer arrays");
        }
    }
    public static void printArray(int[] numArray) throws NullPointerException{
        for (int i = 0; i<numArray.length; i++){
            System.out.println(numArray[i]);
        }
    }
}
