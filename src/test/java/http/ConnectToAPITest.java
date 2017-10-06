package http;

import org.junit.Test;

import java.net.HttpURLConnection;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class ConnectToAPITest {

    @Test
    public void testHttpConnectionToExampleApi() {
        try {
            String requestURL = "<API REQUEST URL>";
            HttpURLConnection con = ConnectToAPI.makeHttpGetRequest(requestURL);

            assertEquals(con.getResponseCode(), 200);
        } catch (Exception ioq) {
            fail("HTTP connection threw error:" + ioq.getLocalizedMessage());
        }
    }

    /**
     * Testida vaja koodi parse'mist jne.
     */
}
