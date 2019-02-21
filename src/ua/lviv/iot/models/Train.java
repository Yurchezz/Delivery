package ua.lviv.iot.models;

public class Train{
    private String mark;
    private int railwayСarriageCount;

    public Train(){
    }

    public Train(String mark, int railwayСarriageCount){
        this.mark = mark;
        this.railwayСarriageCount = railwayСarriageCount;
    }

    public String getMark(){
        return mark;
    }

    public void setMark(String mark){
        this.mark = mark;
    }

    public int getRailwayСarriageCount(){
        return railwayСarriageCount;
    }

    public void setRailwayСarriageCount(int railwayСarriageCount){
        this.railwayСarriageCount = railwayСarriageCount;
    }

    @Override
    public String toString(){
        return "Train{" +
                "mark='" + mark + '\'' +
                ", railwayСarriageCount=" + railwayСarriageCount +
                '}';
    }
}
