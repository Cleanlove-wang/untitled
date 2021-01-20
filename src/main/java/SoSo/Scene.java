package SoSo;

public class Scene {
    private String type;
    private int date;
    private  int description;

    public Scene() {
    }

    public Scene(String type, int date, int description) {
        this.type = type;
        this.date = date;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }
}
