public class Main {
  public static void main(String[] args) {
    // test your code here by creating a three different dogs from the Dog class. Be sure you give each dog different characteristics. 
    Dog copie = new Dog("Copie", "Golden Retriever", 64.5, "yellow", true);
    
    Dog cory = new Dog("Cory", "Corgi", 23.4 , "hazel", false);

    Dog rice = new Dog("Rice", "Siberian Husky", 52.3 , "Grey", true);

    System.out.println(copie);
    System.out.println(cory);
    System.out.print(rice);
  }
}