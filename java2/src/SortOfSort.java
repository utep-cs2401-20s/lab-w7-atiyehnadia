public class SortOfSort {
    public static void main (String [] args){
        int []  arr = {2,7,1,3,0,9,6,5};
        sortOfSort(arr);

    }
    public static void sortOfSort(int [] array) {
        boolean goRight = true;
        int leftOrRight = 0;
        int max = 0;


            if (goRight) {
                for(int i = 0; i < array.length; i++){
                    int maxArr = findMax(array);
                    int n = findMaxIndex(array);
                    int temp = array[n];
                    array[n] = maxArr;
                    array[maxArr] = temp;
                }
                leftOrRight++;
            }



        if(leftOrRight == 2){
            leftOrRight = 0;
            goRight = false;
        }





//        int n = array.length - 1;
//        int biggestNum = findMax(array);
//        int biggestNumIndex = findMaxIndex(array);
//        int temp1 = array[n];
//        array[n] = biggestNum;
//        array[biggestNumIndex] = temp1;
//
//        int[] tempArr = new int[n];
//        for (int i = 0; i < tempArr.length; i++) {
//            tempArr[i] = array[i];
//            //System.out.print(tempArr[i] + " ");
//
//        }
//        System.out.println();
//
//        int secondBiggestNum = findMax(tempArr);
//        int secondBiggestNumIndex = findMaxIndex(tempArr);
//        int temp2 = array[n - 1];
//        array[n - 1] = secondBiggestNum;
//        array[secondBiggestNumIndex] = temp2;
//
//        int[] tempArr2 = new int[n - 1];
//        for (int i = 0; i < tempArr2.length; i++) {
//            tempArr2[i] = array[i];
//            //System.out.print(tempArr2[i] + " ");
//
//        }
//        System.out.println();
//
//        int third = findMax(tempArr2);
//        int thirdIndex = findMaxIndex(tempArr2);
//        int temp3 = array[0];
//        array[0] = third;
//        array[thirdIndex] = temp3;
//
//        int[] tempArr3 = new int[n - 1];
//        for (int i = 1; i < tempArr3.length; i++) {
//            tempArr3[i] = array[i];
//            System.out.print(tempArr3[i] + " ");
//
//        }
//        System.out.println();
//
//        int fourth = findMax(tempArr3);
//        int fourthIndex = findMaxIndex(tempArr3);
//        int temp4 = array[1];
//        array[1] = fourth;
//        array[fourthIndex] = temp4;
//
//        int[] tempArr4 = new int[n-1];
//        for (int i = 2; i < tempArr4.length; i++) {
//            tempArr4[i] = array[i];
//            System.out.print(tempArr4[i] + " ");
//
//        }
//        System.out.println();

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] +" ");
        }
    }






    public static int  findMax(int [] array){
        int maximum = array[0];
        for(int i = 0; i < array.length - 1; i++){
            if (array[i] > maximum){
                maximum = array[i];
            }
        }

        return maximum;
    }

    public static int findMaxIndex(int [] array){
        int index = 0;
        int maximum = array[0];
        for(int i = 0; i <= array.length - 1; i++){
            if (array[i] > maximum){
                maximum = array[i];
            }
        }
       for(int i = 0; i < array.length; i++){
           if(array[i] >= maximum){
               index = i;
           }
       }
       return index;
    }


//    public static int [] selectionSortRight(int [] array){
//        for(int i = 0; i < array.length - 1; i++){
//            int min = i;
//            for(int j = i +1; j < array.length; j++){
//                if(array[j] > array[min]){
//                    min = j;
//                }
//            }
//            int temp = array[min];
//            array[min] = array[i+1];
//            array[i+1] = temp;
//        }
//        return array;
//    }
}
