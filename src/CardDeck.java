import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    List<List<String>> cardFinalDeck = new ArrayList<>();

    public static void main(String[] args) {
        Character character = new Character();
        CardDeck cardDeck = new CardDeck();
        cardDeck.addCard("1");
        cardDeck.addCard("2");
        System.out.println(cardDeck.cardFinalDeck);
        cardDeck.useCard("1");
        System.out.println(cardDeck.useCard("1"));

    }

    public void addCard(String s){
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("./src/card.csv"));
            String row;
            while ((row = csvReader.readLine()) != null){
                String[] data = row.split(",");
                if (data[0].equals(s)){
                    List<String> list = new ArrayList<>();

                    for (int i = 0; data.length > i; i++){
                        list.add(data[i]);
                    }
                    cardFinalDeck.add(list);
                }
            }
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String useCard(String s) {
        int giveDmg = 0;
        for (int i = 0; i < cardFinalDeck.size(); i++) {
            String[] cardId = cardFinalDeck.get(i).toArray(new String[0]);
            if (cardId[0].equals(s)){
                int dmg = Integer.parseInt(cardId[4]);
                return cardId[4];
            }
        }
        return s;
    }
}

