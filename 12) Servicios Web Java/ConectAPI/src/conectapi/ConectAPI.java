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
import org.json.JSONArray;

public class ConectAPI {

    private static String readAll(Reader rd) throws IOException {
        StringBuilder constructorTexto = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            constructorTexto.append((char) cp);
        }
        return constructorTexto.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream flujoEntrada = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(flujoEntrada, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            flujoEntrada.close();
        }
    }

    public static void main(String[] args) throws IOException, JSONException {
        JSONObject elJson = readJsonFromUrl("https://jsonip.com");
        //System.out.println(elJson.toString()); //Esta línea es Opcional
        System.out.println(elJson.get("ip"));
        System.out.println("-------------------------------");
        
        //-------------------------------------------------------------------
        // Copie y pegue las 3 líneas anteriores e intentelo con este otro Api:
        // http://ip-api.com/json
        // (Ojo: Agregue también la latitud y la longitud
        
        elJson = readJsonFromUrl("http://ip-api.com/json");
        System.out.println(elJson.get("query"));
        System.out.println(elJson.get("lat"));
        System.out.println(elJson.get("lon"));
        System.out.println("-------------------------------");
    
        //-------------------------------------------------------------------
        JSONObject miJson = readJsonFromUrl("https://randomuser.me/api/");
        JSONArray resultados = miJson.getJSONArray("results");
        
         for (int i = 0; i < resultados.length(); i++) {
            JSONObject elOtroJson = (JSONObject) resultados.get(i);
            JSONObject aunOtroJson = (JSONObject) elOtroJson.get("name");
            System.out.println(aunOtroJson.get("first"));
            System.out.println(aunOtroJson.get("last"));
            System.out.println("-------------------------------");
        }
         
        //-------------------------------------------------------------------
        // Basados en el ejemplo anterior ahora intentelo con este otro Api:
        // https://hn.algolia.com/api/v1/search?query=
        
        miJson = readJsonFromUrl("https://hn.algolia.com/api/v1/search?query=");
        resultados = miJson.getJSONArray("hits");
        
         for (int i = 0; i < resultados.length(); i++) {
            JSONObject unJson = (JSONObject) resultados.get(i);
            System.out.println(unJson.get("author"));
            System.out.println(unJson.get("title"));
            System.out.println("-------------------------------");
        }
        
        
        
        //-------------------------------------------------------------------
        // Ahora, simplifique un poco la estructura anterior y use este Api:
        // https://restcountries.eu/rest/v2/all
        
        miJson = readJsonFromUrl("https://restcountries.eu/rest/v2/all");
        resultados = miJson.getJSONArray(readJsonFromUrl("https://restcountries.eu/rest/v2/all"));
        
         for (int i = 0; i < resultados.length(); i++) {
            JSONObject unJson = (JSONObject) resultados.get(i);
            System.out.println(unJson.get("name"));
            System.out.println(unJson.get("capital"));
            System.out.println("-------------------------------");
        }
    }
    
/** *******************************************************************************
 * Otra Nota: Para prácticas pueden basarse en los siguientes ejemplos:
 
 JavaScript\2) JQuery\Ajax\1) Ajax JQuery IPWebAPI.htm
 JavaScript\2) JQuery\Ajax\2.1) Ajax JQuery IPWebAPI Doble.html 
 JavaScript\2) JQuery\Ajax\3) Ajax JQuery Paises.html
  
 *********************************************************************************/

}
