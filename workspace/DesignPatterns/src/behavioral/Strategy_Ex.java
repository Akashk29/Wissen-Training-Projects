package behavioral;

import java.util.ArrayList.*;
import java.util.ArrayList;
import java.util.*;

public class Strategy_Ex {

	public static void main(String[] args) {
		Task t1 = new Task("clean", 25);
		Task t2 = new Task("bath", 15);
		Task t3 = new Task("brush", 5);

		TaskList tl = new TaskList();
		tl.addTask(t1);
		tl.addTask(t2);
		tl.addTask(t3);
		Strategy fc = new FCFS();
		Strategy stf = new STF();
		tl.setStrategy(stf);
		// System.out.println(fc.logic(tl));

		Task result = tl.getNext();
		System.out.println("next task is " + result.getName() + " and the duration is " + result.getDuration());

	}

}

class Task {

	private String name;
	private int duration;

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}

	public Task(String name, int duration) {
		this.name = name;
		this.duration = duration;
	}

}

class TaskList {

	Strategy strategy = new FCFS();
	ArrayList<Task> tasklist = new ArrayList<Task>();
	//int index = -1;

	public void addTask(Task t) {
	//eer	index++;
		tasklist.add(t);
	}

	public void delTask(Task t) {

		tasklist.remove(t);
	}

	public void setStrategy(Strategy s) {

		this.strategy = s;
	}

	public Task getNext() {

		return this.strategy.logic(this.tasklist);
	}                                                     

}

abstract class Strategy {
	Task nextTask;

	abstract Task logic(TaskList tasklist);
}

class FCFS extends Strategy {

	@Override
	public Task logic(TaskList taskList) {

		return taskList.tasklist.get(0);

	}

}

class STF extends Strategy {

	@Override
	public Task logic(TaskList tasklist) {
		nextTask = tasklist.tasklist.get(0);
		for (Task tasklistItem : tasklist.tasklist) {

			if (tasklistItem.getDuration() < nextTask.getDuration()) {
				nextTask = tasklistItem;
			}

		}
		return nextTask;
	}

}