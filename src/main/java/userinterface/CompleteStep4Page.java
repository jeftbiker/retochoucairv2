package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompleteStep4Page extends PageObject {
    public static final Target INPUT_PASS = Target.the("").located(By.id("password"));
    public static final Target INPUT_CONFRIMPASS = Target.the("").located(By.id("confirmPassword"));
    public static final Target BUTTON_LAST_STEP = Target.the("").located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue']"));
    public static final Target CHECK_TERMS = Target.the("").located(By.xpath("//label[@class='input-check-box signup-consent']//input[@id='termOfUse']"));
    public static final Target CHECK_PRIVACY = Target.the("").located(By.xpath("//label[@class='input-check-box signup-consent']//input[@id='privacySetting']"));
}
