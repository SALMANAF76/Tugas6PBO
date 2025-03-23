// MacBook.java
public class MacBook implements Laptop {
    private int volume;
    private boolean isPowerOn;

    public MacBook() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("MacBook menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("MacBook mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOL) {
                volume += 10;
                System.out.println("Volume MacBook: " + volume);
            } else {
                System.out.println("Volume MacBook sudah maksimal!");
            }
        } else {
            System.out.println("Nyalakan MacBook dulu!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOL) {
                volume -= 10;
                System.out.println("Volume MacBook: " + volume);
            } else {
                System.out.println("Volume MacBook sudah minimal!");
            }
        } else {
            System.out.println("Nyalakan MacBook dulu!");
        }
    }
}
