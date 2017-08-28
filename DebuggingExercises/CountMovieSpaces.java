/**
 * Created by jc260799 on 28/08/17.
 */
public class CountMovieSpaces {
    public static void main(String[] args) {


        String quote =
                "Honesty is the first chapter in the book of wisdom. - Thomas Jefferson";

        int stringlength = quote.length();
        int x;
        int count = 0;
        for(x = 0; x < stringlength; ++x){
            if(quote.charAt(x) == ' '){
                count = count + 1;

            }

        }
        System.out.println("the number of spaces in the quote is " + count);
    }
}
