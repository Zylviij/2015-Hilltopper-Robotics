package org.usfirst.frc.team1732.systems;

public class Direction {
	private double m_yDist;
	private double m_xDist;
	
	Direction(double x, double y) {
		m_yDist = y;
		m_xDist = x;
	}
	
	public double getDist() {
		return Math.sqrt((m_yDist * m_yDist) + (m_xDist * m_xDist));
	}
	
	public double getDirection() {
		return Math.atan2(m_yDist, m_xDist);
	}
	
}
