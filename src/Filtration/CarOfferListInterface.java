package Filtration;

public interface CarOfferListInterface {

    public void addOffer(CarOffer newoffers);

    public void showAll();

    public void searchbyDate(String from, String to);

    public void searchbyTitle(String keyword);

    public void searchbyMileage(Integer keynumber);

    public void searchbyPrice(Double from, Double to);

    public void sortbyPrice(Boolean descanding);

    public void sortbyItemDate(Boolean descanding);

    public void sortbyDate(Boolean descanding);

    public void sortbyTitle(Boolean descanding);
}
