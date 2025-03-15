

import com.usermanagement.*;
import com.itemmanagement.*;

public class Main {
    public static void main(String[] args) {
        User1 user1 = new User1("Abubaker", 25);
        Item item = new Item("Television");

        System.out.println(user1.getUserInfo());
        System.out.println(item.getItemInfo());
    }
}


