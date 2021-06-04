package laba1;

public class CreateColoda {
    private int numberPlayers;

    public int getNumberPlayers() {
        return numberPlayers;
    }

    public void setNumberPlayers(int numberPlayers) {
        if (numberPlayers < 10 && numberPlayers > 1) {
            this.numberPlayers = numberPlayers;
        }
        else {
            System.out.println("Игроков не может быть больше десяти или меньше одного");
        }
    }

    private String[] coloda = new String[PlayingCard.RANK_LIST.length * PlayingCard.SUITS_LIST.length];

    public CreateColoda() {
        numberPlayers = 0;
        int count = 0;

        for (int i = 0; i <  PlayingCard.SUITS_LIST.length; i++) {
            for (int j = 0; j < PlayingCard.RANK_LIST.length; j++) {
                PlayingCard oneCard = new PlayingCard(PlayingCard.SUITS_LIST[i], PlayingCard.RANK_LIST[j]) ;
                coloda[count] = oneCard.toString();
                System.out.println(coloda[count]);
                count = count + 1;
            }
        }
    }

}
