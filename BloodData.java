class BloodData {
    // Static fields for bloodType and rhFactor
    static String bloodType;
    static String rhFactor;

    // Default constructor
    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }

    // Overloaded constructor
    public BloodData(String bt, String rh) {
        bloodType = bt;
        rhFactor = rh;
    }

    public void display() {
        System.out.println( bloodType + rhFactor + " is added to the blood bank.");
    }
}
