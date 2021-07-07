package cz.czechitas.selenium;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestyPrihlaseniNaKurz {

//    // Nejdrive konstanty
//    private static final String URL_APLIKACE = "https://cz-test-dva.herokuapp.com/";

    WebDriver prohlizec;

    @BeforeEach
    public void setUp() {
//      System.setProperty("webdriver.gecko.driver", System.getProperty("user.home") + "/Java-Training/Selenium/geckodriver");
        System.setProperty("webdriver.gecko.driver", "C:\\Java-Training\\Selenium\\geckodriver.exe");
        prohlizec = new FirefoxDriver();
        prohlizec.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //Z ňákýho důvodu nejsem schopná ani stanovit konstantu.
    //Zkoušela jsem tam vrazit pocetPrechodu čtyřma různejma způsobama, furt nic.
    //Taky jsem zjistila, že v 'if' nejde dělat nerovná se, ale líp jsem to zatím nevymyslela.

    @Test
    public void allRoadsLeadToPhilosophy() {
        prohlizec.navigate().to("https://cs.wikipedia.org/wiki/Testov%C3%A1n%C3%AD_softwaru");

        int pocetPrechodu = 0;

        if (prohlizec.getCurrentUrl() != prohlizec.getCurrentUrl().endsWith("/Filosofie")) {
            WebElement prvniOdkaz = prohlizec.findElement(By.xpath("//div/p/a[@href]"));
            prvniOdkaz.click();
            pocetPrechodu = ++pocetPrechodu;
        } else {
            System.out.println("K filosofii vedlo " + pocetPrechodu + " klikanců.");
        }

        Assertions.assertTrue(prohlizec.getCurrentUrl().endsWith("//Filosofie"));
    }

//    @Test
//    public void rodicSeMusiBytSchopenPrihlasitAVybratTerminKurzuProDite() {
//        String urlZakovychPrihlasek = URL_APLIKACE + "zaci";
//        prohlizec.navigate().to(urlZakovychPrihlasek);
//        WebElement polickoEmail = prohlizec.findElement(By.id("email"));
//        polickoEmail.sendKeys("petr.otec@seznam.cz");
//        WebElement polickoHeslo = prohlizec.findElement(By.id("password"));
//        polickoHeslo.sendKeys("Czechitas123");
//        WebElement tlacitkoPrihlasit = prohlizec.findElement(By.xpath("//div/button[contains(text(), 'Přihlásit')]"));
//        tlacitkoPrihlasit.click();
//
//        WebElement tlacitkoVytvoritNovouPrihlasku = prohlizec.findElement(By.linkText("Vytvořit novou přihlášku"));
//        tlacitkoVytvoritNovouPrihlasku.click();
//
//        List<WebElement> tlacitkaKurzuViceInformaci = prohlizec.findElements(By.xpath("//div[@class = 'card']//a[text() = 'Více informací']"));
//        WebElement tlacitkoViceInformaci = tlacitkaKurzuViceInformaci.get(2);
//        tlacitkoViceInformaci.click();
//
//        List<WebElement> tlacitkaKurzuVytvoritPrihlasku = prohlizec.findElements(By.xpath("//div[@class = 'card']//a[text() = 'Vytvořit přihlášku']"));
//        WebElement tlacitkoVytvoritPrihlasku = tlacitkaKurzuVytvoritPrihlasku.get(0);
//        tlacitkoVytvoritPrihlasku.click();
//
//        // TODO
//        WebElement menuVyberteTermin = prohlizec.findElement(By.xpath("//div[text()='Vyberte termín...']"));
//        menuVyberteTermin.click();
//
//        WebElement polickoTerminu = prohlizec.findElement(By.xpath("//div[@class='bs-searchbox']//input"));
//        polickoTerminu.sendKeys("28\n");
//
//        WebElement krestniJmenoZaka = prohlizec.findElement(By.id("forename"));
//        krestniJmenoZaka.sendKeys("Karel");
//
//        WebElement prijmeniZaka = prohlizec.findElement(By.id("surname"));
//        prijmeniZaka.sendKeys("Synek");
//
//        WebElement datumNarozeniZaka = prohlizec.findElement(By.id("birthday"));
//        datumNarozeniZaka.sendKeys("24.12.2000");
//
//        WebElement zaplatitHotove = prohlizec.findElement(By.xpath("//label[@for='payment_cash']"));
//        zaplatitHotove.click();
//
//        WebElement zaskrtavatkoSouhlas = prohlizec.findElement(By.xpath("//label[@for='terms_conditions']"));
//        zaskrtavatkoSouhlas.click();
//
//        WebElement tlacitkoOdeslat = prohlizec.findElement(By.xpath("//input[@type='submit']"));
//        tlacitkoOdeslat.click();
//
//        WebElement potvrzeniPrihlasky = prohlizec.findElement(By.xpath("//*[text()='Stáhnout potvrzení o přihlášení']"));
//        Assertions.assertNotNull(potvrzeniPrihlasky);
//    }
//
//    @Test
//    public void rodicMusiBytSchopenVybratDitetiTerminKurzuAPrihlasitHo() {
//        prohlizec.navigate().to(URL_APLIKACE);
//
//        List<WebElement> tlacitkaKurzuViceInformaci = prohlizec.findElements(By.xpath("//div[@class = 'card']//a[text() = 'Více informací']"));
//        WebElement tlacitkoViceInformaci = tlacitkaKurzuViceInformaci.get(2);
//        tlacitkoViceInformaci.click();
//
//        List<WebElement> tlacitkaKurzuVytvoritPrihlasku = prohlizec.findElements(By.xpath("//div[@class = 'card']//a[text() = 'Vytvořit přihlášku']"));
//        WebElement tlacitkoVytvoritPrihlasku = tlacitkaKurzuVytvoritPrihlasku.get(0);
//        tlacitkoVytvoritPrihlasku.click();
//
//        WebElement nadpisStranky = prohlizec.findElement(By.xpath("//header//h1"));
//        Assertions.assertEquals("Přihlášení", nadpisStranky.getText());
//
//        WebElement polickoEmail = prohlizec.findElement(By.id("email"));
//        WebElement polickoHeslo = prohlizec.findElement(By.id("password"));
//        WebElement tlacitkoPrihlasit = prohlizec.findElement(By.xpath("//form//button[contains(text(), 'Přihlásit')]"));
//        polickoEmail.sendKeys("petr.otec@seznam.cz");
//        polickoHeslo.sendKeys("Czechitas123");
//        tlacitkoPrihlasit.click();
//
//        WebElement nadpisStranky2 = prohlizec.findElement(By.xpath("//header//h1"));
//        Assertions.assertEquals("Nová přihláška", nadpisStranky2.getText());
//
//        WebElement menuVyberteTermin = prohlizec.findElement(By.xpath("//div[text()='Vyberte termín...']"));
//        menuVyberteTermin.click();
//
//        WebElement polickoTerminu = prohlizec.findElement(By.xpath("//div[@class='bs-searchbox']//input"));
//        polickoTerminu.sendKeys("28\n");
//
//        WebElement krestniJmenoZaka = prohlizec.findElement(By.id("forename"));
//        krestniJmenoZaka.sendKeys("Karel");
//
//        WebElement prijmeniZaka = prohlizec.findElement(By.id("surname"));
//        prijmeniZaka.sendKeys("Synek");
//
//        WebElement datumNarozeniZaka = prohlizec.findElement(By.id("birthday"));
//        datumNarozeniZaka.sendKeys("24.12.2000");
//
//        WebElement zaplatitHotove = prohlizec.findElement(By.xpath("//label[@for='payment_cash']"));
//        zaplatitHotove.click();
//
//        WebElement zaskrtavatkoSouhlas = prohlizec.findElement(By.xpath("//label[@for='terms_conditions']"));
//        zaskrtavatkoSouhlas.click();
//
//        WebElement tlacitkoOdeslat = prohlizec.findElement(By.xpath("//input[@type='submit']"));
//        tlacitkoOdeslat.click();
//
//        WebElement potvrzeniPrihlasky = prohlizec.findElement(By.xpath("//*[text()='Stáhnout potvrzení o přihlášení']"));
//        Assertions.assertNotNull(potvrzeniPrihlasky);
//    }

    @AfterEach
    public void tearDown() {
        prohlizec.close();
    }
}
