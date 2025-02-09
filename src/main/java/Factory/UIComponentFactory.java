package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Dropdown.Dropdown;
import Factory.Components.Menu.Menu;

public interface UIComponentFactory {     //abstract Factory
    Button createButton();
    Menu createMenu();
    Dropdown createDropdown();
}
