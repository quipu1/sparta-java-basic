package cafe.menu.presentation;

import cafe.menu.Menu;
import cafe.menu.MenuItem;

public class MenuInterface {
    public MenuInterface(Menu menu) {
        System.out.println("===========메뉴 목록==========");
        for (MenuItem menuItem : menu.getMenuItemList()) {
            System.out.println("메뉴 이름: " + menuItem.getName() + ", 가격: " + menuItem.getPrice());
        }
    }
}
