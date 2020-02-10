package de.md.robocode.ole;

import robocode.Robot;
import java.awt.*;

public class ElifsRobot extends Robot {

    boolean stopWhenSeeRobot = false;


    public void run() {
        position();


        while (true) {
            house();
        }
    }


    public void position() {

        stopWhenSeeRobot = false;
        turnRight(-getHeading());
        back(5000);
        turnRight(90);
        ahead(5000);
        back(250);
        turnLeft(90);
    }


    public void house() {
        int hausgroesse = 200;
        double dachLaenge = Math.sqrt(hausgroesse / 2 * hausgroesse / 2 + hausgroesse / 2 * hausgroesse / 2);
        double diagonale = Math.sqrt(hausgroesse * hausgroesse + hausgroesse * hausgroesse);
        System.out.println("DachLaenge: " + dachLaenge);
        System.out.println("DachLaenge: " + diagonale);
        System.out.println("Ich bin hier: (" + this.getX() + ", " + this.getY() + ")");

        turnRight(90);
        ahead(hausgroesse);
        turnLeft(90);
        ahead(hausgroesse);
        turnLeft(90);
        ahead(hausgroesse);
        turnRight(135);
        ahead(dachLaenge);
        turnRight(90);
        ahead(dachLaenge);
        turnRight(90);
        ahead(diagonale);
        turnRight(135);
        ahead(hausgroesse);
        turnRight(135);
        ahead(diagonale);
        turnRight(135);
        ahead(hausgroesse);
        turnRight(90);

    }


    public void onPaint(Graphics2D g) {
        g.setColor(Color.WHITE);
        g.drawLine(550, 20, 750, 20);
        g.drawLine(750, 20, 750, 220);
        g.drawLine(750, 220, 550, 220);
        g.drawLine(550, 220, 650, 320);
        g.drawLine(650, 320, 750, 220);
        g.drawLine(750, 220, 550, 20);
        g.drawLine(550, 20, 550, 220);
        g.drawLine(550, 220, 750, 20);

    }

}



