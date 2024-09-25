// import React, { useState } from 'react';

// const TaskForm = ({ onAddTask }) => {
//     const [description, setDescription] = useState('');
//     const [startTime, setStartTime] = useState('');
//     const [endTime, setEndTime] = useState('');
//     const [priority, setPriority] = useState('Medium');

//     const handleSubmit = (e) => {
//         e.preventDefault();

//         // Input validation
//         if (!description || !startTime || !endTime) {
//             alert('Please fill in all fields.');
//             return;
//         }

//         // Task object to be added
//         const newTask = {
//             description,
//             startTime,
//             endTime,
//             priority,
//             completed: false,
//         };

//         onAddTask(newTask);

//         // Reset form fields
//         setDescription('');
//         setStartTime('');
//         setEndTime('');
//         setPriority('Medium');
//     };

//     return (
//         <form onSubmit={handleSubmit}>
//             <input 
//                 type="text" 
//                 placeholder="Task Description" 
//                 value={description} 
//                 onChange={(e) => setDescription(e.target.value)} 
//             />
//             <input 
//                 type="time" 
//                 value={startTime} 
//                 onChange={(e) => setStartTime(e.target.value)} 
//             />
//             <input 
//                 type="time" 
//                 value={endTime} 
//                 onChange={(e) => setEndTime(e.target.value)} 
//             />
//             <select value={priority} onChange={(e) => setPriority(e.target.value)}>
//                 <option value="High">High</option>
//                 <option value="Medium">Medium</option>
//                 <option value="Low">Low</option>
//             </select>
//             <button type="submit">Add Task</button>
//         </form>
//     );
// };

// export default TaskForm;
import React, { useState } from 'react';

const TaskForm = ({ onAddTask }) => {
    const [description, setDescription] = useState('');
    const [startTime, setStartTime] = useState('09:00');
    const [endTime, setEndTime] = useState('10:00');
    const [priority, setPriority] = useState('Medium');

    const handleSubmit = (e) => {
        e.preventDefault();

        // Input validation
        if (!description || !startTime || !endTime) {
            alert('Please fill in all fields.');
            return;
        }

        // Task object to be added
        const newTask = {
            description,
            startTime,
            endTime,
            priority,
            completed: false,
        };

        onAddTask(newTask);

        // Reset form fields
        setDescription('');
        setStartTime('09:00');
        setEndTime('10:00');
        setPriority('Medium');
    };

    return (
        <form onSubmit={handleSubmit} className="task-form">
            <input 
                type="text" 
                placeholder="Task Description" 
                value={description} 
                onChange={(e) => setDescription(e.target.value)} 
                required 
            />
            <div className="time-picker">
                <label>Start Time:</label>
                <input 
                    type="time" 
                    value={startTime} 
                    onChange={(e) => setStartTime(e.target.value)} 
                    required 
                />
                <label>End Time:</label>
                <input 
                    type="time" 
                    value={endTime} 
                    onChange={(e) => setEndTime(e.target.value)} 
                    required 
                />
            </div>
            <select value={priority} onChange={(e) => setPriority(e.target.value)}>
                <option value="High">High</option>
                <option value="Medium">Medium</option>
                <option value="Low">Low</option>
            </select>
            <button type="submit">Add Task</button>
        </form>
    );
};

export default TaskForm;
