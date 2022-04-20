import cx from "classnames";
import { Component } from "react";

export default class TodoList extends Component {
  render() {
    //   to do list items
    const [todos, setTodos] = React.useState([
      {
        // todo items
        text: "Toptal Practical Test",
        doneYet: true,
        text: "Do laundry",
        doneYet: false,
        text: "Call Mum",
        doneYet: false,
      },
    ]);

    const addTodo = (text) => {
      const newTodos = [...todos, { text: text }];
      setTodos(newTodos);
    };

    const markTodo = (position) => {
      const newTodos = [...todos, {}];
      newTodos[position].doneYet = true;
      setTodos(newTodos);
      };
      
    return (
      <>
        <div>
                <h2>Todo List</h2>
                <input addTodo={addTodo} />
                <Button variant="primary mb-3" type="submit">
      Submit
                </Button>
                <h2>{todos.doneYet} remaining out of {todos} tasks</h2>
                <div>
                    {todos.map((todo, index) = (
                        <li className="is-done">
                            <ul>

                            <Todo key={position} index={position} todo={todo} markTodo={markTodo} />
                            </ul>
                            
                        </li>
                    ))}
                </div>
        </div>
        <style>{`
                    .is-done {
                        text-decoration: line-through;
                    }
                `}</style>
      </>
    );
  }
}
