package ua.lviv.iot.models;

public class MacBook extends Good {
    private int displayDiagonal;
    private int manufactureYear;

    public MacBook(final String name,
                   final int price,
                   final int displayDiagonal,
                   final int manufactureYear,
                   final Delivery delivery) {

        super(name, price, delivery);
        this.displayDiagonal = displayDiagonal;
        this.manufactureYear = manufactureYear;
    }

    public int getDisplayDiagonal() {
        return displayDiagonal;
    }

    public void setDisplayDiagonal(final int displayDiagonal) {
        this.displayDiagonal = displayDiagonal;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(final int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }


}
