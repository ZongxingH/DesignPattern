package hzx.design.flyweight.weiqi.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.flyweight.design.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/13 15:47
 */
public class WeiQi {
    private String color;
    private Locations locations;

    public WeiQi(String color) {
        this.color = color;
    }

    public Locations getLocations() {
        return locations;
    }

    public void setLocations(Locations locations) {
        this.locations = locations;
    }
    public void display(Locations locations){
        System.out.println(color);
        System.out.println(locations);
    }
}
