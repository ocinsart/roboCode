package de.md.robocode.ole;
import robocode.Robot;
import java.awt.*;
import static robocode.util.Utils.normalRelativeAngleDegrees;


public class NicosRobot extends Robot {
    static int corner = 270;
    boolean stopWhenSeeRobot = false;


    public void run() {
        position();

        while (true) {
            house();
        }
    }


    public void position() {
        turnRight(normalRelativeAngleDegrees(corner - getHeading()));
        stopWhenSeeRobot = false;
        ahead(5000);
        turnLeft(90);
        ahead(5000);
        turnLeft(90);
        ahead(250);
        turnLeft(90);
    }

    public void house() {
        Graphics2D g = getGraphics();
        g.setColor(Color.BLACK);
        turnLeft(45);
        ahead(200);
        g.setColor(Color.BLACK);
        g.drawLine(260, 20, 130, 160);
        turnRight(80);
        ahead(125);
        g.setColor(Color.BLACK);
        g.drawLine(260, 20, 130, 160);
        g.drawLine(130, 160, 193, 250);
        turnRight(110);
        ahead(125);
        g.setColor(Color.BLACK);
        g.drawLine(260, 20, 130, 160);
        g.drawLine(130, 160, 193, 250);
        g.drawLine(193, 250, 260, 160);
        turnRight(125);
        ahead(125);
        g.setColor(Color.BLACK);
        g.drawLine(260, 20, 130, 160);
        g.drawLine(130, 160, 193, 250);
        g.drawLine(193, 250, 260, 160);
        g.drawLine(260, 160, 130, 160);
        turnLeft(90);
        ahead(200);
        g.setColor(Color.BLACK);
        g.drawLine(260, 20, 130, 160);
        g.drawLine(130, 160, 193, 250);
        g.drawLine(193, 250, 260, 160);
        g.drawLine(260, 160, 130, 160);
        g.drawLine(130, 160, 130, 20);
        turnLeft(140);
        ahead(195);
        g.setColor(Color.BLACK);
        g.drawLine(260, 20, 130, 160);
        g.drawLine(130, 160, 193, 250);
        g.drawLine(193, 250, 260, 160);
        g.drawLine(260, 160, 130, 160);
        g.drawLine(130, 160, 130, 20);
        g.drawLine(130, 20, 260, 160);
        turnRight(140);
        ahead(200);
        g.setColor(Color.BLACK);
        g.drawLine(260, 20, 130, 160);
        g.drawLine(130, 160, 193, 250);
        g.drawLine(193, 250, 260, 160);
        g.drawLine(260, 160, 130, 160);
        g.drawLine(130, 160, 130, 20);
        g.drawLine(130, 20, 260, 160);
        g.drawLine(260, 160, 260, 20);
        turnRight(90);
        ahead(105);
        g.setColor(Color.BLACK);
        g.drawLine(260, 20, 130, 160);
        g.drawLine(130, 160, 193, 250);
        g.drawLine(193, 250, 260, 160);
        g.drawLine(260, 160, 130, 160);
        g.drawLine(130, 160, 130, 20);
        g.drawLine(130, 20, 260, 160);
        g.drawLine(260, 160, 260, 20);
        g.drawLine(260, 20, 130, 20);
        back(100);
        turnRight(90);
        g.setColor(Color.RED);
        g.drawLine(260, 20, 130, 160);
        g.drawLine(130, 160, 193, 250);
        g.drawLine(193, 250, 260, 160);
        g.drawLine(260, 160, 130, 160);
        g.drawLine(130, 160, 130, 20);
        g.drawLine(130, 20, 260, 160);
        g.drawLine(260, 160, 260, 20);
        g.drawLine(260, 20, 130, 20);

    }


    public void onPaint(Graphics2D g) {
        g.setColor(Color.WHITE);
        g.drawLine(260, 20, 130, 160);
        g.drawLine(130, 160, 193, 250);
        g.drawLine(193, 250, 260, 160);
        g.drawLine(260, 160, 130, 160);
        g.drawLine(130, 160, 130, 20);
        g.drawLine(130, 20, 260, 160);
        g.drawLine(260, 160, 260, 20);
        g.drawLine(260, 20, 130, 20);
    }

}



