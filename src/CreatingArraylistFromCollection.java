import java.util.ArrayList;
import java.util.List;

public class CreatingArraylistFromCollection {
    /*In this example, we learn how to create an arraylist from collection and how to add elements of another collection
    * to the new arraylist using the .addAll() method */
    public static void main(String[] args) {
        //create an arraylist of Strings
        ArrayList <String> playerNames = new ArrayList<>();
        playerNames.add(0, "KDB");
        playerNames.add(1, "Rodrigo");
        playerNames.add(2,"Bernardo Silva");
        playerNames.add(3, "Mahrez");

        System.out.println(playerNames);
        //Creating a collection from another playlist
        List <String> morePlayerNames = new ArrayList<>(playerNames);


        List <String> playerNames2 = new ArrayList<>();
        playerNames2.add("Haaland");
        playerNames2.add("Grealish");
        playerNames2.add("Gundogan");

        morePlayerNames.addAll(playerNames2);
        System.out.println(morePlayerNames);

        accessingArrayListElements();


    }
        private static void accessingArrayListElements() {
        //Checking whether an Arraylist is empty using the .empty() method
        ArrayList <String> companiesUsingJava = new ArrayList<>();

        System.out.println("Is the companiesUsingJava list empty? : "+companiesUsingJava.isEmpty());

        //add elements to the List
        companiesUsingJava.add("Google");
        companiesUsingJava.add("Amazon");
        companiesUsingJava.add("Netflix");
        companiesUsingJava.add("Spotify");
        companiesUsingJava.add("Snapchat");
        companiesUsingJava.add("Instagram");

        //find the size of the companiesUsingJava list and print out the companies
        System.out.println("Here are the top "+companiesUsingJava.size()+ " companies using Java in backend development: ");
        System.out.println(companiesUsingJava);

        //Retrieving elements at a given index using .get() method
        String bestCompany = companiesUsingJava.get(0);
        String thirdBestCompany = companiesUsingJava.get(1);
        String lastCompanyInTheList = companiesUsingJava.get(companiesUsingJava.size()-1);

        System.out.println("The best company is "+bestCompany);
        System.out.println("The second third best Java company is "+thirdBestCompany);
        System.out.println("The last company in the companiesUsingJava list is "+lastCompanyInTheList);

        //Modify the elements at a given index using .set() method
        companiesUsingJava.set(2, "Linkedin");
        System.out.println(companiesUsingJava);

        //swapping ArrayList elements
        //get the indices of the elements we want to swap
        int indexOfCompanyA = companiesUsingJava.indexOf("Spotify");
        int indexOfCompanyB = companiesUsingJava.indexOf("Amazon");

        //create a new String variable and store the values of the above companies
        String a = "Spotify";
        String b = "Amazon";

        //call .set() method on our companies list and store company b where a was, and vice versa

        companiesUsingJava.set(indexOfCompanyA, b);
        companiesUsingJava.set(indexOfCompanyB, a);

        System.out.println("The swapped list of companies using Java is: "+companiesUsingJava);

        //Removing elements from an Arralist using .remove() method
        companiesUsingJava.remove(5);
        System.out.println("After removing the company at the index 5, the new list is: "+companiesUsingJava);

        //Removing all elements from an Arraylist using .removeAll() method
        companiesUsingJava.removeAll(companiesUsingJava);
        System.out.println("After calling the .removeAll() method, out company Arraylist" +
                    "should be empty "+ companiesUsingJava);
    }
}
