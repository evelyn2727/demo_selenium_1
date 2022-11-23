package Pages;

import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Formulario {
protected WebDriver driver;
private By firstname=By.id("firstName");
private By lastName=By.id("lastName");
private By userEmail=By.id("userEmail");
private By userNumber=By.id("userNumber");
//private By genderM=By.className("//[@id='gender-radio-1' and contains(text(), 'Male')]");
private By genderM=By.xpath("//input[@value='Male']");
    private By genderF=By.xpath("//input[@value='Female']");
private By button=By.id("submit");
private By modal=By.id("example-modal-sizes-title-lg");
private By close=By.id("closeLargeModal");
//private By genderF=By.className("//[@id='gender-radio-2' and contains(text(), 'Female')]");
    int cuenta=0;
    WebElement element;
    public Formulario(WebDriver driver){
        this.driver = driver;
    }
    public void registroForm(DataTable usuarios){

        driver.manage().window().maximize();

        List<Map<String,String>> data=usuarios.asMaps(String.class,String.class);
        System.out.println("---- data.size()------:"+ data.size());
        for (Map<String, String> map : data) {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.findElement(firstname).sendKeys(data.get(cuenta).get("firstname"));
           driver.findElement(lastName).sendKeys(data.get(cuenta).get("lastname"));
            driver.findElement(userEmail).sendKeys(data.get(cuenta).get("userEmail"));
            driver.findElement(userNumber).sendKeys(data.get(cuenta).get("userNumber"));

            if(data.get(cuenta).get("gender").toString().compareTo("Male")==0){
                 ejecutaJS(driver,driver.findElement(genderM));
            }else{
                ejecutaJS(driver,driver.findElement(genderF));
               }
            ejecutaJS(driver,driver.findElement(button));

            System.out.println("modal:"+driver.findElement(modal).getText());
            Assert.assertEquals("Thanks for submitting the form",driver.findElement(modal).getText().toString());
            ejecutaJS(driver,driver.findElement(close));

            cuenta++;
        }



        System.out.println("registro formulario");

    }

    public void resetearValores(){


    }
    public void ejecutaJS(WebDriver driver,WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);

    }

}
