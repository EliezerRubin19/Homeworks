
public class ExtendedTime extends SimpleTime{
	private boolean is24Hours;

	public boolean isIs24Hours() {
		return is24Hours;
	}

	public void setIs24Hours(boolean is24Hours) {
		this.is24Hours = is24Hours;
	}

	public ExtendedTime(int hour, int minute, int second, boolean is24Hours) {
		super(hour, minute, second);
		this.is24Hours = is24Hours;
	}

	@Override
	public void midnight() {
		super.midnight();
		this.is24Hours=true;
	}

	@Override
	public String toString() {
	 if (is24Hours)
		 return super.toString();
		else if (super.getHour()<13) 
			 return super.toString();
		else 
			return ((super.getHour()-12)>9?super.getHour()-12:"0"+(super.getHour()-12))+":"+
			(super.getMinute()>9?super.getMinute():"0"+super.getMinute())+
			":"+(super.getSecond()>9?super.getSecond():"0"+super.getSecond());

			
			
	}

	
	
	

}
