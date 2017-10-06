package http;

import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectToAPI {

   public static HttpURLConnection makeHttpGetRequest(String requestURL) throws Exception {

       URL obj = new URL(requestURL);
       HttpURLConnection con = (HttpURLConnection) obj.openConnection();

       return con;
   }
}
