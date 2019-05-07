package dataStorage;
import questionEnums.*;

public class Participant {
	private double[] times;
	private int numberOfTimes = 0;
	private int arEXP;
	private int CECTaken;
	private Sex sex;
	private Affiliation affiliation;
	private Standing year;
	private College college;
	
	public Participant() {
		times = new double[3];
		arEXP = 0;
		CECTaken = 0;
		sex = Sex.NO_ANSWER;
		affiliation = Affiliation.UNDERGRAD;
		year = Standing.FRESH;
		college = College.CoAS;
	}
	
	public void addTime(double newTime) {
		if (numberOfTimes < 3) {
			times[numberOfTimes] = newTime;
			numberOfTimes += 1;
		}
	}

	public double[] getTimes() {
		return times;
	}

	public void setTimes(double[] times) {
		this.times = times;
	}

	public int getArEXP() {
		return arEXP;
	}

	public void setArEXP(int arEXP) {
		this.arEXP = arEXP;
	}

	public int getCECTaken() {
		return CECTaken;
	}

	public void setCECTaken(int cECTaken) {
		CECTaken = cECTaken;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public Affiliation getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(Affiliation affiliation) {
		this.affiliation = affiliation;
	}

	public Standing getYear() {
		return year;
	}

	public void setYear(Standing year) {
		this.year = year;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
	
	
}
