package lab6.indtask2;

public class Stomatology {
    protected String name;
    protected String address;
    protected String surnameOfPatient;
    protected int countOfDoctor;

    public Stomatology(String name, String address, String surnameOfPatient, int countOfDoctor) {
        this.name = name;
        this.address = address;
        this.surnameOfPatient = surnameOfPatient;
        this.countOfDoctor = countOfDoctor;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getSurnameOfPatient() {
        return surnameOfPatient;
    }

    public int getCountOfDoctor() {
        return countOfDoctor;
    }

    // Сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSurnameOfPatient(String surnameOfPatient) {
        this.surnameOfPatient = surnameOfPatient;
    }

    public void setCountOfDoctor(int policyNumber) {
        this.countOfDoctor = countOfDoctor;
    }

    public String toString() {
        return String.format("Стоматология: \"%s\", %s, %s, %d \n", 
        name, address, surnameOfPatient, countOfDoctor);
    }
}
