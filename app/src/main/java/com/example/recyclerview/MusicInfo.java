package com.example.recyclerview;

public class MusicInfo {
    String name;
    String singer;
    String time;

    public MusicInfo(String name, String singer, String time){
        this.name = name;
        this.singer = singer;
        this.time = time;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }
    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }

}
