import java.util.HashMap;
import java.util.TreeMap;

public class PhoneBook {
    TreeMap<String, String> phoneBook = new TreeMap<>();
    HashMap<String, String> reversedKeyBook = new HashMap<>();

    public int add(String name, String number) {
        if (phoneBook.put(name, number) == null) {
            reversedKeyBook.put(number, name);
        }
        return phoneBook.size();
    }

    public String findByNumber(String name){
        return null;
    }
}
