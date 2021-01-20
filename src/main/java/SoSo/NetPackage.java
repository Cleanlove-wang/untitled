package SoSo;

public class NetPackage {
    private int flow;
    private  double price;

    public NetPackage() {
    }

    public NetPackage(int flow, double price) {
        this.flow = flow;
        this.price = price;
    }

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void showInfo(){}
}
