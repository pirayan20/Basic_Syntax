import java.util.Arrays;

public class test {
    public static void main(String[] args){
        int[] deck = {1,2,3,4,5,6,7};
        int[] newdeck = Arrays.copyOf(deck, deck.length-1);
        for (int i=0; i<newdeck.length;i++){
            if (i >= 4){
                newdeck[i] = deck[i+1];
            }
        }
        System.out.println(Arrays.toString(newdeck));

    }
}
