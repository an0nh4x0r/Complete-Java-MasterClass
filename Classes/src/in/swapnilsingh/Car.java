package in.swapnilsingh;

class Car {
    private int doors;
    private int wheels;
    private String model;
    private String colour;

    void setModel(String model) {
        model = model.toLowerCase();
        if (model.equals("porsche") || model.equals("holden")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    String getModel() {
        return this.model;
    }
}
