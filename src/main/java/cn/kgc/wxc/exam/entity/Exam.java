package cn.kgc.wxc.exam.entity;

import java.io.Serializable;
import java.util.Date;

public class Exam implements Serializable {
    private Integer eid;

    private Integer epid;

    private Integer rid;

    private Date startTime;

    private Date endTime;

    private Integer peopleCount;

    private static final long serialVersionUID = 1L;

    public Exam(Integer eid, Integer epid, Integer rid, Date startTime, Date endTime, Integer peopleCount) {
        this.eid = eid;
        this.epid = epid;
        this.rid = rid;
        this.startTime = startTime;
        this.endTime = endTime;
        this.peopleCount = peopleCount;
    }

    public Exam() {
        super();
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getEpid() {
        return epid;
    }

    public void setEpid(Integer epid) {
        this.epid = epid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eid=").append(eid);
        sb.append(", epid=").append(epid);
        sb.append(", rid=").append(rid);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", peopleCount=").append(peopleCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}