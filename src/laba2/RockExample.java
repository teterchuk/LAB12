package laba2;

public class RockExample {
    private int maxVersh;
    private int maxPerepad;
    private int lengthRoute;
    private int[] route;

    public int getMaxVersh() {
        return maxVersh;
    }

    public void setMaxVersh(int maxVersh) {
        this.maxVersh = maxVersh;
    }

    public int getMaxPerepad() {
        return maxPerepad;
    }

    public void setMaxPerepad(int maxPerepad) {
        this.maxPerepad = maxPerepad;
    }

    public int getLengthRoute() {
        return lengthRoute;
    }

    public void setLengthRoute(int lengthRoute) {
        if (lengthRoute > 2) {
            this.lengthRoute = lengthRoute;
        } else {
            System.out.println("Длина пути не может быть меньше трех");
        }
    }

    public void getRoute() {

    }


    private int positive (int max_f, int diff) {
        if (max_f+diff > maxVersh) {
            return maxVersh;
        }
        else
            return max_f+diff;
    }

    // Если границы смещаются в отрицательный диапазон, то ограничить нулем
    private int negative (int min_f, int diff) {
        if (min_f-diff < 0) {
            return 0;
        }
        else
            return min_f-diff;
    }


    public RockExample(){

    }
}
