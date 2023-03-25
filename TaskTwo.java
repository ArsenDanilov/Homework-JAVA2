import java.util.Arrays;
import java.util.logging.*;
import java.util.logging.Level;

public class TaskTwo {
    private static final Logger LOGGER = Logger.getLogger(TaskTwo.class.getName());
    public static void main(String[] args) {
        int [] array = {10, 5, 6, 7, 1, 54, 12, 125, 12, 97, 6, 4};
        BubbleSort(array);
    }


    static void BubbleSort(int [] array){
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            LOGGER.log(Level.INFO, "After iteration " + (i+1) + ": " + Arrays.toString(array));
        }
    }
}


