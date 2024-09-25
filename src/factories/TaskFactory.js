import Task from '../models/Task';

class TaskFactory {
  static createTask(description, startTime, endTime, priority) {
    return new Task(description, startTime, endTime, priority);
  }
}

export default TaskFactory;
