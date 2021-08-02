package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.CheckBoxPage;

public class CheckBoxTest extends TestBase {
    CheckBoxPage checkBoxPage;

    @Test
    public void Test() {

        checkBoxPage = new CheckBoxPage(driver);
        checkBoxPage.clickCheckBox1();
        checkBoxPage.clickCheckBox2();
        Assert.assertEquals(true,checkBoxPage.checkBox1.isSelected());
        Assert.assertEquals(false,checkBoxPage.checkBox2.isSelected());

    }
}
