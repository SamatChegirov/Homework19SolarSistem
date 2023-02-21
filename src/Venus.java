public enum Venus {
    VENUS("Кун системасындагы эн ысык планета, 400ºС.");

    private String information;

    Venus(String information) {
        this.information = information;
    }

    public String getInformation() {
        return information;
    }
}
