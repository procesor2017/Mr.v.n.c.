public class Character {
    public int hp = 100;

    public int characterDef(int damage){
        hp = hp - damage;
        return hp;
    }
}
