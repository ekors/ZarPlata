/**
 * Created by Ievgen.Korsun on 11/25/2016.
 */
public class Finance {
    private int fond;
    private int ostatok;
    private int totalFond = fond + ostatok;
    private static final int PREMIYA = 1000;
    private int totalZarplata;

    public int getFond() {
        return fond;
    }

    public void setFond(int fond) {
        this.fond = fond;
        if (fond < totalZarplata) {
            System.out.println("Фонд не может быть меньше суммарной чистой з/п сотрудников");
            return;
        }
    }

    public int getOstatok() {
        return ostatok;
    }

    public void setOstatok(int ostatok) {
        this.ostatok = ostatok;
    }

    public int getTotalFond() {
        return totalFond;
    }

    public static int getPREMIYA() {
        return PREMIYA;
    }

    public int getTotalZarplata() {
        return totalZarplata;
    }
}
