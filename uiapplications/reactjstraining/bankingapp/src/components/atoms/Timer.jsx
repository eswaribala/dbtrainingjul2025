import { useState,useEffect } from "react";


function Timer(){
    //react hook -- state hook
    const [currentTime, setCurrentTime] = useState(new Date());

    useEffect(() => {
        const timerId = setInterval(() => {
            setCurrentTime(new Date());
        }, 1000);

        return () => {
            clearInterval(timerId);
        };
    }, []);

    return (
        <h4>{currentTime.toLocaleTimeString()}</h4>
    );
}

/*
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


*/

export default Timer;