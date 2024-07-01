import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeEAfter {

    private WebDriver navegador;

    @BeforeClass
    public void setUo(){
        navegador = new ChromeDriver();
        navegador.get("https://automationexercise.com/login");
    }

    @Test
    public void chromeTest(){

        //Criar formulário
        WebElement loginParaCriarUsuario = navegador.findElement(By.className("signup-form"));
        //Preencher o campo Name
        loginParaCriarUsuario.findElement(By.name("name")).sendKeys("curso");
        //Preencher o campo Email
        loginParaCriarUsuario.findElement(By.name("email")).sendKeys("cursoteste2000@teste.com");
        //Clicar no botão SingUp
        navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();;
  
    }

    @AfterClass
    public void tearDown(){

        navegador.quit();

    }
    

}
    
