package extraPractice.replitPractice;

import com.cydeo.test.utilities.Driver;
import org.testng.annotations.Test;

public class TestReplit {
    /*
        Main Idea: go replit.com and calculate the percentage of done tasks
     */

    @Test
    public void replitTest(){
        // 1. Go to "https://replit.com"
        Driver.getDriver().get("https://replit.com");
    }

}
