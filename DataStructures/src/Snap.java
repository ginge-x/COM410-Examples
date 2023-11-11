public class Snap {

    public static void main(String[] args){
        Deck deck = new Deck();
        Card card1, card2;
        int numSnaps = 0, numSuperSnaps = 0;

        card1 = deck.deal();
        System.out.println(card1);
        for (int i = 0; i < 51; i++){
            card2 = deck.deal();
            System.out.println(card2);
            if (card1.getRankValue() == card2.getRankValue()){
                if (card1.getColour().equals(card2.getColour())){
                    System.out.println("SUPERSNAP!!!");
                    numSuperSnaps++;
                }else {
                    System.out.println("SNAP!!!");
                }
                numSnaps++;
            }
            card1 = card2;
        }
        System.out.printf("We had %d snaps of which %d were supersnaps\n", numSnaps, numSuperSnaps);
    }

}
