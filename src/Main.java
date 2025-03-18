import com.user1management.*;
import com.itemmanagement.*;

public class Main {
    public static void main(String[] args) {
        User1 user1 = new User1("Abubaker", 25);
        Item item = new Item("Television");

        System.out.println(user1.getUser1Info());
        System.out.println(item.getItemInfo());

    }
}
 