package cn.kgc.wxc.exam.entity;

import java.io.Serializable;

public class ClassRoom implements Serializable {
    private Integer rid;
    private Integer floor;
    private Integer classNumber;
    private Integer maxPeople;
    private Integer status;
    private Integer projector;
    private String wifiPassword;
    private static final long serialVersionUID = 1L;
    public ClassRoom(Integer rid, Integer floor, Integer classNumber, Integer maxPeople, Integer status, Integer projector, String wifiPassword) {
        this.rid = rid;
        this.floor = floor;
        this.classNumber = classNumber;
        this.maxPeople = maxPeople;
        this.status = status;
        this.projector = projector;
        this.wifiPassword = wifiPassword;
    }
    public ClassRoom() {
    }
    public Integer getRid() {
        return rid;
    }
    public void setRid(Integer rid) {
        this.rid = rid;
    }
    public Integer getFloor() {
        return floor;
    }
    public void setFloor(Integer floor) {
        this.floor = floor;
    }
    public Integer getClassNumber() {
        return classNumber;
    }
    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }
    public Integer getMaxPeople() {
        return maxPeople;
    }
    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getProjector() {
        return projector;
    }
    public void setProjector(Integer projector) {
        this.projector = projector;
    }
    public String getWifiPassword() {
        return wifiPassword;
    }
    public void setWifiPassword(String wifiPassword) {
        this.wifiPassword = wifiPassword == null ? null : wifiPassword.trim();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rid=").append(rid);
        sb.append(", floor=").append(floor);
        sb.append(", classNumber=").append(classNumber);
        sb.append(", maxPeople=").append(maxPeople);
        sb.append(", status=").append(status);
        sb.append(", projector=").append(projector);
        sb.append(", wifiPassword=").append(wifiPassword);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}