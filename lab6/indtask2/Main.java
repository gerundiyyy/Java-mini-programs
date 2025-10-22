package lab6.indtask2;

public class Main {
    public static void main(String[] args) {
        ClinicRegistry registry = new ClinicRegistry();

        Stomatology clinic = new Stomatology("Стоматология №1", "ул. Ленина 5", "Рудский", 12);
        registry.addClinic(clinic);

        Departament dep = new Departament("Стоматология №1", "ул. Ленина 5", "Рудский", 12,
                "Хирургия", 2, "Смирнов А.А.");
        registry.addDepartment(dep);

        Doctor doc = new Doctor("Стоматология №1", "ул. Ленина 5", "Рудский", 12,
                "Хирургия", "Иванов И.И.", "Хирург", "К.м.н.", 15);
        registry.addDoctor(doc);

        PatientHistory hist = new PatientHistory("Стоматология №1", "ул. Ленина 5", "Рудский", 12,
                "Рудский Г.", 123456, "2025-10-22",
                "Удаление зуба", 150.0, "Иванов И.И.");
        registry.addHistory(hist);

        registry.printAll();
    }
}
