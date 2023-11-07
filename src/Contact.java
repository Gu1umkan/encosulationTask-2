public class Contact {
    private String contactName;
    private int phoneNUmber;

    public Contact() {
    }

    public Contact(String contactName, int phoneNUmber) {
        this.contactName = contactName;
        this.phoneNUmber = phoneNUmber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public int getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(int phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    public String getContact() {
        return
                "contactName='" + contactName + '\n' +
                        ", phoneNUmber=" + phoneNUmber
                ;
    }
}
