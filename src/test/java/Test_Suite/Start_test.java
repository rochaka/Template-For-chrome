package Test_Suite;

import Setup_The_Browsers.Setupbrowser;
import Setup_The_Browsers.loging_data;
import org.testng.annotations.Test;

import java.io.IOException;

public class Start_test {

    @Test ( priority = 1 )
    void SetupBrowserTest() throws IOException, InterruptedException {
        Setupbrowser loginTest = new Setupbrowser();
        loginTest.Setup_browser();
        loginTest.Setupbrowse();
    }
    @Test ( priority = 2 )
    void Logingdata() throws IOException, InterruptedException {
        loging_data loginTest = new loging_data();
        loginTest.loging_data();
        loginTest.loging();
    }
    
    
}
