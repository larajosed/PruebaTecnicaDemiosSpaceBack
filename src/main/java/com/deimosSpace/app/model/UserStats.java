package com.deimosSpace.app.model;

import java.io.Serializable;

public class UserStats implements Serializable {

	private int totalUsersCount;
	private double inactiveUsersPercent;
	private int femaleUsersCount;
	private int maleUsersCount;

	public int getTotalUsersCount() {
		return totalUsersCount;
	}

	public void setTotalUsersCount(int totalUsersCount) {
		this.totalUsersCount = totalUsersCount;
	}

	public double getInactiveUsersPercent() {
		return inactiveUsersPercent;
	}

	public void setInactiveUsersPercent(double inactiveUsersPercent) {
		this.inactiveUsersPercent = inactiveUsersPercent;
	}

	public int getFemaleUsersCount() {
		return femaleUsersCount;
	}

	public void setFemaleUsersCount(int femaleUsersCount) {
		this.femaleUsersCount = femaleUsersCount;
	}

	public int getMaleUsersCount() {
		return maleUsersCount;
	}

	public void setMaleUsersCount(int maleUsersCount) {
		this.maleUsersCount = maleUsersCount;
	}

}
