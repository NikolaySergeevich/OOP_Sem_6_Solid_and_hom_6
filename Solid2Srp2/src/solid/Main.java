package solid;

import solid.srp.models.Order;
import src.solid.repozitory.JsonSaver;
import src.solid.views.ConsoleInput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        ConsoleInput input = new ConsoleInput();
        Order order = input.inputFromConsole();
        JsonSaver saver = new JsonSaver();
        saver.saveToJson(order);
    }
}
