import java.util.Arrays;

public class Task02 {
    public static void runSolution(){
        String source = "2? + ?5 = 6?";
        int n = 3;
        int k = 10;
        int[] array = new int[n];
        System.out.println("Входное выражение: \n" + source);
        generateCombination(array, 0, k, source);
    }

    private static void generateCombination(int[] array, int index, int k, String source) {
        if(index == array.length){
            checkAnswer(array, source);
            return;
        }
        for (int i = 0; i < k; i++) {
                array[index] = i;
                generateCombination(array, index + 1, k, source);
            }
    }

    private static void checkAnswer(int[] array, String source){
        char[] perm = new char[array.length];
        for (int i = 0; i < perm.length; i++){
            perm[i] = Character.forDigit(array[i], 10);
        }
        String[] sArray = source.split(" ");
        String s1 = sArray[0];
        s1 = s1.replace('?', perm[0]);
        String s2 = sArray[2];
        s2 = s2.replace('?', perm[1]);
        String s3 = sArray[4];
        s3 = s3.replace('?', perm[2]);
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        int i3 = Integer.parseInt(s3);
        if(i1+i2==i3){
            System.out.println("Найдено решение: " + i1 + "+" + i2 + "=" + i3);
        }
    }
}
