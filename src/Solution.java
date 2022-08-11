public class Solution implements UserInput{
    public static void main(String[] args) throws Exception {
        System.out.println("Введите номер задачи (1 или 2) для отображения ее решения: ");
        String userInput = reader.readLine();
        if(userInput.equals("1")) {
            Task01.runSolution();
        }
        else if(userInput.equals("2")){
            Task02.runSolution();

        }
        else {
            System.out.println("Введенный некорректный номер. Пожалуйста, перезапустите программу и попробуйте снова.");
        }
        reader.close();
    }
}
