package entity;

/*
    定义手机的实体类
 */
public class Iphone {
    private int id;
    //手机名称
    private String name;
    //手机分辨率
    private String resolution;
    //手机摄像头
    private String camera;
    //手机系统
    private String system;
    //手机运行内存
    private String memory;

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

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
    //不带参的构造函数
    public Iphone() {

    }

    //带参的构造函数
    public Iphone(int id, String name, String resolution, String camera, String system, String memory) {
        this.id = id;
        this.name = name;
        this.resolution = resolution;
        this.camera = camera;
        this.system = system;
        this.memory = memory;
    }
}
