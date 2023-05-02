package events;

public class Toy implements Comparable<Toy> {
    private int id;
    private String text;
    private int chance;

    // сбор класса
    public Toy(int id, String text,int chance){
        this.id = id;
        this.text = text;
        this.chance = chance;
    }

    public String GetText(){
        return this.text;
    }

    // компоратор для сравнения
    @Override
    public int compareTo(Toy toy) {
        return this.chance - toy.chance;
    }
}
