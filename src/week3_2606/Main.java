package week3_2606;

public class Main {
    public static void main(String[] args) {

            try {
                int[] nums = new int[5];
                System.out.println("Try 1");
                errorMethod(nums);
                System.out.println("Try 2");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Catch 1");

            } catch (Exception e) {
                System.out.println("Catch 2");
                //return termina aqui e não corre mais
                return;
            }
            finally {
                System.out.println("Rest of program very important");
            }
        System.out.println("Rest of the program");
    }

    public static void errorMethod(int [] nums){
        nums[10] = 25;
    }
}
