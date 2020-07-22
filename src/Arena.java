public class Arena {
    public static void main(String[] args) {
        Character character = new Character();
        CardDeck cardDeck = new CardDeck();
        cardDeck.addCard("1");
        cardDeck.addCard("2");
        System.out.println(cardDeck.cardFinalDeck);
        int dmg = Integer.parseInt(cardDeck.useCard("1"));
        System.out.println(character.characterDef(dmg));

    }
}
