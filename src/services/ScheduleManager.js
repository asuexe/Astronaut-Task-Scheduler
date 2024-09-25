import TaskFactory from '../factories/TaskFactory';
import TaskObserver from '../observers/TaskObserver';

class ScheduleManager {
  static instance;

  constructor() {
    if (ScheduleManager.instance) {
      return ScheduleManager.instance;
    }

    this.tasks = [];
    this.observers = [new TaskObserver()];
    ScheduleManager.instance = this;
  }

  addTask(description, startTime, endTime, priority) {
    const newTask = TaskFactory.createTask(description, startTime, endTime, priority);
    if (this.isOverlapping(newTask)) {
      this.notifyObservers(newTask);
      return "Error: Task conflicts with existing tasks.";
    }
    this.tasks.push(newTask);
    return "Task added successfully.";
  }

  removeTask(description) {
    const index = this.tasks.findIndex(task => task.description === description);
    if (index > -1) {
      this.tasks.splice(index, 1);
      return "Task removed successfully.";
    } else {
      return "Error: Task not found.";
    }
  }

  viewTasks() {
    if (this.tasks.length === 0) {
      return "No tasks scheduled for the day.";
    }

    return this.tasks
      .sort((a, b) => new Date(`1970-01-01T${a.startTime}:00Z`) - new Date(`1970-01-01T${b.startTime}:00Z`))
      .map(task => `${task.startTime} - ${task.endTime}: ${task.description} [${task.priority}]`)
      .join('\n');
  }

  isOverlapping(newTask) {
    return this.tasks.some(task =>
      (newTask.startTime < task.endTime && newTask.endTime > task.startTime)
    );
  }

  notifyObservers(task) {
    this.observers.forEach(observer => observer.notify(task));
  }
}

export default ScheduleManager;
