package lab6.indtask2;

public class Doctor extends Stomatology {
    private String departmentName;
    private String fullName;
    private String position;
    private String academicTitle;
    private int experienceYears;

    public Doctor(String name, String address, String surnameOfPatient, int countOfDoctor,
            String departmentName, String fullName, String position,
            String academicTitle, int experienceYears) {
        super(name, address, surnameOfPatient, countOfDoctor);
        this.departmentName = departmentName;
        this.fullName = fullName;
        this.position = position;
        this.academicTitle = academicTitle;
        this.experienceYears = experienceYears;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getAcademicTitle() {
        return academicTitle;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAcademicTitle(String academicTitle) {
        this.academicTitle = academicTitle;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return String.format("Врач: %s (%s)\nДолжность: %s, Звание: %s, Стаж: %d лет",
                fullName, departmentName, position, academicTitle, experienceYears);
    }
}
