import java.util.Random;


public class Main {
    public static void main(String[] args) {


        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;


        String[] rice = {"white rice", "brown rice", "no rice"};
        String[] meat = {"chicken meat", "steak meat", "carnidas meat", "chorizo meat", "sofritas meat", "veggies"};
        String[] beans = {"pinto beans", "black beans", "no beans"};
        String[] salsa = {"mild salsa", "medium salsa", "hot salsa", "no salsa"};
        String[] veggies = {"lettuce", "fajita veggies", "no veggies"};

        Random rnd = new Random();


        for (int i = 1; i <= 10; i++) {

            num1 = rnd.nextInt(rice.length);
            num2 = rnd.nextInt(meat.length);
            num3 = rnd.nextInt(beans.length);
            num4 = rnd.nextInt(salsa.length);
            num5 = rnd.nextInt(veggies.length);

            System.out.print("Burrito" + " " +" " + i + ": " + rice[num1] + "," + "" +
                    " " + meat[num2] + "," + " " + beans[num3] + "," + " " + salsa[num4] + "," + " " + "" +
                    veggies[num5] + "\n");
            ;


        }
    }
}
