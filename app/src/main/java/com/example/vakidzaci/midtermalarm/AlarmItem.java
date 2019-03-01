package com.example.vakidzaci.midtermalarm;

public class AlarmItem {


    String message;
    String time;

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    boolean check;


    public AlarmItem(String time,String message,boolean check){
        this.time = time;
        this.message = message;
        this.check = check;
    }
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
