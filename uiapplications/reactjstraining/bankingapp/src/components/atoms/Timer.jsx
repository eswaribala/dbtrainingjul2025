import { Component } from "react";
class Timer extends Component{
    constructor(props) {
        super(props);
        console.log("Constructor invoked...")
        this.state = {
            currentTime:new Date()
        };
    }
    timerEvent=()=>{
            this.setState({
                currentTime:new Date()
            })
        }


    componentDidMount() {
        console.log("Component Mounted...");
         setInterval(this.timerEvent,1000);

    }

 

    render() {
        return (
             <h4>{this.state.currentTime.toLocaleTimeString()}</h4>

        );
    }
}

export default Timer;