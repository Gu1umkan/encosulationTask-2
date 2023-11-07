public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact();
        contact1.setContactName("Kanymai");
        contact1.setPhoneNUmber(990231632);
        Contact contact2 = new Contact();
        contact2.setContactName("Janbolot");
        contact2.setPhoneNUmber(778342689);
        Phone phone1 = new Phone();
        phone1.setBrand("Apple");
        phone1.setModel("Iphone X");
        phone1.setPhonesUsername("Gulumkan");
        phone1.setPrice(200);

        phone1.setContacts(new Contact[]{contact1, contact2});
        Phone phone2 = new Phone();
        phone2.setBrand("Samsung");
        phone2.setModel("Galaxy S9");
        phone2.setPhonesUsername("Miraida");
        phone2.setPrice(150);
        phone2.setContacts(new Contact[]{new Contact("Zarina", 997374627), new Contact("Albina", 228564898), new Contact("Islam", 778567893)});

        Phone phone3 = new Phone("Apple", "Iphone 15 pro max", 1700, "Davron", new Contact[]{new Contact("Aidar", 556789823), new Contact("Bekturgan", 990679856), new Contact("Ulukman", 23456798)});
        Phone[] phones = {phone1, phone2, phone3};

        for (Phone phone : phones) {
            System.out.println(phone.getContactCount());
        }

    }
}
