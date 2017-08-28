// Makes String comparisons
public class DebugSeven1
{
   public static void main(String[] args)
   {
      String name1 = "roger";
      String name2 = "Roger";
      String name3 = "roger";

      if(name1 == name2)
        System.out.println(name1 + " and " + name2 +
          " are the same");
      if(name1 == name3)
        System.out.println(name1 + " and " + name3 +
          " are the same");
      if(name1 == "roger")
        System.out.println(name1 + " and 'roger' are the same");
      if(name2 == "Roger")
        System.out.println(name2 + " and 'Roger' are the same");
      else
          System.out.println("None are the same");
   }
}
