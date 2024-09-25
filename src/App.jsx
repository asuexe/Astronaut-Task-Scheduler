import React, { useState } from 'react';
import TaskForm from './components/TaskForm';
import TaskList from './components/TaskList';
import './App.css'; // Import your CSS file

const App = () => {
    const [tasks, setTasks] = useState([]);

    const addTask = (newTask) => {
        const isOverlapping = tasks.some(task => 
            (newTask.startTime < task.endTime && newTask.endTime > task.startTime)
        );

        if (isOverlapping) {
            alert('Error: Task conflicts with an existing task.');
            return;
        }

        setTasks((prevTasks) => [...prevTasks, newTask]);
    };

    const removeTask = (description) => {
        setTasks((prevTasks) => prevTasks.filter(task => task.description !== description));
    };

    const editTask = (description) => {
        // Implement your edit logic here (optional feature)
        alert(`Edit task: ${description}`);
    };

    const toggleComplete = (description) => {
        setTasks((prevTasks) =>
            prevTasks.map(task =>
                task.description === description
                    ? { ...task, completed: !task.completed }
                    : task
            )
        );
    };

    return (
        <div className="app">
            <h1>Astronaut Daily Scheduler</h1>
            <TaskForm onAddTask={addTask} />
            <TaskList tasks={tasks} onRemove={removeTask} onEdit={editTask} onToggleComplete={toggleComplete} />
        </div>
    );
};

export default App;
