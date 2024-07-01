import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExercicioPraticoSemana13Classroom {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {

        // Configuração do WebDriver (ChromeDriver)
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void efetuarLogin() {

        // Localizar o formulário de login
        WebElement loginForm = driver.findElement(By.id("login"));

        // Preencher campo Username
        loginForm.findElement(By.id("username")).sendKeys("tomsmith");

        // Preencher campo Password
        loginForm.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        // Clicar no botão Login
        loginForm.findElement(By.cssSelector("button[type='submit']")).click();

         // Esperar pela mensagem de sucesso e obter seu texto
         WebElement successMessage = driver.findElement(By.id("flash"));
         String messageText = successMessage.getText();
 
         // Verificar se a mensagem esperada está presente
         assertTrue(messageText.contains("You logged into a secure area!"));
 
         // Clicar no botão de logout 
         driver.findElement(By.xpath("/html/body/div[2]/div/div/a")).click();
     }
 
     @AfterAll
     public static void tearDown() {
 
         // Fechar o navegador
         if (driver != null) {
             driver.quit();
         }
     }
 }

        