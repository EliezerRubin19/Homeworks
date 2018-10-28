import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter actual time: (HH:MM:SS)");
		String mytime=scan.nextLine();
		String[] arrMytime=mytime.split(":");
		int acct_hour = Integer.parseInt(arrMytime[0]);
		int acct_minute = Integer.parseInt(arrMytime[1]);
		int acct_second = Integer.parseInt(arrMytime[2]);
		
		
		System.out.println("Please enter the alarm time and snooze info: (HH:MM:SS,isAlarmOn(true or false)"
				+ ",snooze_time(in minutes),isSnoozeOn(true or false))");
		String alarmtInfo=scan.nextLine();
		String[] splitAlarmInfo = alarmtInfo.split(",");
		String[] splitAlarmTime = splitAlarmInfo[0].split(":");
		int alarm_hour = Integer.parseInt(splitAlarmTime[0]);
		int alarm_minute = Integer.parseInt(splitAlarmTime[1]);
		int alarm_second = Integer.parseInt(splitAlarmTime[2]);
		boolean isAlarmSet = Boolean.parseBoolean(splitAlarmInfo[1]);
		int snoozeTime = Integer.parseInt(splitAlarmInfo[2]);
		boolean isSnoozeSet=Boolean.parseBoolean(splitAlarmInfo[3]);
		
		ExtendedTime time=new ExtendedTime(acct_hour, acct_minute, acct_second,true);
		SimpleTime wakeuptime=new SimpleTime(alarm_hour, alarm_minute, alarm_second);
		Alarm timer1=new Alarm(wakeuptime, isAlarmSet, snoozeTime, isSnoozeSet);
		AlarmClock alarm=new AlarmClock(time, timer1, null, null, null, null);
		
			
		System.out.println(time.toString());
				for (int i=0;i<2;i++) {
		while (!wakeuptime.equals((SimpleTime)time)) {
			time.tick();
			System.out.println(time.toString());
		}
		System.out.println("Wake UP!!!!!!!");
		java.awt.Toolkit.getDefaultToolkit().beep();
		wakeuptime.addSecond(timer1.getSnoozeTime());
				}
	}
}
