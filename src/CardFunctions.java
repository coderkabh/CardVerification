public class CardFunctions {
    int cardIndexDigitSum(int index) {

        if (((index*2) / 10) == 0 ) {
            return (index*2);
        }
        else{
            return ((index*2)%10)+((index*2)/10);
        }
    }
}

