import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Parcel {
    Random random = new Random();
    private List<String> randomNames = new ArrayList<>(Arrays.asList("Klaudiusz Marzec", "Włodzimierz Kula",
            "Anastazja Pąk", "Sebastian Pastuch", "Bożydar Wielki", "Eugeniusz Rzęsiwoda"));
    private String sender;
    private String receiver;
    private double weight;
    private boolean priority;

    public Parcel(String sender, String receiver, double weight) {
        try{
            if(sender.isBlank() || receiver.isBlank()){
                throw new IllegalArgumentException("Podaj adresata lub nadawcę");
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        try {
            if (weight <= 0 || weight > 1000){
                throw new IllegalArgumentException("Dozwolony zakres wagi: 1-1000gram");
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }

        this.sender = sender;
        this.receiver = receiver;
        this.weight = weight;
    }

    public Parcel() {
        this.sender = randomNames.get(random.nextInt(randomNames.size()));
        this.receiver = randomNames.get(random.nextInt(randomNames.size()));
        this.weight = random.nextInt(1, 1000);
        this.priority = random.nextBoolean();


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
