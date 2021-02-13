package simple_gson;

import com.google.gson.Gson;

public class DeSerializeDriverProfile {

    public static void deSerializeDriverProfile() {
        String driverString = "{\"name\":\"Lewis Hamilton\",\"team\":\"Ferrari\",\"wins\":24,\"isChampion\":false}";
        Gson gson = new Gson();
        DriverProfile lewis = gson.fromJson(driverString, DriverProfile.class);
    }
}
