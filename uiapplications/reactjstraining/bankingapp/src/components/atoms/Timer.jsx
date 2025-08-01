import { Component } from "react";
class Timer extends Component{
    constructor(props) {
        super(props);
        console.log("Constructor invoked...")
        this.state = {
            currentTime:new Date()
        };
    }

    componentDidMount() {
        console.log("Component Mounted...");
        this.interval = setInterval(() => {
            this.setState(prevState => ({
                currentTime:new Date()
            }));
        }, 1000);
    }

    componentWillUnmount() {
        clearInterval(this.interval);
    }

    render() {
        return (
            <div>
                <h1>{this.state.currentTime.toLocaleTimeString()}</h1>
                
            </div>
        );
    }
}

export default Timer;