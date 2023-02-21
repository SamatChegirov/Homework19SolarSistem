import java.util.PrimitiveIterator;

public enum Mercury {
    MERCURY("Кунго эн жакын жана кичинекей планета.");

    private String information;

    Mercury(String information) {
        this.information = information;
    }

    public String getInformation() {
        return information;
    }
}
