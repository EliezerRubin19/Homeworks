
public class Alarm {
	private SimpleTime  time;
	private boolean isSet;
	private int snoozeTime;
	private boolean isSnooze;
	 public void midnight() {
		 this.time.setHour(0);
		 this.time.setMinute(0);
		 this.time.setSecond(0);
		 this.snoozeTime=0;
		 this.isSnooze=false;
	 }
	public Alarm(SimpleTime time, boolean isSet, int snoozeTime, boolean isSnooze) {
		super();
		this.time = time;
		this.isSet = isSet;
		this.snoozeTime = snoozeTime;
		this.isSnooze = isSnooze;
	}
	public SimpleTime getTime() {
		return time;
	}
	public void setTime(SimpleTime time) {
		this.time = time;
	}
	public boolean isSet() {
		return isSet;
	}
	public void setSet(boolean isSet) {
		this.isSet = isSet;
	}
	public int getSnoozeTime() {
		return snoozeTime;
	}
	public void setSnoozeTime(int snozeTime) {
		this.snoozeTime = snozeTime;
	}
	public boolean isSnooze() {
		return isSnooze;
	}
	public void setSnooze(boolean isSnooze) {
		this.isSnooze = isSnooze;
	}
	 
}
