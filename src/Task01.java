import java.util.ArrayList;

public class Task01 implements UserInput {
    public static void runSolution() throws Exception{
        System.out.println("Введите строку для подсчета количества одинаковых символов в ней: ");
        String inputString = reader.readLine();
        charCount(inputString);
        reader.close();

    }
    private static void charCount(String s){
        char[] charList = s.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();
        for(int i = 0; i < charList.length; i++){
            char c = charList[i];
            if(!arrayList.contains(c)){
                arrayList.add(c);
            }
        }
        String countedString = "";
        for(int i = 0; i < arrayList.size(); i++){
            char c = arrayList.get(i);
            int permCount = 0;
            for(int j = 0; j < charList.length; j++){
                char c1 = charList[j];
                if(c == c1){
                    permCount++;
                }
            }
            countedString = countedString + c + permCount;
        }
        System.out.println(countedString);

    }
}
