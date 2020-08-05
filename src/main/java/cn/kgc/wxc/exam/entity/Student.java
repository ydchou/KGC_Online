package cn.kgc.wxc.exam.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer sid;

    private String sprefix;

    private String name;

    private String idCard;

    private Integer gender;

    private Integer age;

    private String school;

    private String education;

    private String erfessional;

    private Integer workYear;

    private String navitePlace;

    private String address;

    private Double lreadyPay;

    private String note;

    private static final long serialVersionUID = 1L;

    public Student(Integer sid, String sprefix, String name, String idCard, Integer gender, Integer age, String school, String education, String erfessional, Integer workYear, String navitePlace, String address, Double lreadyPay, String note) {
        this.sid = sid;
        this.sprefix = sprefix;
        this.name = name;
        this.idCard = idCard;
        this.gender = gender;
        this.age = age;
        this.school = school;
        this.education = education;
        this.erfessional = erfessional;
        this.workYear = workYear;
        this.navitePlace = navitePlace;
        this.address = address;
        this.lreadyPay = lreadyPay;
        this.note = note;
    }

    public Student() {
        super();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSprefix() {
        return sprefix;
    }

    public void setSprefix(String sprefix) {
        this.sprefix = sprefix == null ? null : sprefix.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getErfessional() {
        return erfessional;
    }

    public void setErfessional(String erfessional) {
        this.erfessional = erfessional == null ? null : erfessional.trim();
    }

    public Integer getWorkYear() {
        return workYear;
    }

    public void setWorkYear(Integer workYear) {
        this.workYear = workYear;
    }

    public String getNavitePlace() {
        return navitePlace;
    }

    public void setNavitePlace(String navitePlace) {
        this.navitePlace = navitePlace == null ? null : navitePlace.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getLreadyPay() {
        return lreadyPay;
    }

    public void setLreadyPay(Double lreadyPay) {
        this.lreadyPay = lreadyPay;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", sprefix=").append(sprefix);
        sb.append(", name=").append(name);
        sb.append(", idCard=").append(idCard);
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append(", school=").append(school);
        sb.append(", education=").append(education);
        sb.append(", erfessional=").append(erfessional);
        sb.append(", workYear=").append(workYear);
        sb.append(", navitePlace=").append(navitePlace);
        sb.append(", address=").append(address);
        sb.append(", lreadyPay=").append(lreadyPay);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}