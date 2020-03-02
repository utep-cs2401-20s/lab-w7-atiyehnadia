public class SortOfSort {
    public void sortOfSort(int [] array){
        int biggestNumber = 0;
        biggestNumber = findMax(array);
        int [] tempArray = new int[array.length];


    }

    public int findMax(int [] array){
        int maximum;
        for(int i = 0; i < array.length - 1; i++){
            maximum = array[0];
            if (array[i] > maximum){
                maximum = array[i];
            }
        }
        return maximum;
    }
}
