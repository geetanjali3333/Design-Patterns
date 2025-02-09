package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Button.IOSButton;
import Factory.Components.Dropdown.Dropdown;
import Factory.Components.Dropdown.IOSDropdown;
import Factory.Components.Menu.IOSMenu;
import Factory.Components.Menu.Menu;

public class IOSComponentFactory implements UIComponentFactory{  //Factory Method
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
