class Task {
    constructor(description, startTime, endTime, priority) {
      this.description = description;
      this.startTime = startTime;
      this.endTime = endTime;
      this.priority = priority;
      this.isCompleted = false;
    }
  
    markCompleted() {
      this.isCompleted = true;
    }
  
    updateTask(description, startTime, endTime, priority) {
      this.description = description || this.description;
      this.startTime = startTime || this.startTime;
      this.endTime = endTime || this.endTime;
      this.priority = priority || this.priority;
    }
  }
  
  export default Task;
  