public class Main {
   public static int findMax(int[] array){
    if(array == null || array.length == 0){
        throw new IllegalAccessException("Arrat not must be null  or empty");
    }
    int max = array[0];
    for(int i  = 1; i < array.length; i++){
        if(array[i] > max){
            max  = array[i]
        }
    }
    return max;
   }
   public static void main(String[] args){
    int[] array1 = {1,2,4,5,6,7,5,10};
    int[] array2 = {2,34,43,23,43,443}; 
    int[] array3 = {3,33,434,43,443,243};
    System.out.println(findMax(array1));
    System.out.println(findMax(array2));
    System.out.println(findMax(array3));
   }
}