package bean;

public class Blogger {


    //(8)编写实体类,实体类中属性名使用驼峰命名(例如:start_time 属性名要是startTime)（2分）
    private  int bid;
    private String bname;

    public Blogger() {
    }

    public Blogger(int bid, String bname) {
        this.bid = bid;
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "Blogger{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                '}';
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
}
