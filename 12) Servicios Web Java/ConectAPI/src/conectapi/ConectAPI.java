/** *******************************************************************************
 * Nota: el *.jar necesario para usar los las liberías de JSon se descarga de aqui:
 * https://jar-download.com/maven-repository-class-search.php?search_box=javax.json
 * https://jar-download.com/maven-repository-class-search.php?search_box=org.json
 *
 * Ah!, y de aquí se pueden tomar algunas ideas:
 * https://docs.oracle.com/middleware/1221/wls/WLPRG/java-api-for-json-proc.htm#WLPRG1055
 * https://www.jokecamp.com/blog/code-examples-api-http-get-json-different-languages/#java
 ******************************************************************************** */
package conectapi;

//import javax.json.Json;
//import javax.json.JsonReader;
//import javax.json.JsonStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONException;
import org.json.JSONObject;

public class ConectAPI {

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

    public static void main(String[] args) throws IOException, JSONException {
        JSONObject json = readJsonFromUrl("https://jsonip.com");
        System.out.println(json.toString()); //Esta línea es Opcional
        System.out.println(json.get("ip"));
    }
    
/** *******************************************************************************
 * Otra Nota: Para prácticas pueden basarse en los siguientes ejemplos:
 
 JavaScript\2) JQuery\Ajax\1) Ajax JQuery IPWebAPI.htm
 JavaScript\2) JQuery\Ajax\2.1) Ajax JQuery IPWebAPI Doble.html 
 JavaScript\2) JQuery\Ajax\3) Ajax JQuery Paises.html
 ******************************************************************************** */

}
