package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Drink mojito = new Drink();
        mojito.drinkName = "Mojito";
        mojito.price = 15;
        mojito.isAlcoholic = true;
        mojito.ingredient1.name = "woda";
        mojito.ingredient1.amount = 150;
        mojito.ingredient2.name = "sok cytrynowy";
        mojito.ingredient2.amount = 25;
        mojito.ingredient3.name = "wódka";
        mojito.ingredient3.amount = 25;
        double mojitoVolume = mojito.ingredient1.amount + mojito.ingredient2.amount + mojito.ingredient3.amount;

        System.out.println("Drink: " + mojito.drinkName);
        System.out.println("Cena: " + mojito.price);
        System.out.println("Czy zawiera alkohol: " + mojito.isAlcoholic);
        System.out.printf("Składniki:%n%s%n%s%n%s%n", mojito.ingredient1.name, mojito.ingredient2.name
                , mojito.ingredient3.name);
        System.out.println("Pojemność: " + mojitoVolume);
    }
}
