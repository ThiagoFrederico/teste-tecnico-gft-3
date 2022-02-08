package exercLetra;

public class Main {

    public static void main(String[] args) {
        String[] frases = {"aaabccccdeeef","strings","microsoft visual studio 2022","abcedoftz","microsoft visual studio 2022"};


        for(String frase : frases) {
            letraNaoRepetida(frase);
        }
    }

    public static void letraNaoRepetida(String str) {
        String char1 = null;

        do {
            try {
                char1 = String.valueOf(str.charAt(0));
            } catch (Exception e) {
                System.out.println("_");
                break;
            }

            str = str.substring(1, str.length());

            if (str.contains(char1)) {
                str = str.replaceAll(char1, "");
            } else {
                System.out.println(char1);
                break;
            }

        } while (!false) ;
    }
}