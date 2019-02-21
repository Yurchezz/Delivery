package ua.lviv.iot.models;

public class Plane{
    private String mark;
    private int maxHight;
    private int tonnage;

    public Plane(){
        this("undefined",0,0);
    }

    public Plane(String mark, int maxHight, int tonnage){
        this.mark = mark;
        this.maxHight = maxHight;
        this.tonnage = tonnage;
    }

    public String getMark(){
        return mark;
    }

    public void setMark(String mark){
        this.mark = mark;
    }

    public int getMaxHight(){
        return maxHight;
    }

    public void setMaxHight(int maxHight){
        this.maxHight = maxHight;
    }

    public int getTonnage(){
        return tonnage;
    }

    public void setTonnage(int tonnage){
        this.tonnage = tonnage;
    }

    @Override
    public String toString(){
        return "Plane{" +
                "mark='" + mark + '\'' +
                ", maxHight=" + maxHight +
                ", tonnage=" + tonnage +
                '}';
    }
}
