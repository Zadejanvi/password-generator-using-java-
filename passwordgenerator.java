import java.util.Random;

public class passwordgenerator {
    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
        String lower = "abcdefghijklmnopqrstuvxyz";
        String num = "0123456789";
        String specialcharacter = "<>,.?/*-+!@#$%^&";
        String combination = upper+lower+num+specialcharacter;
        int len = 8;
        char[] password = new char[len];
        Random r = new Random();
        for(int i=0;i<len;i++) {
            password[i]=combination.charAt(r.nextInt(combination.length()));
        }
        System.out.println("Generated Password : "+new String(password));
    }
}
