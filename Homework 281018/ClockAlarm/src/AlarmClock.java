
public class AlarmClock{
	private ExtendedTime currentTime;
	private Alarm[] alarmTime=new Alarm[5];
	
	

	public AlarmClock(ExtendedTime currentTime,Alarm alarmTime1, Alarm alarmTime2, Alarm alarmTime3, Alarm alarmTime4, Alarm alarmTime5) {
		this.currentTime = currentTime;
		this.alarmTime[0] = alarmTime1;
		this.alarmTime[1] = alarmTime2;
		this.alarmTime[2] = alarmTime3;
		this.alarmTime[3] = alarmTime4;
		this.alarmTime[4] = alarmTime5;
	}

	public void midnight() {
		SimpleTime time=new SimpleTime(0, 0, 0);
		this.currentTime=new ExtendedTime(0, 0, 0, true);
		this.alarmTime[0]=new Alarm(time, false, 0, false);
		this.alarmTime[1]=new Alarm(time, false, 0, false);
		this.alarmTime[2]=new Alarm(time, false, 0, false);
		this.alarmTime[3]=new Alarm(time, false, 0, false);
		this.alarmTime[4]=new Alarm(time, false, 0, false);
	}

	public void setAlarm(int alarmNumber,SimpleTime timer,
			boolean isSet,int snoozeTime,boolean isSnooze) {
	 alarmTime[alarmNumber]=new Alarm(timer, isSet, snoozeTime, isSnooze);
	}
	public void setAlarm(int alarmNumber,int hour,int minute,int second,
			boolean isSet,int snoozeTime,boolean isSnooze) {
		SimpleTime timer=new SimpleTime(hour, minute, second);
		alarmTime[alarmNumber]=new Alarm(timer, isSet, snoozeTime, isSnooze);
	}

	public ExtendedTime getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(ExtendedTime currentTime) {
		this.currentTime = currentTime;
	}

	public Alarm[] getAlarmTime() {
		return alarmTime;
	}

	public void setAlarmTime(Alarm[] alarmTime) {
		this.alarmTime = alarmTime;
	}
	
	
	
}


