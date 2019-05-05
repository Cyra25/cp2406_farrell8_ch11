public class IncomingPhoneCall extends PhoneCall {
    double RATE = 0.02;
    public IncomingPhoneCall(String phoneNum){
        super(phoneNum);
        price = RATE;
    }

    public String getPhoneNum(){
        return phoneNum;
    }

    public double getPrice() {
        return price;
    }

    public void getInfo() {
        System.out.println("Phone number - "+phoneNum+"\n" +"Rate - "+  RATE+"\n"+"Price - "+  price);
    }
}
