import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    List<List<String>> cardFinalDeck = new ArrayList<>();

    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        cardDeck.addCard("1");
        cardDeck.addCard("2");
        System.out.println(cardDeck.cardFinalDeck);
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
}

