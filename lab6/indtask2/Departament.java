package lab6.indtask2;

public class Departament extends Stomatology {
    private String departmentName;
    private int floor;
    private String surnameOfBoss;

    public Departament(String name, String address, String surnameOfPatient, int countOfDoctor,
                       String departmentName, int floor, String surnameOfBoss) {
        super(name, address, surnameOfPatient, countOfDoctor);
        this.departmentName = departmentName;
        this.floor = floor;
        this.surnameOfBoss = surnameOfBoss;
    }

    // Геттеры
    public String getDepartmentName() {
        return departmentName;
    }

    public int getFloor() {
        return floor;
    }

    public String getSurnameOfBoss() {
        return surnameOfBoss;
    }

    // Сеттеры
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setSurnameOfBoss(String surnameOfBoss) {
        this.surnameOfBoss = surnameOfBoss;
    }

    @Override
    public String toString() {
        return String.format(
            "Отделение: %s, этаж: %d, заведующий: %s\nКлиника: %s, адрес: %s, пациент: %s, врачей: %d\n",
            departmentName, floor, surnameOfBoss,
            getName(), getAddress(), getSurnameOfPatient(), getCountOfDoctor()
        );
    }
}
