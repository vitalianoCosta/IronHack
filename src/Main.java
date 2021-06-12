public class Main {
    public static void main(String[] args) {

    }
        public static void multiplyArray(int[] array){
            //int[] finalArray = new int[array.length];
            if(array.length < 1){
                System.out.println("Array too small");
            }else{
                int first = array[0];
                for (int i = 0; i < array.length; i++) {
                    if (i == array.length - 1) {
                        array[i] *= first;
                    } else {
                        array[i] *= array[i + 1];
                    }
                }
                for(int k = 0; k < array.length; k++){
                    System.out.println(array[k]);
                }
            }
        }
        public static void invertArray(int[] array){
            for(int i = 0; i < array.length/2; i++){
                int temp = array[i];
                array[i] = array[array.length-i-1];
                array[array.length-i-1] = temp;
            }
        }
    }
