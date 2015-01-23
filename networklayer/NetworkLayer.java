abstract class NetworkLayer {
    Date lastUpdateDate;
    int lastSlice; //the ID of the last received slice today, counting from 1
    void initialUpdate(); //called at startup and every day afterwards
    void poll(); //called internally by a timer
}
