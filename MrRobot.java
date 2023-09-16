package mrrobot;
import robocode.*;
import java.awt.Color;
/**
 * MrRobot - a class by (Lucas Vieira)
 */
public class MrRobot extends Robot
{
	public void run() {
		setColors(Color.red, Color.green, Color.green);
		
		while (true) {
			ahead(300);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}
	
	public void onScannedRobot(ScannedRobotEvent e) {
		if (e.getDistance() < 400) {
			fire(3);
		} else {
			 fire(1);
		}
	}
	
	public void onHitByBullet(HitByBulletEvent e) {
		turnRight(45);
		back(120);
	}
	
	public void onHitRobot (HitRobotEvent e) {
		back(50);
		ahead(100);
	}
}
