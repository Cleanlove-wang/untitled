package SoSo;

public class ConsumInfo {
    private String cardnumber;
    private  String type;
    private  int consumDate;

    public ConsumInfo() {
    }

    public ConsumInfo(String cardnumber, String type, int consumDate) {
        this.cardnumber = cardnumber;
        this.type = type;
        this.consumDate = consumDate;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getConsumDate() {
        return consumDate;
    }

    public void setConsumDate(int consumDate) {
        this.consumDate = consumDate;
    }
}
