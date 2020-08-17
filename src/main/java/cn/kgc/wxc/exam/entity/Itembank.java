package cn.kgc.wxc.exam.entity;

import java.io.Serializable;

public class Itembank implements Serializable {
    private Integer eid;

    private String title;

    private Integer choice;

    private String answerA;

    private String answerB;

    private String answerC;

    private String answerD;

    private String rightAnswer;

    private String knowledgePoint;

    private String resolveExample;

    private Integer testCount;

    private Integer rightCount;

    private Integer subject;

    private Integer chapter;

    private Integer detail;

    private static final long serialVersionUID = 1L;

    public Itembank(Integer eid, String title, Integer choice, String answerA, String answerB, String answerC, String answerD, String rightAnswer, String knowledgePoint, String resolveExample) {
        this.eid = eid;
        this.title = title;
        this.choice = choice;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.rightAnswer = rightAnswer;
        this.knowledgePoint = knowledgePoint;
        this.resolveExample = resolveExample;
    }

    public Itembank() {
        super();
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getChoice() {
        return choice;
    }

    public void setChoice(Integer choice) {
        this.choice = choice;
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA == null ? null : answerA.trim();
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB == null ? null : answerB.trim();
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC == null ? null : answerC.trim();
    }

    public String getAnswerD() {
        return answerD;
    }

    public void setAnswerD(String answerD) {
        this.answerD = answerD == null ? null : answerD.trim();
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer == null ? null : rightAnswer.trim();
    }

    public String getKnowledgePoint() {
        return knowledgePoint;
    }

    public void setKnowledgePoint(String knowledgePoint) {
        this.knowledgePoint = knowledgePoint == null ? null : knowledgePoint.trim();
    }

    public String getResolveExample() {
        return resolveExample;
    }

    public void setResolveExample(String resolveExample) {
        this.resolveExample = resolveExample == null ? null : resolveExample.trim();
    }

    public Integer getTestCount() {
        return testCount;
    }

    public void setTestCount(Integer testCount) {
        this.testCount = testCount;
    }

    public Integer getRightCount() {
        return rightCount;
    }

    public void setRightCount(Integer rightCount) {
        this.rightCount = rightCount;
    }

    public Integer getSubject() {
        return subject;
    }

    public void setSubject(Integer subject) {
        this.subject = subject;
    }

    public Integer getChapter() {
        return chapter;
    }

    public void setChapter(Integer chapter) {
        this.chapter = chapter;
    }

    public Integer getDetail() {
        return detail;
    }

    public void setDetail(Integer detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eid=").append(eid);
        sb.append(", title=").append(title);
        sb.append(", choice=").append(choice);
        sb.append(", answerA=").append(answerA);
        sb.append(", answerB=").append(answerB);
        sb.append(", answerC=").append(answerC);
        sb.append(", answerD=").append(answerD);
        sb.append(", rightAnswer=").append(rightAnswer);
        sb.append(", knowledgePoint=").append(knowledgePoint);
        sb.append(", resolveExample=").append(resolveExample);
        sb.append(", testCount=").append(testCount);
        sb.append(", rightCount=").append(rightCount);
        sb.append(", subject=").append(subject);
        sb.append(", chapter=").append(chapter);
        sb.append(", detail=").append(detail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}