package ex08;

public abstract class Student {
    int idNum;
    String lastName;
    int tuition;
    public Student(int idNum, String lastName){
        this.idNum = idNum;
        this.lastName = lastName;
    }

    public int getIdNum() {
        return idNum;
    }

    public int getTuition() {
        return tuition;
    }

    public String getLastName() {
        return lastName;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public abstract void setTuition();
}
