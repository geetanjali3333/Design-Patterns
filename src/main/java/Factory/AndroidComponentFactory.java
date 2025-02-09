package Factory;

import Factory.Components.Button.AndroidButton;
import Factory.Components.Button.Button;
import Factory.Components.Dropdown.AndroidDropdown;
import Factory.Components.Dropdown.Dropdown;
import Factory.Components.Menu.AndroidMenu;
import Factory.Components.Menu.Menu;

public class AndroidComponentFactory implements UIComponentFactory{   //Factory Method
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
