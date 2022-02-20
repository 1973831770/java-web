package bean;

public class Plan {


    //(8)编写实体类,实体类中属性名使用驼峰命名(例如:start_time 属性名要是startTime)（2分）

    private  int id;
    private  String name;
    private  String content;
    private  String start_time;
    private  int  status;
    private  int bid;
    private  String bname;

    public Plan() {
    }

    public Plan(int id, String name, String content, String start_time, int status, int bid, String bname) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.start_time = start_time;
        this.status = status;
        this.bid = bid;
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", start_time='" + start_time + '\'' +
                ", status=" + status +
                ", bid=" + bid +
                ", bname='" + bname + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
