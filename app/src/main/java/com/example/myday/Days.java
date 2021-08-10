package com.example.myday;

import java.io.Serializable;

public class Days implements Serializable {
    private String dayName;

    public Days(String dayName) {
        this.dayName = dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public String getDayName() {
        return dayName;
    }
}
