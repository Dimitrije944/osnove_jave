package p14_06_2022;

import org.testng.annotations.*;


public class Uvod_TestNG {
    @BeforeClass
    public void beforeClass(){
        System.out.println("BEFORE CLASS");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BEFORE METHOD");
    }

    @Test
    public void googleTitleTest(){
        System.out.println("TITLE TEST");
    }

    @Test
    public void googleUrlTest(){
        System.out.println("URL TEST");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AFTER METHOD");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AFTER CLASS");
    }
}
