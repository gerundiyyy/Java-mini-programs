package lab6.indtask2;

public class PatientHistory extends Stomatology {
    private String patientName;
    private int policyNumber;
    private String treatmentDate;
    private String services;
    private double payment;
    private String doctorName;

    public PatientHistory(String name, String address, String surnameOfPatient, int countOfDoctor,
            String patientName, int policyNumber, String treatmentDate,
            String services, double payment, String doctorName) {
        super(name, address, surnameOfPatient, countOfDoctor);
        this.patientName = patientName;
        this.policyNumber = policyNumber;
        this.treatmentDate = treatmentDate;
        this.services = services;
        this.payment = payment;
        this.doctorName = doctorName;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getTreatmentDate() {
        return treatmentDate;
    }

    public String getServices() {
        return services;
    }

    public double getPayment() {
        return payment;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setTreatmentDate(String treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return String.format(
                "История болезни:\nПациент: %s, Полис: %d\nДата: %s, Услуги: %s\nСумма: %.2f, Врач: %s\n",
                patientName, policyNumber, treatmentDate, services, payment, doctorName);
    }
}
