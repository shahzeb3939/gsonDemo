package simple_gson;

import com.google.gson.Gson;

public class SerializeDriverProfile {

    public static void serializeDriverProfile(DriverProfile driver) {
        Gson gson = new Gson();
        String jsonString = gson.toJson(driver);
        System.out.println(jsonString);
    }
}
