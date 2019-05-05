public class GraduateStudent extends Student {

    public GraduateStudent(int idNum, String lastName){
        super(idNum, lastName);
        setTuition();
    }

    @Override
    public void setTuition() {
        tuition = 6000;
    }
}
