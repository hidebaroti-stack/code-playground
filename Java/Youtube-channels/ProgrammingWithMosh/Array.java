import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 1, 4};
        System.out.println("Length: " + numbers.length);
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));

        int[][] numbers2 = new int[2][3];
        numbers2[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers2));

    }
}
