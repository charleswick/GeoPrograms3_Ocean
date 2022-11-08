public class GradedPictureCharlieWick extends World{
    public int red;
    public int blue;
    public int green;
    public void go(){
        plane.pausetime=0;
        setback();
        plane.teleport(100,100);
        fish();
        plane.teleport(900,250);
        for(int row=0; row<800; row=row+100)
        {
            for (int col = 0;col < 800; col=col+100){
                plane.teleport(col,row);
                fish();
            }
        }
        for(int row=450; row<1000; row++)    //*** this is using new getBackground
        {
            for(int col=0; col<1000; col++)    //*** this is using new getBackgroun
            {
                plane.teleport(col,row);

                red   = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue  = plane.howMuchBlue();

//            if(red>250 && green >2 && blue>180) //&&green<240 && blue< 100)
//            {
//            }

                if((red>=0 && green>=0 && blue>=0) && (red<=255 && green<=255 && blue<=255))
                {
                    plane.setPixelColor(0,255,0);
                }

            }
        }
        for(int row=600; row<1000; row=row+100)
        {
            for (int col = 0;col < 960; col=col+100){
                plane.teleport(col,row);
                plane.setColor(250,140,5);
                coral();
            }
        }



    }

    public void fish(){
         int a = (30);
        plane.startingAngle(90);
        plane.turn(0);
        plane.triangle(a);
        plane.turn(180);
        plane.move(a);
        plane.turn(0);
        plane.triangle(90);

    }
    public void setback(){
        for (int rows = 0; rows < 1000; rows++)
        {


            for (int col = 0;col < 800; col++){
                plane.teleport(rows,col);
                plane.setPixelColor(65,245,255);
            }

        }
    }
    public void coral(){
        plane.startingAngle(270);
        plane.move(50);
        plane.startingAngle(225);
        plane.move(50);
        plane.startingAngle(0);
        plane.turn(135);
        plane.move(25);
        plane.startingAngle(0);
        plane.turn(135);
        plane.move(50);
        plane.startingAngle(45);
        plane.move(130);
        plane.startingAngle(300);
        plane.move(125);
    }

}
