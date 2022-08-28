package javaBasicsTest.TypeCounter;

public class contadorTipos {
    public static void main(String[] args) {
        String sentence = "can you give me 10 bucks puff  in 7.5 or 7";
        String[] split = sentence.split(" ");

        for (String i:split
             ) {
            System.out.println(i);
        }

        long countString = 0;
        long countLong = 0;
        long countDouble = 0;

        for (String i : split) {
            try {
                Long.parseLong(i);
                countLong++;
                continue;
            } catch (Exception e) {
                //
            }
            try {
                Double.parseDouble(i);
                countDouble++;
                continue;
            } catch (Exception e) {
                //
            }

            if(!i.equals("")){
                countString++;
            }
        }
        System.out.println("string " + countString);
        System.out.println("integer " + countLong);
        System.out.println("double " + countDouble);
    }
}
