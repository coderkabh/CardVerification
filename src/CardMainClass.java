import java.util.Scanner;

public class CardMainClass {
    private int[] cardNumber = new int[16];
    private int[] cardNumber2 = new int[16];
    private int cardNumberSum=0;
    long l;
    private String inputString;
    public static void main(String[] args){

        CardFunctions cardFunctions= new CardFunctions();
        CardMainClass cmc = new CardMainClass();
        Scanner scan = new Scanner(System.in);
        int j=16;
        System.out.println("Enter the Card Number without spaces:");
        cmc.inputString = scan.next();
        try {
                Long input = Long.parseLong(cmc.inputString);
                System.out.println(input);
                for (int i = 0; i < 16; i++) {
                    cmc.cardNumber2[i] = (int) (input % 10);
                    input = input / 10;
                }

                for (int i = 0; i < cmc.cardNumber2.length; i++) {

                    cmc.cardNumber[j - 1] = cmc.cardNumber2[i];
                    j -= 1;
                }

                for (int i = 0; i < cmc.cardNumber.length; i += 2) {
                    cmc.cardNumberSum += cardFunctions.cardIndexDigitSum(cmc.cardNumber[i]);
                }
                for (int i = 1; i < cmc.cardNumber.length; i += 2) {
                    cmc.cardNumberSum += cmc.cardNumber[i];
                }
                if (cmc.cardNumberSum % 10 == 0) {
                    System.out.println(" Yes! The card number is valid ");
                } else {
                    System.out.println(" No! The card number is not valid ");
                }

            }
        catch(NumberFormatException e){
                System.out.println("Sorry! Only digits (Positive integers) are allowed. ");
            }
        catch(Exception e){
                System.out.println("Oops! Something went wrong. Please report it to \"github.com/coderkabh\" ");
            }

    }
}
