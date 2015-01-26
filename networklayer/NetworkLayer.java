package AbstractClasses.NetworkLayer;

import java.util.Date;

abstract class NetworkLayer {
    Date lastUpdateDate;
    int lastSlice; //the ID of the last received slice today, counting from 1
    abstract void initialUpdate(); //called at startup and every day afterwards
    abstract void poll(); //called internally by a timer
}
