import { Route, Switch } from "react-router-dom";
// import './index.css';

import Home from './Home';
import About from './components/About';
import Navbar from './components/Navbar';
import Error from './components/Error';

export default function App(props){
  return(
    <div className = 'todoapp stack-large'>
      <Navbar />
      <Switch>
        <Route path = '/home' component = {Home} exact/>
        <Route path = '/about' component={About} />
        <Route component={Error} />
      </Switch>
    </div>
  )
}