public class SortOfSort {

    public int [] sortOfSort(int [] array) {
       int arrStart = 0;
       int arrLength = array.length - 1;
       boolean goRight = true;
       int leftOrRight = 0;
        for(int i = 0; i <= array.length - 1; i++) {
            int [] coors = findMaxAndIndex(array, arrStart, arrLength);
            int maxNum = coors[0];
            int maxIndex = coors[1];

            if (arrStart < arrLength) {
                if (goRight) {
                    swap(array, arrLength,maxIndex, maxNum);
                    arrLength--;
                }
                else {
                    swap(array,arrStart,maxIndex,maxNum);
                    arrStart++;
                }
            }
            leftOrRight++;

            if (leftOrRight == 2) {
                leftOrRight = 0;
                goRight = !goRight;
            }
        }
        return array;
    }

    public int [] findMaxAndIndex(int [] array, int start, int length){
        int maxNum = 0;
        int maxIndex = 0;
        for(int i = 0; i < array.length -1; i++){
            maxNum = findMin(array);
            maxIndex = i;
            for (int j = start; j <= length; j++) {
                if (array[j] > maxNum) {
                    maxNum = array[j];
                    maxIndex = j;
                }
            }
        }

        int [] numAndIndex = {maxNum, maxIndex};
        return numAndIndex;

    }

    public int findMin(int [] array){
        int minNum = array[0];
        for (int j = 0; j < array.length ; j++) {
            if (array[j] <= minNum) {
                minNum = array[j];
            }
        }
        return minNum;
    }

    public void swap(int [] array, int startIndex, int maxIndex, int maxNum){
        int temp = array[startIndex];
        array[startIndex] = maxNum;
        array[maxIndex] = temp;
    }
}