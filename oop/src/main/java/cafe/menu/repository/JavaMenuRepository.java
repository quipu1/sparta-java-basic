package cafe.menu.repository;

import cafe.menu.Menu;
import cafe.menu.MenuItem;

import java.util.HashMap;
import java.util.List;

public class JavaMenuRepository implements MenuRepository{
    private HashMap menuDB = new HashMap();
    @Override
    public void saveMenu(Menu menu) {
        int id = this.menuDB.size() + 1;
        System.out.println("ID: " + id);

        this.menuDB.put(id, menu);
    }

    @Override
    public MenuItem getMenuItem(int menuId, String menuName) {
        Menu menu = (Menu) this.menuDB.get(menuId);
        if (menu == null) throw new IllegalArgumentException("메뉴가 없습니다.");
        return menu.getMenuItem(menuName);
    }

    @Override
    public Menu getMenu(int id) {
        Menu menu = (Menu) this.menuDB.get(id);
        if ( menu == null ) throw new IllegalArgumentException("메뉴가 존재하지 않습니다. 메뉴를 등록하세요.");

        return menu;
    }
}
