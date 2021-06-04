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

        System.out.print(route[0] + " " + route[1] + " ");

        int dif = 1; //max - min

        for (int i = 2; i < lengthRoute; i++) {

            int a = down(min, maxPerepad - dif);
            int b = up(max, maxPerepad - dif);


            route[i] = Math.round((float)Math.random() * (b - a) + a);

            //Ищем мин. и максимум двух соседних вершин
            if (route[i-1] > route[i]) {
                max = route[i-1];
                min = route[i];
            }
            else {
                max = route[i];
                min = route[i-1];
            }

            dif = Math.abs(max-min);

            System.out.print(route[i] + " ");

        }


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
