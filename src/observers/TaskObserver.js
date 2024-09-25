class TaskObserver {
    notify(task) {
      console.log(`Conflict detected with task: ${task.description}`);
    }
  }
  
  export default TaskObserver;
  