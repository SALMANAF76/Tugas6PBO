// Lenovo.java
public class Lenovo implements Laptop {
    private int volume;
    private boolean isPowerOn;

    public Lenovo() {
        this.volume = 50; // Default volume
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Lenovo menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Lenovo mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOL) {
                volume += 10;
                System.out.println("Volume Lenovo: " + volume);
            } else {
                System.out.println("Volume Lenovo sudah maksimal!");
            }
        } else {
            System.out.println("Nyalakan Lenovo dulu!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOL) {
                volume -= 10;
                System.out.println("Volume Lenovo: " + volume);
            } else {
                System.out.println("Volume Lenovo sudah minimal!");
            }
        } else {
            System.out.println("Nyalakan Lenovo dulu!");
        }
    }
}
