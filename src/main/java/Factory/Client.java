package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Dropdown.Dropdown;
import Factory.Components.Menu.Menu;

public class Client {
    public static void main(String[] args){
//        Platform p=new IOS();

        String platform="Android";
        Platform p=Platform.createPlatform(platform);
        UIComponentFactory uiComponentFactory=p.createUIComponentFactory();
        Button button= uiComponentFactory.createButton();
        Menu menu= uiComponentFactory.createMenu();
        Dropdown dropdown= uiComponentFactory.createDropdown();
        button.draw();
        menu.MenuList();
        dropdown.options();
    }
}
