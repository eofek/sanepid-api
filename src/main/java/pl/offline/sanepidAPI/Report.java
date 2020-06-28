package pl.offline.sanepidAPI;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("warszawa")
public class Report {

    @Id
    public String id;

    public int cases;

    public String day;

    @Override
    public String toString() {
        return "\n\nLiczba przypadków z dnia ["
                + day + "]: "
                + cases
                + "\n\n";
    }
}
