package Pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class Formulario {

    protected WebDriver driver;
private By firstname=By.id("firstName");
private By lastName=By.id("lastName");
private By userEmail=By.id("userEmail");

private By userNumber=By.id("userNumber");
    int cuenta=0;

    public Formulario(WebDriver driver){
        this.driver = driver;
    }
    public void registroForm(DataTable usuarios){


        List<Map<String,String>> data=usuarios.asMaps(String.class,String.class);
        data.size();
        System.out.println("----------:"+data.get(0).get("firstname"));
        System.out.println("---- data.size()------:"+ data.size());

        for (Map<String, String> map : data) {
            driver.findElement(firstname).sendKeys(data.get(cuenta).get("firstname"));
            System.out.println("lastName"+data.get(cuenta).get("lastname"));
            driver.findElement(lastName).sendKeys(data.get(cuenta).get("lastname"));
            driver.findElement(userEmail).sendKeys(data.get(cuenta).get("userEmail"));
            driver.findElement(userNumber).sendKeys(data.get(cuenta).get("userNumber"));

            cuenta++;
        }



        System.out.println("registro formulario");

    }

    public void resetearValores(){


    }


}
