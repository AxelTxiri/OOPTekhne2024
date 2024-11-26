package Model;

public class VideoGame {
    private int id;
    private String title;
    private double price;
    private String platform;
    private int stock;

    public VideoGame() {
    }

    public VideoGame(int id, String title, double price, String platform, int stock) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.platform = platform;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
