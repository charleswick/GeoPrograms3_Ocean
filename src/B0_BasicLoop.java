public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail = true;
        plane.pausetime = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        for (int rows = 0; rows < 20; rows = rows + 1)
        {


            for (int houses = 0;houses < 20; houses = houses+1){
                    System.out.println(rows);
                    plane.setColor((10)*rows, (10)*houses, 150);
                    plane.teleport(15 * houses, rows*10+25);
                    plane.house(10);
                }

        }

    }
}