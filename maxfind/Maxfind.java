package maxfind;

public class Maxfind {
    public static int findMax(int[] array){
        if(array == null || array.length == 0){
            throw new IllegalArgumentException("Array  not be must be null and empty");
        }
    int max = array[0];
    for(int i  = 1; i < array.length; i++){
        if(array[i] > max){
            max = array[i];
        }
    }
    return max;
     }
     public static void main(String[] args){
        int[] array1 = {1,2,3,4,5,6,7,8,20};
        int[] array2 = {3,32,323,323,3};
        int[] array3 = {4,3,3,4,5,6,7,6,32};
        System.out.println(array1);
        System.out.println(array2);
        System.out.println(array3);
        
     }
}
