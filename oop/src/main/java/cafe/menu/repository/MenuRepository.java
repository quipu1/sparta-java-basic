package cafe.menu.repository;

import cafe.menu.Menu;
import cafe.menu.MenuItem;

public interface MenuRepository {
    void saveMenu(Menu menu);
    MenuItem getMenuItem(int menuId, String menuName);
    Menu getMenu(int id);

}
