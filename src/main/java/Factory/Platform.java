package Factory;

import Factory.Components.Button.AndroidButton;
import Factory.Components.Button.Button;
import Factory.Components.Button.IOSButton;

public abstract class Platform {
    public void setTheme(){

    }
    public void setRefreshRate(){

    }

//    public Button createButton(){
////        if(this is an instance of Android){
////            return new AndroidButton();
////        }
////        else if(this is an instance of IOS){
////            return new IOSButton();
////        }
//    }


    public abstract UIComponentFactory createUIComponentFactory();

    public static Platform createPlatform(String platformName){
        return PlatformFactory.getPlatform(platformName);
    }
}
