// import React from 'react';
// import TaskItem from './TaskItem';

// const TaskList = ({ tasks, onRemove, onEdit, onToggleComplete }) => {
//     return (
//         <div className="task-list">
//             {tasks.length === 0 ? (
//                 <p>No tasks scheduled for the day.</p>
//             ) : (
//                 tasks
//                     .sort((a, b) => a.startTime.localeCompare(b.startTime)) 
//                     .map((task) => (
//                         <TaskItem 
//                             key={task.description} 
//                             task={task} 
//                             onRemove={onRemove} 
//                             onEdit={onEdit} 
//                             onToggleComplete={onToggleComplete} 
//                         />
//                     ))
//             )}
//         </div>
//     );
// };

// export default TaskList;
import React, { useState } from 'react';
import TaskItem from './TaskItem';

const TaskList = ({ tasks, onRemove, onEdit, onToggleComplete }) => {
    const [filter, setFilter] = useState('All'); // State for filtering tasks
    const [sortOrder, setSortOrder] = useState('StartTime'); // State for sorting tasks

    const filteredTasks = tasks.filter(task => {
        if (filter === 'All') return true;
        return task.priority === filter;
    });

    const sortedTasks = [...filteredTasks].sort((a, b) => {
        if (sortOrder === 'Priority') {
            return a.priority.localeCompare(b.priority); // Sort by priority
        }
        return new Date(`1970-01-01T${a.startTime}:00`) - new Date(`1970-01-01T${b.startTime}:00`); // Default sorting by start time
    });

    return (
        <div className="task-list">
            <h2>Task List</h2>
            <div>
                <label>Filter by Priority: </label>
                <select onChange={(e) => setFilter(e.target.value)}>
                    <option value="All">All</option>
                    <option value="High">High</option>
                    <option value="Medium">Medium</option>
                    <option value="Low">Low</option>
                </select>

                <label>Sort by: </label>
                <select onChange={(e) => setSortOrder(e.target.value)}>
                    <option value="StartTime">Start Time</option>
                    <option value="Priority">Priority</option>
                </select>
            </div>

            <p>Remaining Tasks: {tasks.filter(task => !task.completed).length}</p>

            {sortedTasks.length > 0 ? (
                sortedTasks.map(task => (
                    <TaskItem
                        key={task.description}
                        task={task}
                        onRemove={onRemove}
                        onEdit={onEdit}
                        onToggleComplete={onToggleComplete}
                    />
                ))
            ) : (
                <p>No tasks scheduled for the day.</p>
            )}
        </div>
    );
};

export default TaskList;
