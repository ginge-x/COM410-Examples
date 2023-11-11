public class CardTest {

    public static void main(String[] args){

        Deck deck = new Deck();
//        System.out.println(deck);

        for (int i = 0; i < 5; i++){
            System.out.println(deck.deal());
        }


//        System.out.println(deck);
    }
}