package org.example.HW1.clock;

public class Clock implements Readable{
    private int Hours;
    private int Minutes;
    private int Seconds;

    public int getHours() {
        return this.Hours;
    }

    public int getMinutes() {
        return this.Minutes;
    }

    public int getSeconds() {
        return this.Seconds;
    }

    public void setHours(int hours) {
        this.Hours = hours;
    }

    public void setMinutes(int minutes) {
        this.Minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.Seconds = seconds;
    }

    public void tick() {
        Seconds += 1;
    }

    @Override
    public void realTime() {
        System.out.println("Present time: " + getHours() + ":" + getMinutes() + ":" + getSeconds());
    }
}
