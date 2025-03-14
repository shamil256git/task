

import com.usermanagement.*;
import com.itemmanagement.*;

public class Main {
    public static void main(String[] args) {
        User user = new User("Abubaker", 25);
        Item item = new Item("television");

        System.out.println(user.getUserInfo());
        System.out.println(item.getItemInfo());
    }
}


