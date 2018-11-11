import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

public class App {

	public static void main(String[] args) {
		Queue<Task> Q1=new LinkedList<>();
		Queue<Task> Q2=new LinkedList<>();
		Q1.add(new Task("Buy food",20));
		Q1.add(new Task(new String[]{"Clean room","Clean garden"},50));
		Q2.add(new Task("Clean room",20));
		Q2.add(new Task(new String[][]{{"Buy drink","Buy food"},{"Pay to post", "Pay to bank"}},120));
		
		Hashtable<String, Queue<Task>> toDoList=new Hashtable<>();
		toDoList.put("Bob", Q1);
		toDoList.put("Alice", Q2);
		
		for (String name:toDoList.keySet()){
			System.out.println("The name: "+name);
			int taskSum=0;
			for (Task task:toDoList.get(name)){
				System.out.println(task);
				taskSum+=task.getTaskDuration();
			}
			System.out.println(" Total time: "+ taskSum+"\n");
			
			}
		}
}
