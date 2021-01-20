package SoSo;

public class TalkPackage {
    private  int talkTime;
    private int smsCount;
    private  double price;

    public TalkPackage() {
    }

    public TalkPackage(int talkTime, int smsCount, double price) {
        this.talkTime = talkTime;
        this.smsCount = smsCount;
        this.price = price;
    }

    public int getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(int talkTime) {
        this.talkTime = talkTime;
    }

    public int getSmsCount() {
        return smsCount;
    }

    public void setSmsCount(int smsCount) {
        this.smsCount = smsCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void showInfo(){}
}
