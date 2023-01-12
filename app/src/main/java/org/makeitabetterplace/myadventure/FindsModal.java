package org.makeitabetterplace.myadventure;

public class FindsModal {
    // Variables
    private String description;
    private String details;
    private String longitude;
    private String latitude;
    private String altitude;
    private int id;
    // End variables

    // Getters/Setters
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }

    public String getLongitude() {
        return longitude;
    }
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getAltitude() {
        return altitude;
    }
    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    // End of getters/setters

    // Constructor
    public FindsModal(String description, String details, String longitude, String latitude, String altitude) {
        this.description = description;
        this.details = details;
        this.longitude = longitude;
        this.latitude = latitude;
        this.altitude = altitude;
    }
}
