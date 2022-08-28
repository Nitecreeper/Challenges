package javaBasicsTest.decripter;

public class Decripter {
    public static void main(String[] args) {
        String encMess = "world hel2o a5h tengo pereza";
        String[] splited = encMess.split(" ");
        String[] reversedMessage = new String[splited.length];

        for (int i = 0; i < splited.length; i++){

            String word = splited[i];

            for (int k = 0; k < word.length();k++){
                try{
                    int c = Integer.parseInt(String.valueOf(word.charAt(k)));
                    word = word.substring(0,k) + word.substring(k+1);
                    for (int j = 1; j<c ;j++){
                        word = word.substring(0,k) + word.charAt(k-1) + word.substring(k);
                    }
                }catch (Exception e) {
                    //
                }
            }

            splited[i] = word;
        }

        for (int i = splited.length - 1; i >= 0; i--) {
            reversedMessage[i] = splited[splited.length - i - 1];
        }

        for (String i : reversedMessage
        ) {
            System.out.println(i);
        }

        String joined = String.join(" ",reversedMessage);

        System.out.println(joined);
    }

}
