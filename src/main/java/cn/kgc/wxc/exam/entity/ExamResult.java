package cn.kgc.wxc.exam.entity;

import java.io.Serializable;

public class ExamResult implements Serializable {
    private Integer eid;

    private Integer epid;

    private Integer result;

    private static final long serialVersionUID = 1L;

    public ExamResult(Integer eid, Integer epid, Integer result) {
        this.eid = eid;
        this.epid = epid;
        this.result = result;
    }

    public ExamResult() {
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

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eid=").append(eid);
        sb.append(", epid=").append(epid);
        sb.append(", result=").append(result);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}