//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.util.logging.*;
import java.io.IOException;
import java.util.Arrays;

public class z1 {

    public static final Logger logs = Logger.getLogger(z1.class.getName());

    public static String bubbleSort (int[] nums) {
        int temp = 0;
        boolean check = true;

        while (check) {
            check = false;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    logs.info(Arrays.toString(nums));
                    check = true;
                }
            }
        }
        return Arrays.toString(nums);
    }
    public static void main(String[] args) throws SecurityException, IOException {
        
        logs.setUseParentHandlers(false);
        FileHandler fHandler = new FileHandler("logs_z1.txt");
        logs.addHandler(fHandler);
        SimpleFormatter sFormat = new SimpleFormatter();
        fHandler.setFormatter(sFormat);

        int[] numbers = {5, 4, 1, 9, 8, 2, 7, 3, 6};
        logs.info(Arrays.toString(numbers));

        System.out.println(bubbleSort(numbers)); 
    }
}
