package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxPage extends PageBase{

    @FindBy(xpath ="//*[@id=\"checkboxes\"]/input[1]")
    public WebElement checkBox1;

    @FindBy(xpath ="//*[@id=\"checkboxes\"]/input[2]")
    public WebElement checkBox2;

    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    public void clickCheckBox1 (){
        checkBox1.click();
    }

    public void clickCheckBox2 (){

        if (checkBox2.isSelected()){
            checkBox2.click();
        }

    }

}
