# User Guide
This is an user guide for a greenfield Java project. It's named after the Java mascot _Duke_.

##Table of Contents
* [1. Features](#1-features)
    * [1.1 Task Management](#11-task-management)
* [2. Usage](#2-usage)
    * [2.1 `todo` - Add ToDo Task](#21-todo---add-todo-task)
    * [2.2 `deadline` - Add Deadline Task](#22-deadline---add-deadline-task)
    * [2.3 `event` - Add Event Task](#23-event---add-event-task)
    * [2.4 `list` - Print Task List](#24-list---print-task-list)
    * [2.5 `delete` - Delete Task](#25-delete---delete-task)
    * [2.6 `done` - Mark Task as Done](#26-done---mark-task-as-done)
    * [2.7 `find` - Find Task by Keyword](#27-find---find-task-by-keyword)
    * [2.8 `bye` - End Programme](#28-bye---end-programme)
* [3. Command Summary](#3-command-summary)


## 1. Features 
### 1.1 Task Management
Users are able to:
* Add a task of type: Todo, Deadline, or Event to a task list.
* Delete a task from the list.
* List all tasks in the list.
* Mark a task as done in the list.

## 2. Usage

### 2.1 `todo` - Add ToDo Task

This will add a ToDo task to the list.

Example of usage: 

`todo task1`

Expected outcome 

`Got it. I've added this task:`

`task1`

`Now you have 1 task in the list.`

### 2.2 `deadline` - Add Deadline Task

This will add a Deadline task to the list.

Example of usage: 

`deadline task1 /by monday`

Expected outcome:

`Got it. I've added this task:`

`task1 (by: monday)`

`Now you have 1 task in the list.`

### 2.3 `event` - Add Event Task

This will add an Event task to the list.

Example of usage: 

`event task1 /at monday`

Expected outcome:

`Got it. I've added this task:`

`task1 (at: monday)`

`Now you have 1 task in the list.`

### 2.4 `list` - Print Task List

This will print the Task List.

Example of usage: 

`list`

Expected outcome:

`Here are the tasks in your list.`

`[T][✘] task1`

`[T][✘] task2`

### 2.5 `delete` - Delete Task

This will delete a task from the list.

Example of usage: 

`delete 1`

Expected outcome:

`Noted. I've removed this task:`

`[T][✘] task2`

`Now you have 1 task in the list.`

### 2.6 `done` - Mark Task as Done

This will mark a task from the list as done.

Example of usage: 

`done 1`

Expected outcome:

`Got it, I've marked this task as done:`

`[T][✓] task2`

### 2.7 `find` - Find Task by Keyword

This will find the task by keyword.

Example of usage: 

`find book`

Expected outcome:

`Here are the matching tasks in your list: `

`[T][✓] book review`

`[D][✓] return book (by tomorrow)`


### 2.8 `bye` - End Programme

This will terminate the programme.

Example of usage: 

`bye`

Expected outcome:

`bye:`

`Bye. Hope to see you again soon!`

## 3. Command Summary

|Feature                               |Command                                               |
|---                                   |---                                                   |
| Add a Todo task                      |`todo description`                             |
| Add a Deadline task                  |`deadline description /by deadline`  |
| Add an Event task                    |`event description /at time`     |
| List all tasks                       |`list`   |
| Delete a task                        |`delete task_index`                                 |
| Mark a task as done                  |`done task_index`                                   |
| Find a task by keyword               |`find keyword`                                    |                                   |                                  
| Exit                                 |`bye`|

