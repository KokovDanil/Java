package sample;

public class Main {

        public static void main(String[] args){
            String test = "rrtyyy";
            String result = encode(test);
            System.out.println(result);
        }


        public static String encode(String word){
            word = word.toLowerCase();
            String result = "";
            for (int i = 0; i < word.length(); ++i) {
                char c = word.charAt(i);
                result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
            }
            return result;
        }
}