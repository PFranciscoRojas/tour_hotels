package com.tour.hotels.domain.dto;

public class RoomDto {
   
    private Long ide;
    private Boolean roomState;
    private int cost;
    private int capacy;
    private Long duration;
    private Long appointment;
    private String kind;
    
    public Boolean getRoomState() {
        return roomState;
    }
    public void setRoomState(Boolean roomState) {
        this.roomState = roomState;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public int getCapacy() {
        return capacy;
    }
    public void setCapacy(int capacy) {
        this.capacy = capacy;
    }
    public Long getDuration() {
        return duration;
    }
    public void setDuration(Long duration) {
        this.duration = duration;
    }
    public Long getAppointment() {
        return appointment;
    }
    public void setAppointment(Long appointment) {
        this.appointment = appointment;
    }
    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }
    public Long getIde() {
        return ide;
    }
    public void setIde(Long ide) {
        this.ide = ide;
    }

    
}
