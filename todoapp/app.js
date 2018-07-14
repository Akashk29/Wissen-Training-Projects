
//-----------------------------------------------
// Model i.e Todo ( id,title,completed)
class Todo {
    constructor(title) {
        Todo.id++;
        this.id = Todo.id;
        this.title = title;
        this.completed = false
    }
}
Todo.id = 0;
//-----------------------------------------------

// Service i.e TodoService

class TodoService {

    constructor() {
        this.todos = []

    }
    addTodo(title) {
        var temp = new Todo(title);
        var newToDoList = this.todos.concat(temp);
        this.todos = newToDoList;
    }
    editTodo(id, newTitle) {
        function editName(Todotemp) {
            if (Todotemp.id === id) { Todotemp.title = newTitle }
            return Todotemp;
        }
        var newToDoList = this.todos.map(editName)
        this.todos = newToDoList;
    }
    completeTodo(id) {
        var newToDoList = this.todos;
        newToDoList.forEach(element => {
            if (element.id === id)
                element.completed = !element.completed;
        });
        this.todos = newToDoList;
    }
    deleteTodo(id) {
      function checker(Todotemp){
        return Todotemp.id != id
      }
      var newToDoList = this.todos.filter(checker)
      this.todos = newToDoList
    }
    completeAll() {
        var newToDoList = this.todos;
        newToDoList.forEach(element => {
            if (element.completed === false)
                element.completed = true;
        });
        this.todos = newToDoList;
    }
    clearCompleted() {
        function checker(Todotemp){
            return Todotemp.completed === false
          }
          var newToDoList = this.todos.filter(checker)
          this.todos = newToDoList
    }
    viewTodos(filter) {
        // filter ==> 'ALL' | 'ACTIVE' | 'COMPLETED'
        if(filter === 'ALL'){
          this.todos = newToDoList; 
        }

        if(filter === 'ACTIVE'){
            function checker(Todotemp){
                return Todotemp.completed === false
              }
              var newToDoList = this.todos.filter(checker)
              this.todos = newToDoList
          }

          if(filter === 'COMPLETED'){
            function checker(Todotemp){
                return Todotemp.completed === true
              }
              var newToDoList = this.todos.filter(checker)
              this.todos = newToDoList
          }
    }

}

//-------------------------------------------

const todosService = new TodoService();





