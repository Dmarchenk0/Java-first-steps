package org.example.HW1.clock;

public class ClockDemo {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.setHours(11);
        clock.setMinutes(59);
        clock.setSeconds(50);
        clock.realTime();

        for (int i = 0; i < 9; i++) {
            clock.tick();
        }
        clock.realTime();
    }
}
