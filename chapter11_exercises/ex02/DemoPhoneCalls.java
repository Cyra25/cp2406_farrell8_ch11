package ex02;

public class DemoPhoneCalls {
    public static void main(String[] args){
        IncomingPhoneCall incomingPhoneCall = new IncomingPhoneCall("1234");
        OutgoingPhoneCall outgoingPhoneCall = new OutgoingPhoneCall("4321", 10);
        incomingPhoneCall.getInfo();
        outgoingPhoneCall.getInfo();
    }
}
