package classes;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by USER on 19-Dec-16.
 */
public class Utils {
    ClassLoader resourceFolder;

    public Utils(){
        resourceFolder = this.getClass().getClassLoader();
    }

    public JsonObject readJsonFromResources(String fileName) throws Exception {
        try {
            InputStream file = resourceFolder.getResourceAsStream("settings/" + fileName);
            JsonParser jsonParser = new JsonParser();
            JsonObject jsonObject = (JsonObject)jsonParser.parse(
                    new InputStreamReader(file, "UTF-8"));

            return jsonObject;
        } catch(Exception ex){
            throw new Exception("Error trying to read Json file " + ex.getMessage());
        }
    }

    public File getApkFromResources(String fileName) throws Exception {
        try {
            File apk = new File(resourceFolder.getResource("apk/" + fileName).getFile());
            return apk;
        }catch(Exception ex){
            throw new Exception("Error while getting the APK. " + ex.getMessage());
        }
    }

    public JsonObject getApplicationFromJson(String applicationName) throws Exception {
        try {
            JsonObject applicationInformation = readJsonFromResources("applicationSettings.json");
            JsonObject applicationElement = null;
            JsonArray arrayElements = applicationInformation.get("applications").getAsJsonArray();

            for (int i = 0; i < arrayElements.size(); i++) {
                JsonObject arrayJsonObject = arrayElements.get(i).getAsJsonObject();

                if (arrayJsonObject.get("applicationName").getAsString().equals(applicationName)) {
                    applicationElement = arrayJsonObject;
                }
            }

            return applicationElement;
        }catch(Exception ex){
            throw new Exception("Error trying to find the application value from settings file");
        }
    }
}
