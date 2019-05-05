public class UndergraduateStudent extends Student{

    public UndergraduateStudent(int idNum, String lastName){
        super(idNum, lastName);
        setTuition();
    }

    @Override
    public void setTuition() {
        tuition = 4000;
    }
}
