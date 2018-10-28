
public class SimpleTime {
	private int hour;
	private int minute;
	private int second;
	
	//-------------getters and setters-----------------------
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = (hour>=0 && hour<24?hour:0);
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = (minute>=0 && minute<60?minute:0);
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = (second>-0 && second<60?second:0);
	}
	//-------------C'tors-----------------------
	
	public void midnight() {
		this.hour=0;
		this.minute=0;
		this.second=0;
	}
	public SimpleTime(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	//-------------------Methods----------------------------------
	public void setTime(int hour,int minute,int second) {
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public void add(SimpleTime st) {
		this.hour=this.hour+st.hour;
		this.minute=this.minute+st.minute;
		this.second=this.second+st.second;
	}
	public void addHour(int hour) {
		if (this.hour+hour<24) {
			this.hour+=hour;
		}else {
			this.hour+=hour-24;
		}
	}
	public void addMinute(int minute) {
		if (this.minute+minute<60) {
			this.minute=this.minute+minute;
		}else if (this.hour<23) {
			this.hour+=1;
			this.minute=0;
		}else {
			addHour(1);
			this.minute=0;
		}	
		}

	public void addSecond(int second) {
		if (this.second+second<60) {
			this.second=this.second+second;
		}else if (this.minute<59) {
			this.minute+=1;
			this.second=0;
		}else if(this.hour<23) {
			this.hour+=1;
			this.minute=0;
			this.second=0;
		}else {
			addMinute(1);
			this.second=0;
			
		}
	}
	public void tick() {
		addSecond(1);
	}
		
	public boolean equals(SimpleTime st) {
		return (this.hour==st.hour && this.minute==st.minute && this.second==st.second);
	}
	public String toString() {
		return (this.hour>9?this.hour:"0"+this.hour)+":"+
				(this.minute>9?this.minute:"0"+this.minute)+
				":"+(this.second>9?this.second:"0"+this.second);
	}
	
	
	
	
	
	
}
