public class Parcel {
    private String sender;
    private String receiver;
    private double weight;
    private boolean priority;

    public Parcel(String sender, String receiver, double weight) {

        this.sender = sender;
        this.receiver = receiver;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", weight=" + weight + "gram" +
                ", priority=" + priority +
                '}';
    }
}
