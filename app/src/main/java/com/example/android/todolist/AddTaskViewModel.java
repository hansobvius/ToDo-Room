package com.example.android.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

import java.util.List;

public class AddTaskViewModel extends ViewModel{

    private LiveData<TaskEntry> mTaskEntry;

    // Note: The constructor should receive the database and the taskId
    public AddTaskViewModel(AppDatabase database, int id){
        mTaskEntry = database.taskDao().loadTaskById(id);
    }

    public LiveData<TaskEntry> getmTaskEntry(){
        return this.mTaskEntry;
    }
}
