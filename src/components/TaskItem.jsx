import React from 'react';

const TaskItem = ({ task, onRemove, onEdit, onToggleComplete }) => {
    return (
        <div className={`task-item ${task.completed ? 'completed' : ''}`}>
            <h3>{task.description} [{task.priority}]</h3>
            <p>Start: {task.startTime} - End: {task.endTime}</p>
            <button onClick={() => onToggleComplete(task.description)}>
                {task.completed ? 'Undo' : 'Complete'}
            </button>
            <button onClick={() => onEdit(task.description)}>Edit</button>
            <button onClick={() => onRemove(task.description)}>Remove</button>
        </div>
    );
};

export default TaskItem;
