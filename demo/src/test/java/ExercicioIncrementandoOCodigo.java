import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExercicioIncrementandoOCodigo {

    @Test
    public void chromeTest(){
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://automationexercise.com/login");

        //Criar formulário
        WebElement loginParaCriarUsuario = navegador.findElement(By.className("signup-form"));
        //Preencher o campo Name
        loginParaCriarUsuario.findElement(By.name("name")).sendKeys("QA");

        Random rand = new Random();
        int randomNum = rand.nextInt((10000 - 1) + 1) + 1;
        //Preencher o campo Email
        loginParaCriarUsuario.findElement(By.name("email")).sendKeys("QA"+ randomNum + "@teste.com");
        //Clicar no botão SingUp
        navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
    
}

}
