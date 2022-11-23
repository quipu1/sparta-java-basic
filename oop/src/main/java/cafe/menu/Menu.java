package cafe.menu;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<MenuItem> menuItemList = new ArrayList<>();

    public  Menu() {
        this.menuItemList.add(new MenuItem("아메리카노", 1000));
        this.menuItemList.add(new MenuItem("라떼", 3000));
        this.menuItemList.add(new MenuItem("오렌지주스", 2000));
        this.menuItemList.add(new MenuItem("밀크쉐이크", 4000));
        this.menuItemList.add(new MenuItem("프라프치노", 5000));
        this.menuItemList.add(new MenuItem("버블티", 6000));
    }

    public MenuItem getMenuItem(String menuName) {
        for (MenuItem menuItem : this.menuItemList) {
            if (menuItem.getName().equals(menuName)) {
                return menuItem;
            }
        }
        throw new IllegalArgumentException("존재하지 않는 메뉴입니다.");
    }

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

}
