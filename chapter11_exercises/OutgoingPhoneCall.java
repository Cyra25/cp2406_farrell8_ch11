public class OutgoingPhoneCall extends PhoneCall {
    double RATE_PER_MINUTE = 0.04;
    int timeInMinutes;
    public OutgoingPhoneCall(String phoneNum, int timeInMinutes){
        super(phoneNum);
        this.timeInMinutes = timeInMinutes;
        price = timeInMinutes * RATE_PER_MINUTE;
    }

    public String getPhoneNum(){
        return phoneNum;
    }

    public double getPrice() {
        return price;
    }

    public void getInfo() {
        System.out.println("Phone number - "+phoneNum+"\n" +"Rate per minute - "+ RATE_PER_MINUTE +
                "\n"+"Time in minutes - "+ timeInMinutes +"\n"+"Price - "+ price);
    }
}
