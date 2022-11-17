import java.util.Scanner;

public class profanityFilter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputWords = scanner.nextLine();
        String sentence = scanner.nextLine();
        inputWords = inputWords.toLowerCase();

        scanner.close();

        // String[] words = sentence.split(" ");
        // Store inputwords in an array and split them up by the spaces.
        String[] swearWords = inputWords.split(" "); 
        

        //for every String in swearwords check if sentence cotains any swearwords from our array.
        for (String swearWord : swearWords) {
            if (sentence.toLowerCase().contains(swearWord)) {

                // sentence.replace(swearWord, "*&#$%");
                // swearWord.length();
                // int swearWordLegth = swearWord.length();
                String filterWords = "*&#$%";
                String repeatedFilterWords = filterWords.repeat(swearWord.length() / 5); //how many times can the filterwords string be contained in my swearword
                if (swearWord.length() % 5 !=0) { //swearword mod 5

                    repeatedFilterWords += filterWords.substring(0, swearWord.length() % 5);
                }
                
                sentence = sentence.replace(swearWord, repeatedFilterWords);

                // Git commit sentence
                // made another comment for pull request.
                
            }

        }
        System.out.println(sentence);

    }
}
