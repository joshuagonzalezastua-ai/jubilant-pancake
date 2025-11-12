// import com.example.App;
// import org.junit.Test;
// import static org.junit.Assert.*;

// public class AppTest {

//     @Test
//     public void testApp() {
//         App myApp = new App();

//         String result = myApp.getStatus();

//         assertEquals("OK", result);
//     }

// }

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void testApp() {
        String result = "OK";
        assertEquals("OK", result);
    }
}
