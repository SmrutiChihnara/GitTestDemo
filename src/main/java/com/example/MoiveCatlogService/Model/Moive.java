package com.example.MoiveCatlogService.Model;

public class Moive {
    private int moiveId;
    private String name;

    public Moive(int moiveId, String name) {
        this.moiveId = moiveId;
        this.name = name;
    }

    public Moive(){
    }

    public int getMoiveId() {
        return moiveId;
    }

    public void setMoiveId(int moiveId) {
        this.moiveId = moiveId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
