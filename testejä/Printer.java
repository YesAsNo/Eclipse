package testi1;

public class Printer {

	public static void main(String[] args) {
	      System.out.println("Hei, olen Tulostin-ohjelma");
	      
	      String tekija = "Sanna";
	      double luku1 = 45;
	      double luku2 = 74;
	      double tulo = luku1 * luku2;
	      double tulo2 = luku1 + luku2;
	      double tulo3 = luku1 - luku2;
	      double tulo4 = luku1 / luku2;
	      
	      System.out.print("Ohjelman tekijä: ");
	      System.out.println(tekija);
	      
	      System.out.println("Luku1 muuttujan arvo on " + luku1);
	      System.out.println("Luku2 muuttujan arvo on " + luku2);
	      System.out.println(luku1 + " * " + luku2 + " = " + tulo);
	      System.out.println(luku1 + " + " + luku2 + " = " + tulo2);
	      System.out.println(luku1 + " - " + luku2 + " = " + tulo3);
	      System.out.println(luku1 + " / " + luku2 + " = " + tulo4);

	}

}
