package simple_gson;

import static simple_gson.DeSerializeDriverProfile.deSerializeDriverProfile;
import static simple_gson.SerializeDriverProfile.serializeDriverProfile;

public class MainClass {

    public static void main(String args[]) {

        var sebastian = new DriverProfile("Sebastian Vettel", "Ferrari", 54, true);
        serializeDriverProfile(sebastian);

        deSerializeDriverProfile();
    }
}
