package ua.lviv.iot.models;

public class ComputerMouse extends Good {
    private int buttonCount;
    private int cableLenth;

    public ComputerMouse(final String name,
                         final int price,
                         final int buttonCount,
                         final int cableLenth,
                         final Delivery delivery) {

        super(name, price, delivery);
        this.buttonCount = buttonCount;
        this.cableLenth = cableLenth;
    }

    public int getButtonCount() {
        return buttonCount;
    }

    public void setButtonCount(final int buttonCount) {
        this.buttonCount = buttonCount;
    }

    public int getCableLenth() {
        return cableLenth;
    }

    public void setCableLenth(final int cableLenth) {
        this.cableLenth = cableLenth;
    }


}
