package ex08;

public class StudentAtLarge extends Student {
    public StudentAtLarge(int idNum, String lastName){
        super(idNum, lastName);
        setTuition();
    }

    @Override
    public void setTuition() {
        tuition = 2000;
    }
}
