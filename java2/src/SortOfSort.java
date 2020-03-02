public class SortOfSort {
    public static void main (String [] args){
        int []  arr = {2,7,1,3,0,9,6,5};
        sortOfSort(arr);
    }
    public static void sortOfSort(int [] array){
        int n = array.length;
        for(int i = 0 ; i < n -1 ; i++){
            for(int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(array[i]);
        }
    }

//    public int findMax(int [] array){
//        int maximum;
//        for(int i = 0; i < array.length - 1; i++){
//            maximum = array[0];
//            if (array[i] > maximum){
//                maximum = array[i];
//            }
//        }
//        return maximum;
//    }


}
