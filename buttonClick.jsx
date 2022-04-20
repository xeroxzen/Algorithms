import cx from "classnames";
import { Component } from "react";

// Build a counter which increments on the click of button using React 16. The component should be the default export (use export default)

export default class Counter extends Component {
  render() {
    const [counter, setCounter] = useState(42);

    // counting upwards
    const up = () => {
      setCounter(counter + 1);
    };
    return (
      <>
        <div>
          <h2>Counter</h2>
          <h2>{counter}</h2>
          <button className="counter-button" onClick={up}>
            Click
          </button>
        </div>
        <style>{`
                    .counter-button {
                        font-size: 1rem;
                        padding: 5px 10px;
                        color:  #585858;
                    }
                `}</style>
      </>
    );
  }
}
