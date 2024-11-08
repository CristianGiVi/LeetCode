//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] list = {"popaco","pope","posterior"};

        System.out.println(common(list));
    }

    public static String common(String[] list){

        int minLenghtWord = 201;
        String minWord = "";
        for (String word : list) {
            if(word.length() <= minLenghtWord){
                minLenghtWord = word.length();
                minWord = word;
            }
        }

        boolean val = false;
        StringBuilder pref = new StringBuilder();

        for (int i = 0; i < minWord.length(); i++) {
            for (int j = 0; j < list.length; j++) {
                char word = list[j].charAt(i);
                if(word != minWord.charAt(i)){
                    val = true;
                    break;
                }
            }

            if (val){
                break;
            }
            pref.append(minWord.charAt(i));
        }

        return pref.toString();
    }



}