public class UniqueElementsFinder {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 1, 9, 10, 5};

        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            // Check if the current element is a duplicate of any other element in the array
            for (int j = 0; j < array.length; j++) {
                if ( i!=j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            
            // If the element is unique, print it
            if (isUnique) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
