import java.util.Random;

public class Soal1 {
    public static void main(String[] args) {

        String serial1 ="bu6e";
        String serial2 = "wdts";
        String serial3 = "7fo4";
        String serial4 = "8ipx";
        String randomString1 = "";
        String randomString2 = "";
        String randomString3 = "";
        String randomString4 = "";
        int length = 4;

        Random rand = new Random();

        char[] text = new char[length];
        char[] text2 = new char[length];
        char[] text3 = new char[length];
        char[] text4 = new char[length];

        for (int i = 0; i < length; i++){
            text[i] = serial1.charAt(rand.nextInt(serial1.length()));
            text2[i] = serial2.charAt(rand.nextInt(serial2.length()));
            text3[i] = serial3.charAt(rand.nextInt(serial3.length()));
            text4[i] = serial4.charAt(rand.nextInt(serial4.length()));

        }

        // Serial 1
        for(int i = 0; i < text.length; i++){
            randomString1 += text[i];
        }

        // Serial 2
        for(int i = 0; i < text2.length; i++){
            randomString2 += text2[i];
        }

        // Serial 3
        for(int i = 0; i < text3.length; i++){
            randomString3 += text3[i];
        }

        // Serial 4
        for(int i = 0; i < text4.length; i++){
            randomString4 += text4[i];
        }

        System.out.println("Serial number : " + randomString1 + "-" +
                randomString2 + "-" + randomString3 + "-" + randomString4);
    }
}
