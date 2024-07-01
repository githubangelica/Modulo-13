import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Cadastro {

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
        loginParaCriarUsuario.findElement(By.name("name")).sendKeys("Angelica");
        //Preencher o campo Email
        loginParaCriarUsuario.findElement(By.name("email")).sendKeys("angelica@teste.com");
        //Clicar no botão SingUp
        navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
  
        WebElement cadastro = navegador.findElement((By.id("form"))); 

        cadastro.findElement(By.id("id_gender1")).click();
        cadastro.findElement(By.id("password")).sendKeys("123456");
        cadastro.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select")).sendKeys("14");
        cadastro.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[2]/div/select")).sendKeys("june");
        cadastro.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[3]/div/select")).sendKeys("1991");
        cadastro.findElement(By.id("newsletter")).click();
        cadastro.findElement(By.id("optin")).click();
        cadastro.findElement(By.id("first_name")).sendKeys("Marcia");
        cadastro.findElement(By.id("last_name")).sendKeys("Pereira");
        cadastro.findElement(By.id("address1")).sendKeys("Rua das Araucarias");
        cadastro.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[6]/select")).sendKeys("Canada");
        cadastro.findElement(By.id("state")).sendKeys("Ceará");
        cadastro.findElement(By.id("city")).sendKeys("Fortaleza");
        cadastro.findElement(By.id("zipcode")).sendKeys("123456");
        cadastro.findElement(By.id("mobile_number")).sendKeys("123456");
        navegador.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/button")).click();
    }

    @AfterClass
    public void tearDown(){

        navegador.quit();

    
    

    }
}