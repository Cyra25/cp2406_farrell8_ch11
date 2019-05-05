public class PhoneCallArray {
    public static void main(String[] args){
        PhoneCall[] phoneCalls = new PhoneCall[10];
        phoneCalls[0] = new IncomingPhoneCall("1111");
        phoneCalls[1] = new OutgoingPhoneCall("2222", 2);
        phoneCalls[2] = new IncomingPhoneCall("3333");
        phoneCalls[3] = new OutgoingPhoneCall("4444", 4);
        phoneCalls[4] = new IncomingPhoneCall("5555");
        phoneCalls[5] = new OutgoingPhoneCall("6666", 6);
        phoneCalls[6] = new OutgoingPhoneCall("7777", 7);
        phoneCalls[7] = new IncomingPhoneCall("8888");
        phoneCalls[8] = new IncomingPhoneCall("9999");
        phoneCalls[9] = new OutgoingPhoneCall("1010", 10);
        for(int x=0; x<phoneCalls.length;++x){
            phoneCalls[x].getInfo();
            System.out.println();
        }
    }
}
