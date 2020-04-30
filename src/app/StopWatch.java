package app;

import java.util.Date;

public class StopWatch {
    // Thời gian bắt đầu
    private Date startTime;

    // Thời gian kết thúc
    private Date endTime;

    public void start() {
        startTime = new Date();
    }

    public void stop() {
        endTime = new Date();
    }

    // trả về milisecond giữa thời gian bắt đầu và thời gian kết thúc
    public int getElapsedTime() {
        double time = endTime.getTime() - startTime.getTime();
        return (int) time;
    }
}
