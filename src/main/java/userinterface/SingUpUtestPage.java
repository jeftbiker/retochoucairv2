package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;



public class SingUpUtestPage extends PageObject {
    public static final Target BUTTON_JOIN = Target.the("Select Join Today Option")
            .located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//ul[@class='nav navbar-nav']//a[@class='unauthenticated-nav-bar__sign-up']"));
            //.located(org.openqa.selenium.By.xpath("//div[@class='unauthenticated-nav-bar_links-right hidden-sm hidden-xs']//a[@class='unauthenticated-nav-bar_sing-up']"));

}
