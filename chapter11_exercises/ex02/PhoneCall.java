package ex02;

public abstract class PhoneCall {
    String phoneNum;
    double price;
    String info;
    public PhoneCall(String phoneNum){
        this.phoneNum=phoneNum;
        price = 0.0;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public abstract String getPhoneNum();
    public abstract double getPrice();
    public abstract void getInfo();
}
