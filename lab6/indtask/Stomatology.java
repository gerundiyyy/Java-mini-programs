package lab6.indtask;

public class Stomatology {
    private String name;
    private String address;
    private String surnameOfPatient;
    private int policyNumber;
    private String dateOfTreatment;
    private String doctorOfPatient;
    private String workDescription;
    private double sumOfServices;

    public Stomatology(String name, String address, String surnameOfPatient, int policyNumber, String dateOfTreatment) {
        this.name = name;
        this.address = address;
        this.surnameOfPatient = surnameOfPatient;
        this.policyNumber = policyNumber;
        this.dateOfTreatment = dateOfTreatment;
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

    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getDateOfTreatment() {
        return dateOfTreatment;
    }

    public String getDoctorOfPatient() {
        return doctorOfPatient;
    }

    public String getWorkDescription() {
        return workDescription;
    }

    public double getSumOfServices() {
        return sumOfServices;
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

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setDateOfTreatment(String dateOfTreatment) {
        this.dateOfTreatment = dateOfTreatment;
    }

    public void setDoctorOfPatient(String doctorOfPatient) {
        this.doctorOfPatient = doctorOfPatient;
    }

    public void setWorkDescription(String workDescription) {
        this.workDescription = workDescription;
    }

    public void setSumOfServices(double sumOfServices) {
        this.sumOfServices = sumOfServices;
    }

    public String toString() {
        return String.format("Стоматология: \"%s\", %s, %s, %d, %s, %s, %s, %s", 
        name, address, surnameOfPatient, policyNumber, dateOfTreatment, doctorOfPatient, workDescription, sumOfServices);
    }

    public static void main (String[] args){
        Stomatology st = new Stomatology("Стоматология 1","ул.П.Бровки", "Рудский", 123, "10-12-2024");
        st.setDoctorOfPatient("Врач");
        st.setWorkDescription("Операция");
        st.setSumOfServices(1);
        System.out.println(st);
    }
}
