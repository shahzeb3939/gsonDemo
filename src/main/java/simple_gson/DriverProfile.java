package simple_gson;

public class DriverProfile {

    private String name;
    private String team;
    private Number wins;
    private Boolean isChampion;

    public DriverProfile(String name, String team, Integer wins, Boolean isChampion) {
        this.name = name;
        this.team = team;
        this.wins = wins;
        this.isChampion = isChampion;
    }
}
