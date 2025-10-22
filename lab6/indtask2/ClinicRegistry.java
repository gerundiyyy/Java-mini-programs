package lab6.indtask2;

import java.util.ArrayList;
import java.util.List;

public class ClinicRegistry {
    private List<Stomatology> clinics = new ArrayList<>();
    private List<Departament> departments = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<PatientHistory> histories = new ArrayList<>();

    // Методы добавления
    public void addClinic(Stomatology clinic) {
        clinics.add(clinic);
    }

    public void addDepartment(Departament department) {
        departments.add(department);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addHistory(PatientHistory history) {
        histories.add(history);
    }

    // Метод печати всего списка
    public void printAll() {
        System.out.println("Список стоматологий:");
        for (Stomatology s : clinics) {
            System.out.println(s);
        }

        System.out.println("\nОтделения:");
        for (Departament d : departments) {
            System.out.println(d);
        }

        System.out.println("\nВрачи:");
        for (Doctor doc : doctors) {
            System.out.println(doc);
        }

        System.out.println("\nИстории болезней:");
        for (PatientHistory h : histories) {
            System.out.println(h);
        }
    }
}
