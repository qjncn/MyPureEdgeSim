/**
 *     PureEdgeSim:  A Simulation Framework for Performance Evaluation of Cloud, Edge and Mist Computing Environments 
 *
 *     This file is part of PureEdgeSim Project.
 *
 *     PureEdgeSim is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     PureEdgeSim is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with PureEdgeSim. If not, see <http://www.gnu.org/licenses/>.
 *     
 *     @author Mechalikh
 **/
package com.mechalikh.pureedgesim.LocationManager;

public abstract class Mobility {

	protected Location currentLocation;
	protected boolean isMobile = false;
	protected double minPauseDuration;
	protected double maxPauseDuration;
	protected double maxMobilityDuration;
	protected double minMobilityDuration;
	protected double speed;

	public Mobility(Location location, boolean mobile, double speed, double minPauseDuration, double maxPauseDuration,
			double minMobilityDuration, double maxMobilityDuration) { 
		this.currentLocation = location;
		this.isMobile = mobile;
		this.setMinPauseDuration(minPauseDuration);
		this.setMaxPauseDuration(maxPauseDuration);
		this.setMinMobilityDuration(minMobilityDuration);
		this.setMaxMobilityDuration(maxMobilityDuration);
		this.setSpeed(speed);
	}

	public Mobility() {
	}

	public abstract Location getNextLocation();

	public Location getCurrentLocation() {
		return currentLocation;
	}

	public boolean isMobile() {
		return isMobile;
	}

	public void setMobile(boolean mobile) {
		isMobile = mobile;
	}

	public double getMinPauseDuration() {
		return minPauseDuration;
	}

	public void setMinPauseDuration(double minPauseDuration) {
		this.minPauseDuration = minPauseDuration;
	}

	public double getMaxPauseDuration() {
		return maxPauseDuration;
	}

	public void setMaxPauseDuration(double maxPauseDuration) {
		this.maxPauseDuration = maxPauseDuration;
	}

	public double getMinMobilityDuration() {
		return minMobilityDuration;
	}

	public void setMinMobilityDuration(double minMobilityDuration) {
		this.minMobilityDuration = minMobilityDuration;
	}

	public double getMaxMobilityDuration() {
		return maxMobilityDuration;
	}

	public void setMaxMobilityDuration(double maxMobilityDuration) {
		this.maxMobilityDuration = maxMobilityDuration;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
}
