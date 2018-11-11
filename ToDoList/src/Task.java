import java.util.Arrays;

public class Task<T> {
	private T taskContent;
	private int taskDuration;
	
	public Task(T taskContent, int taskDuration) {
		super();
		this.taskContent = taskContent;
		this.taskDuration = taskDuration;
	}

	public T getTaskContent() {
		if (taskContent instanceof Object[])
			return (T) Arrays.deepToString((Object[]) taskContent);
return taskContent;
	}

	public void setTaskContent(T taskContent) {
		this.taskContent = taskContent;
	}

	public int getTaskDuration() {
		return taskDuration;
	}

	public void setTaskDuration(int taskDuration) {
		this.taskDuration = taskDuration;
	}

	@Override
	public String toString() {
		return getTaskContent()+"  " + this.taskDuration;
	}
	
	
}
