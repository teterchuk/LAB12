package laba2;

public class RockExample {
    private int maxVersh;
    private int maxPerepad;
    private int lengthRoute;


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
        int[] route = new int[lengthRoute];
        route[0] = 0;
        route[1] = 1;
        int max = 1;
        int min = 0;

        System.out.print(route[0] + " ");

    }


    private int up (int localMax, int diff) {
        if (localMax+diff > maxVersh) {
            return maxVersh;
        }
        else
            return localMax+diff;
    }

    private int down (int localMin, int diff) {
        if (localMin-diff < 0) {
            return 0;
        }
        else
            return localMin-diff;
    }


    public RockExample(){

    }
}
