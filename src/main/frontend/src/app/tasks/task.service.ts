import {Http} from "@angular/http";
import { Injectable } from "@angular/core";
import 'rxjs/add/operator/map';
import { Task } from "./task.model";

@Injectable()
export class TaskService {

  constructor(private http: Http) {

  }

  getTasks(){
    return this.http.get('/api/tasks').map(response => response.json());
  }

  saveTask(task: Task, checked: boolean){
    task.completed = checked;
    return this.http.post('/api/task/save', task).map(response => response.json());
  }

}
