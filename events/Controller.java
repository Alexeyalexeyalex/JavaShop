package events;
import events.View;
import events.Toy;
import java.lang.reflect.Array;
import java.util.PriorityQueue;
import java.util.Random;
import events.MenuActions;
import events.FileWrite;

public class Controller {

    protected View view = new View();
    protected MenuActions menu = new MenuActions();
    protected PriorityQueue<Toy> toys = new PriorityQueue<>();

    public void Start(){
        //добавление игрушек
        for (int i = 0; i < 4; i++) {
            GetToy();
        }
        //запись выигрышей
        FileWrite file = new FileWrite();
        for (int i = 0; i < 10; i++) {
            Toy toy = GetRandomToy(toys);
            file.write(toy);

        }
        
    }

    public void GetToy(){
        //получение информации об игрушке
        view.PrintGetId();
        int id = Integer.parseInt(menu.GetId());
        
        view.PrintGetText();
        String text = menu.GetText();

        view.PrintGetChance();
        int chance = Integer.parseInt(menu.GetChance());
        //создание объекта
        Toy toy = new Toy(id,text,chance);
        //добавление игрушек с учетом шанса выпадения
        for (int i = 0; i < chance; i++) {
            toys.add(toy);    
        }        
    }

    //случайный выбор победной игрушки
    public Toy GetRandomToy(PriorityQueue<Toy> toys){
        Random rnd = new Random();
        Object[] ArrayToys = toys.toArray();
        Toy toy = (Toy) ArrayToys[rnd.nextInt(toys.size())];
        return toy;
    }
}
