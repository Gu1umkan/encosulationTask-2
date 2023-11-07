public class Phone {
    private String brand;
    private String model;
    private int price;
    private String phonesUsername;
    private Contact[] contacts;

    public Phone() {
    }

    public Phone(String brand, String model, int price, String phonesUsername, Contact[] contacts) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.phonesUsername = phonesUsername;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPhonesUsername() {
        return phonesUsername;
    }

    public void setPhonesUsername(String phonesUsername) {
        this.phonesUsername = phonesUsername;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public String getContactCount() {

        return "Phones user name : " + phonesUsername +
                "\ncontact count : " + contacts.length;
    }
}
