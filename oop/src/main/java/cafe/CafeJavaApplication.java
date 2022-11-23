package cafe;

import cafe.menu.JavaMenuService;
import cafe.menu.Menu;
import cafe.menu.MenuItem;
import cafe.menu.MenuService;
import cafe.menu.presentation.MenuInterface;
import cafe.menu.presentation.UserInterface;
import cafe.menu.repository.JavaMenuRepository;
import cafe.menu.repository.MenuRepository;

import java.util.Scanner;

public class CafeJavaApplication {
    public static void main(String[] args) {
        UserInterface UI = new UserInterface();
        UI.run();

        MenuService menuService = new JavaMenuService();

        while (true) {

            Scanner input = new Scanner(System.in);
            String firstInput = input.nextLine();
            if (firstInput.equals("1")) {
                menuService.createMenu();
            } else if (firstInput.equals("2")) {
                Menu menu = menuService.getMenu(1);
                new MenuInterface(menu);
                Scanner menuNameInput = new Scanner(System.in);
                String menuName = menuNameInput.nextLine();

                System.out.println("입력받은 메뉴 이름: "+ menuName);

                MenuItem menuItem = menuService.getMenuItem(1, menuName);

                System.out.println("메뉴 이름: " + menuItem.getName());
            } else if (firstInput.equals("q")) {
                System.out.println("시스템 종료");
                System.exit(0);
            }
        }


    }
}
