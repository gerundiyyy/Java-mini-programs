package lab6;


public class Person {
    private String FIO;
    public Person() {
    }

    public String getFIO() {
        return this.FIO;
    }

    public final void setFIO(String FIO){ 
        this.FIO = FIO;
    }
}