package ru.novikov.practika.two.forth;

public class TestMain {
    public static void main(String[] args) {
        GraphicCard graphicCard = new GraphicCard("RTX 2060", 42_640); //can downcast to Nameable, Priceable
        Planet planet = new Planet("Земля"); //can downcast only to Nameable
        Processor processor = new Processor(38_360); //can downcast only to Priceable

        Object[] objects = {graphicCard, planet, processor};
        for (Object object : objects) {
            System.out.print("ТОВАР: {");
            if (object instanceof Nameable) {
                Nameable nameable = (Nameable) object;
                System.out.print("[название=" + nameable.getName() + "]");
            }
            if (object instanceof Priceable) {
                Priceable priceable = (Priceable) object;
                System.out.print("[цена=" + priceable.getPrice() + "]");
            }
            System.out.print("}\n");
        }
    }
}
