package cn.kgc.wxc.exam.entity;

import java.util.ArrayList;
import java.util.List;

public class ExamPaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamPaperExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andEpidIsNull() {
            addCriterion("epid is null");
            return (Criteria) this;
        }

        public Criteria andEpidIsNotNull() {
            addCriterion("epid is not null");
            return (Criteria) this;
        }

        public Criteria andEpidEqualTo(Integer value) {
            addCriterion("epid =", value, "epid");
            return (Criteria) this;
        }

        public Criteria andEpidNotEqualTo(Integer value) {
            addCriterion("epid <>", value, "epid");
            return (Criteria) this;
        }

        public Criteria andEpidGreaterThan(Integer value) {
            addCriterion("epid >", value, "epid");
            return (Criteria) this;
        }

        public Criteria andEpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("epid >=", value, "epid");
            return (Criteria) this;
        }

        public Criteria andEpidLessThan(Integer value) {
            addCriterion("epid <", value, "epid");
            return (Criteria) this;
        }

        public Criteria andEpidLessThanOrEqualTo(Integer value) {
            addCriterion("epid <=", value, "epid");
            return (Criteria) this;
        }

        public Criteria andEpidIn(List<Integer> values) {
            addCriterion("epid in", values, "epid");
            return (Criteria) this;
        }

        public Criteria andEpidNotIn(List<Integer> values) {
            addCriterion("epid not in", values, "epid");
            return (Criteria) this;
        }

        public Criteria andEpidBetween(Integer value1, Integer value2) {
            addCriterion("epid between", value1, value2, "epid");
            return (Criteria) this;
        }

        public Criteria andEpidNotBetween(Integer value1, Integer value2) {
            addCriterion("epid not between", value1, value2, "epid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andQ1idIsNull() {
            addCriterion("q1id is null");
            return (Criteria) this;
        }

        public Criteria andQ1idIsNotNull() {
            addCriterion("q1id is not null");
            return (Criteria) this;
        }

        public Criteria andQ1idEqualTo(Integer value) {
            addCriterion("q1id =", value, "q1id");
            return (Criteria) this;
        }

        public Criteria andQ1idNotEqualTo(Integer value) {
            addCriterion("q1id <>", value, "q1id");
            return (Criteria) this;
        }

        public Criteria andQ1idGreaterThan(Integer value) {
            addCriterion("q1id >", value, "q1id");
            return (Criteria) this;
        }

        public Criteria andQ1idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q1id >=", value, "q1id");
            return (Criteria) this;
        }

        public Criteria andQ1idLessThan(Integer value) {
            addCriterion("q1id <", value, "q1id");
            return (Criteria) this;
        }

        public Criteria andQ1idLessThanOrEqualTo(Integer value) {
            addCriterion("q1id <=", value, "q1id");
            return (Criteria) this;
        }

        public Criteria andQ1idIn(List<Integer> values) {
            addCriterion("q1id in", values, "q1id");
            return (Criteria) this;
        }

        public Criteria andQ1idNotIn(List<Integer> values) {
            addCriterion("q1id not in", values, "q1id");
            return (Criteria) this;
        }

        public Criteria andQ1idBetween(Integer value1, Integer value2) {
            addCriterion("q1id between", value1, value2, "q1id");
            return (Criteria) this;
        }

        public Criteria andQ1idNotBetween(Integer value1, Integer value2) {
            addCriterion("q1id not between", value1, value2, "q1id");
            return (Criteria) this;
        }

        public Criteria andQ2idIsNull() {
            addCriterion("q2id is null");
            return (Criteria) this;
        }

        public Criteria andQ2idIsNotNull() {
            addCriterion("q2id is not null");
            return (Criteria) this;
        }

        public Criteria andQ2idEqualTo(Integer value) {
            addCriterion("q2id =", value, "q2id");
            return (Criteria) this;
        }

        public Criteria andQ2idNotEqualTo(Integer value) {
            addCriterion("q2id <>", value, "q2id");
            return (Criteria) this;
        }

        public Criteria andQ2idGreaterThan(Integer value) {
            addCriterion("q2id >", value, "q2id");
            return (Criteria) this;
        }

        public Criteria andQ2idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q2id >=", value, "q2id");
            return (Criteria) this;
        }

        public Criteria andQ2idLessThan(Integer value) {
            addCriterion("q2id <", value, "q2id");
            return (Criteria) this;
        }

        public Criteria andQ2idLessThanOrEqualTo(Integer value) {
            addCriterion("q2id <=", value, "q2id");
            return (Criteria) this;
        }

        public Criteria andQ2idIn(List<Integer> values) {
            addCriterion("q2id in", values, "q2id");
            return (Criteria) this;
        }

        public Criteria andQ2idNotIn(List<Integer> values) {
            addCriterion("q2id not in", values, "q2id");
            return (Criteria) this;
        }

        public Criteria andQ2idBetween(Integer value1, Integer value2) {
            addCriterion("q2id between", value1, value2, "q2id");
            return (Criteria) this;
        }

        public Criteria andQ2idNotBetween(Integer value1, Integer value2) {
            addCriterion("q2id not between", value1, value2, "q2id");
            return (Criteria) this;
        }

        public Criteria andQ3idIsNull() {
            addCriterion("q3id is null");
            return (Criteria) this;
        }

        public Criteria andQ3idIsNotNull() {
            addCriterion("q3id is not null");
            return (Criteria) this;
        }

        public Criteria andQ3idEqualTo(Integer value) {
            addCriterion("q3id =", value, "q3id");
            return (Criteria) this;
        }

        public Criteria andQ3idNotEqualTo(Integer value) {
            addCriterion("q3id <>", value, "q3id");
            return (Criteria) this;
        }

        public Criteria andQ3idGreaterThan(Integer value) {
            addCriterion("q3id >", value, "q3id");
            return (Criteria) this;
        }

        public Criteria andQ3idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q3id >=", value, "q3id");
            return (Criteria) this;
        }

        public Criteria andQ3idLessThan(Integer value) {
            addCriterion("q3id <", value, "q3id");
            return (Criteria) this;
        }

        public Criteria andQ3idLessThanOrEqualTo(Integer value) {
            addCriterion("q3id <=", value, "q3id");
            return (Criteria) this;
        }

        public Criteria andQ3idIn(List<Integer> values) {
            addCriterion("q3id in", values, "q3id");
            return (Criteria) this;
        }

        public Criteria andQ3idNotIn(List<Integer> values) {
            addCriterion("q3id not in", values, "q3id");
            return (Criteria) this;
        }

        public Criteria andQ3idBetween(Integer value1, Integer value2) {
            addCriterion("q3id between", value1, value2, "q3id");
            return (Criteria) this;
        }

        public Criteria andQ3idNotBetween(Integer value1, Integer value2) {
            addCriterion("q3id not between", value1, value2, "q3id");
            return (Criteria) this;
        }

        public Criteria andQ4idIsNull() {
            addCriterion("q4id is null");
            return (Criteria) this;
        }

        public Criteria andQ4idIsNotNull() {
            addCriterion("q4id is not null");
            return (Criteria) this;
        }

        public Criteria andQ4idEqualTo(Integer value) {
            addCriterion("q4id =", value, "q4id");
            return (Criteria) this;
        }

        public Criteria andQ4idNotEqualTo(Integer value) {
            addCriterion("q4id <>", value, "q4id");
            return (Criteria) this;
        }

        public Criteria andQ4idGreaterThan(Integer value) {
            addCriterion("q4id >", value, "q4id");
            return (Criteria) this;
        }

        public Criteria andQ4idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q4id >=", value, "q4id");
            return (Criteria) this;
        }

        public Criteria andQ4idLessThan(Integer value) {
            addCriterion("q4id <", value, "q4id");
            return (Criteria) this;
        }

        public Criteria andQ4idLessThanOrEqualTo(Integer value) {
            addCriterion("q4id <=", value, "q4id");
            return (Criteria) this;
        }

        public Criteria andQ4idIn(List<Integer> values) {
            addCriterion("q4id in", values, "q4id");
            return (Criteria) this;
        }

        public Criteria andQ4idNotIn(List<Integer> values) {
            addCriterion("q4id not in", values, "q4id");
            return (Criteria) this;
        }

        public Criteria andQ4idBetween(Integer value1, Integer value2) {
            addCriterion("q4id between", value1, value2, "q4id");
            return (Criteria) this;
        }

        public Criteria andQ4idNotBetween(Integer value1, Integer value2) {
            addCriterion("q4id not between", value1, value2, "q4id");
            return (Criteria) this;
        }

        public Criteria andQ5idIsNull() {
            addCriterion("q5id is null");
            return (Criteria) this;
        }

        public Criteria andQ5idIsNotNull() {
            addCriterion("q5id is not null");
            return (Criteria) this;
        }

        public Criteria andQ5idEqualTo(Integer value) {
            addCriterion("q5id =", value, "q5id");
            return (Criteria) this;
        }

        public Criteria andQ5idNotEqualTo(Integer value) {
            addCriterion("q5id <>", value, "q5id");
            return (Criteria) this;
        }

        public Criteria andQ5idGreaterThan(Integer value) {
            addCriterion("q5id >", value, "q5id");
            return (Criteria) this;
        }

        public Criteria andQ5idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q5id >=", value, "q5id");
            return (Criteria) this;
        }

        public Criteria andQ5idLessThan(Integer value) {
            addCriterion("q5id <", value, "q5id");
            return (Criteria) this;
        }

        public Criteria andQ5idLessThanOrEqualTo(Integer value) {
            addCriterion("q5id <=", value, "q5id");
            return (Criteria) this;
        }

        public Criteria andQ5idIn(List<Integer> values) {
            addCriterion("q5id in", values, "q5id");
            return (Criteria) this;
        }

        public Criteria andQ5idNotIn(List<Integer> values) {
            addCriterion("q5id not in", values, "q5id");
            return (Criteria) this;
        }

        public Criteria andQ5idBetween(Integer value1, Integer value2) {
            addCriterion("q5id between", value1, value2, "q5id");
            return (Criteria) this;
        }

        public Criteria andQ5idNotBetween(Integer value1, Integer value2) {
            addCriterion("q5id not between", value1, value2, "q5id");
            return (Criteria) this;
        }

        public Criteria andQ6idIsNull() {
            addCriterion("q6id is null");
            return (Criteria) this;
        }

        public Criteria andQ6idIsNotNull() {
            addCriterion("q6id is not null");
            return (Criteria) this;
        }

        public Criteria andQ6idEqualTo(Integer value) {
            addCriterion("q6id =", value, "q6id");
            return (Criteria) this;
        }

        public Criteria andQ6idNotEqualTo(Integer value) {
            addCriterion("q6id <>", value, "q6id");
            return (Criteria) this;
        }

        public Criteria andQ6idGreaterThan(Integer value) {
            addCriterion("q6id >", value, "q6id");
            return (Criteria) this;
        }

        public Criteria andQ6idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q6id >=", value, "q6id");
            return (Criteria) this;
        }

        public Criteria andQ6idLessThan(Integer value) {
            addCriterion("q6id <", value, "q6id");
            return (Criteria) this;
        }

        public Criteria andQ6idLessThanOrEqualTo(Integer value) {
            addCriterion("q6id <=", value, "q6id");
            return (Criteria) this;
        }

        public Criteria andQ6idIn(List<Integer> values) {
            addCriterion("q6id in", values, "q6id");
            return (Criteria) this;
        }

        public Criteria andQ6idNotIn(List<Integer> values) {
            addCriterion("q6id not in", values, "q6id");
            return (Criteria) this;
        }

        public Criteria andQ6idBetween(Integer value1, Integer value2) {
            addCriterion("q6id between", value1, value2, "q6id");
            return (Criteria) this;
        }

        public Criteria andQ6idNotBetween(Integer value1, Integer value2) {
            addCriterion("q6id not between", value1, value2, "q6id");
            return (Criteria) this;
        }

        public Criteria andQ7idIsNull() {
            addCriterion("q7id is null");
            return (Criteria) this;
        }

        public Criteria andQ7idIsNotNull() {
            addCriterion("q7id is not null");
            return (Criteria) this;
        }

        public Criteria andQ7idEqualTo(Integer value) {
            addCriterion("q7id =", value, "q7id");
            return (Criteria) this;
        }

        public Criteria andQ7idNotEqualTo(Integer value) {
            addCriterion("q7id <>", value, "q7id");
            return (Criteria) this;
        }

        public Criteria andQ7idGreaterThan(Integer value) {
            addCriterion("q7id >", value, "q7id");
            return (Criteria) this;
        }

        public Criteria andQ7idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q7id >=", value, "q7id");
            return (Criteria) this;
        }

        public Criteria andQ7idLessThan(Integer value) {
            addCriterion("q7id <", value, "q7id");
            return (Criteria) this;
        }

        public Criteria andQ7idLessThanOrEqualTo(Integer value) {
            addCriterion("q7id <=", value, "q7id");
            return (Criteria) this;
        }

        public Criteria andQ7idIn(List<Integer> values) {
            addCriterion("q7id in", values, "q7id");
            return (Criteria) this;
        }

        public Criteria andQ7idNotIn(List<Integer> values) {
            addCriterion("q7id not in", values, "q7id");
            return (Criteria) this;
        }

        public Criteria andQ7idBetween(Integer value1, Integer value2) {
            addCriterion("q7id between", value1, value2, "q7id");
            return (Criteria) this;
        }

        public Criteria andQ7idNotBetween(Integer value1, Integer value2) {
            addCriterion("q7id not between", value1, value2, "q7id");
            return (Criteria) this;
        }

        public Criteria andQ8idIsNull() {
            addCriterion("q8id is null");
            return (Criteria) this;
        }

        public Criteria andQ8idIsNotNull() {
            addCriterion("q8id is not null");
            return (Criteria) this;
        }

        public Criteria andQ8idEqualTo(Integer value) {
            addCriterion("q8id =", value, "q8id");
            return (Criteria) this;
        }

        public Criteria andQ8idNotEqualTo(Integer value) {
            addCriterion("q8id <>", value, "q8id");
            return (Criteria) this;
        }

        public Criteria andQ8idGreaterThan(Integer value) {
            addCriterion("q8id >", value, "q8id");
            return (Criteria) this;
        }

        public Criteria andQ8idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q8id >=", value, "q8id");
            return (Criteria) this;
        }

        public Criteria andQ8idLessThan(Integer value) {
            addCriterion("q8id <", value, "q8id");
            return (Criteria) this;
        }

        public Criteria andQ8idLessThanOrEqualTo(Integer value) {
            addCriterion("q8id <=", value, "q8id");
            return (Criteria) this;
        }

        public Criteria andQ8idIn(List<Integer> values) {
            addCriterion("q8id in", values, "q8id");
            return (Criteria) this;
        }

        public Criteria andQ8idNotIn(List<Integer> values) {
            addCriterion("q8id not in", values, "q8id");
            return (Criteria) this;
        }

        public Criteria andQ8idBetween(Integer value1, Integer value2) {
            addCriterion("q8id between", value1, value2, "q8id");
            return (Criteria) this;
        }

        public Criteria andQ8idNotBetween(Integer value1, Integer value2) {
            addCriterion("q8id not between", value1, value2, "q8id");
            return (Criteria) this;
        }

        public Criteria andQ9idIsNull() {
            addCriterion("q9id is null");
            return (Criteria) this;
        }

        public Criteria andQ9idIsNotNull() {
            addCriterion("q9id is not null");
            return (Criteria) this;
        }

        public Criteria andQ9idEqualTo(Integer value) {
            addCriterion("q9id =", value, "q9id");
            return (Criteria) this;
        }

        public Criteria andQ9idNotEqualTo(Integer value) {
            addCriterion("q9id <>", value, "q9id");
            return (Criteria) this;
        }

        public Criteria andQ9idGreaterThan(Integer value) {
            addCriterion("q9id >", value, "q9id");
            return (Criteria) this;
        }

        public Criteria andQ9idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q9id >=", value, "q9id");
            return (Criteria) this;
        }

        public Criteria andQ9idLessThan(Integer value) {
            addCriterion("q9id <", value, "q9id");
            return (Criteria) this;
        }

        public Criteria andQ9idLessThanOrEqualTo(Integer value) {
            addCriterion("q9id <=", value, "q9id");
            return (Criteria) this;
        }

        public Criteria andQ9idIn(List<Integer> values) {
            addCriterion("q9id in", values, "q9id");
            return (Criteria) this;
        }

        public Criteria andQ9idNotIn(List<Integer> values) {
            addCriterion("q9id not in", values, "q9id");
            return (Criteria) this;
        }

        public Criteria andQ9idBetween(Integer value1, Integer value2) {
            addCriterion("q9id between", value1, value2, "q9id");
            return (Criteria) this;
        }

        public Criteria andQ9idNotBetween(Integer value1, Integer value2) {
            addCriterion("q9id not between", value1, value2, "q9id");
            return (Criteria) this;
        }

        public Criteria andQ10idIsNull() {
            addCriterion("q10id is null");
            return (Criteria) this;
        }

        public Criteria andQ10idIsNotNull() {
            addCriterion("q10id is not null");
            return (Criteria) this;
        }

        public Criteria andQ10idEqualTo(Integer value) {
            addCriterion("q10id =", value, "q10id");
            return (Criteria) this;
        }

        public Criteria andQ10idNotEqualTo(Integer value) {
            addCriterion("q10id <>", value, "q10id");
            return (Criteria) this;
        }

        public Criteria andQ10idGreaterThan(Integer value) {
            addCriterion("q10id >", value, "q10id");
            return (Criteria) this;
        }

        public Criteria andQ10idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q10id >=", value, "q10id");
            return (Criteria) this;
        }

        public Criteria andQ10idLessThan(Integer value) {
            addCriterion("q10id <", value, "q10id");
            return (Criteria) this;
        }

        public Criteria andQ10idLessThanOrEqualTo(Integer value) {
            addCriterion("q10id <=", value, "q10id");
            return (Criteria) this;
        }

        public Criteria andQ10idIn(List<Integer> values) {
            addCriterion("q10id in", values, "q10id");
            return (Criteria) this;
        }

        public Criteria andQ10idNotIn(List<Integer> values) {
            addCriterion("q10id not in", values, "q10id");
            return (Criteria) this;
        }

        public Criteria andQ10idBetween(Integer value1, Integer value2) {
            addCriterion("q10id between", value1, value2, "q10id");
            return (Criteria) this;
        }

        public Criteria andQ10idNotBetween(Integer value1, Integer value2) {
            addCriterion("q10id not between", value1, value2, "q10id");
            return (Criteria) this;
        }

        public Criteria andQ11idIsNull() {
            addCriterion("q11id is null");
            return (Criteria) this;
        }

        public Criteria andQ11idIsNotNull() {
            addCriterion("q11id is not null");
            return (Criteria) this;
        }

        public Criteria andQ11idEqualTo(Integer value) {
            addCriterion("q11id =", value, "q11id");
            return (Criteria) this;
        }

        public Criteria andQ11idNotEqualTo(Integer value) {
            addCriterion("q11id <>", value, "q11id");
            return (Criteria) this;
        }

        public Criteria andQ11idGreaterThan(Integer value) {
            addCriterion("q11id >", value, "q11id");
            return (Criteria) this;
        }

        public Criteria andQ11idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q11id >=", value, "q11id");
            return (Criteria) this;
        }

        public Criteria andQ11idLessThan(Integer value) {
            addCriterion("q11id <", value, "q11id");
            return (Criteria) this;
        }

        public Criteria andQ11idLessThanOrEqualTo(Integer value) {
            addCriterion("q11id <=", value, "q11id");
            return (Criteria) this;
        }

        public Criteria andQ11idIn(List<Integer> values) {
            addCriterion("q11id in", values, "q11id");
            return (Criteria) this;
        }

        public Criteria andQ11idNotIn(List<Integer> values) {
            addCriterion("q11id not in", values, "q11id");
            return (Criteria) this;
        }

        public Criteria andQ11idBetween(Integer value1, Integer value2) {
            addCriterion("q11id between", value1, value2, "q11id");
            return (Criteria) this;
        }

        public Criteria andQ11idNotBetween(Integer value1, Integer value2) {
            addCriterion("q11id not between", value1, value2, "q11id");
            return (Criteria) this;
        }

        public Criteria andQ12idIsNull() {
            addCriterion("q12id is null");
            return (Criteria) this;
        }

        public Criteria andQ12idIsNotNull() {
            addCriterion("q12id is not null");
            return (Criteria) this;
        }

        public Criteria andQ12idEqualTo(Integer value) {
            addCriterion("q12id =", value, "q12id");
            return (Criteria) this;
        }

        public Criteria andQ12idNotEqualTo(Integer value) {
            addCriterion("q12id <>", value, "q12id");
            return (Criteria) this;
        }

        public Criteria andQ12idGreaterThan(Integer value) {
            addCriterion("q12id >", value, "q12id");
            return (Criteria) this;
        }

        public Criteria andQ12idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q12id >=", value, "q12id");
            return (Criteria) this;
        }

        public Criteria andQ12idLessThan(Integer value) {
            addCriterion("q12id <", value, "q12id");
            return (Criteria) this;
        }

        public Criteria andQ12idLessThanOrEqualTo(Integer value) {
            addCriterion("q12id <=", value, "q12id");
            return (Criteria) this;
        }

        public Criteria andQ12idIn(List<Integer> values) {
            addCriterion("q12id in", values, "q12id");
            return (Criteria) this;
        }

        public Criteria andQ12idNotIn(List<Integer> values) {
            addCriterion("q12id not in", values, "q12id");
            return (Criteria) this;
        }

        public Criteria andQ12idBetween(Integer value1, Integer value2) {
            addCriterion("q12id between", value1, value2, "q12id");
            return (Criteria) this;
        }

        public Criteria andQ12idNotBetween(Integer value1, Integer value2) {
            addCriterion("q12id not between", value1, value2, "q12id");
            return (Criteria) this;
        }

        public Criteria andQ13idIsNull() {
            addCriterion("q13id is null");
            return (Criteria) this;
        }

        public Criteria andQ13idIsNotNull() {
            addCriterion("q13id is not null");
            return (Criteria) this;
        }

        public Criteria andQ13idEqualTo(Integer value) {
            addCriterion("q13id =", value, "q13id");
            return (Criteria) this;
        }

        public Criteria andQ13idNotEqualTo(Integer value) {
            addCriterion("q13id <>", value, "q13id");
            return (Criteria) this;
        }

        public Criteria andQ13idGreaterThan(Integer value) {
            addCriterion("q13id >", value, "q13id");
            return (Criteria) this;
        }

        public Criteria andQ13idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q13id >=", value, "q13id");
            return (Criteria) this;
        }

        public Criteria andQ13idLessThan(Integer value) {
            addCriterion("q13id <", value, "q13id");
            return (Criteria) this;
        }

        public Criteria andQ13idLessThanOrEqualTo(Integer value) {
            addCriterion("q13id <=", value, "q13id");
            return (Criteria) this;
        }

        public Criteria andQ13idIn(List<Integer> values) {
            addCriterion("q13id in", values, "q13id");
            return (Criteria) this;
        }

        public Criteria andQ13idNotIn(List<Integer> values) {
            addCriterion("q13id not in", values, "q13id");
            return (Criteria) this;
        }

        public Criteria andQ13idBetween(Integer value1, Integer value2) {
            addCriterion("q13id between", value1, value2, "q13id");
            return (Criteria) this;
        }

        public Criteria andQ13idNotBetween(Integer value1, Integer value2) {
            addCriterion("q13id not between", value1, value2, "q13id");
            return (Criteria) this;
        }

        public Criteria andQ14idIsNull() {
            addCriterion("q14id is null");
            return (Criteria) this;
        }

        public Criteria andQ14idIsNotNull() {
            addCriterion("q14id is not null");
            return (Criteria) this;
        }

        public Criteria andQ14idEqualTo(Integer value) {
            addCriterion("q14id =", value, "q14id");
            return (Criteria) this;
        }

        public Criteria andQ14idNotEqualTo(Integer value) {
            addCriterion("q14id <>", value, "q14id");
            return (Criteria) this;
        }

        public Criteria andQ14idGreaterThan(Integer value) {
            addCriterion("q14id >", value, "q14id");
            return (Criteria) this;
        }

        public Criteria andQ14idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q14id >=", value, "q14id");
            return (Criteria) this;
        }

        public Criteria andQ14idLessThan(Integer value) {
            addCriterion("q14id <", value, "q14id");
            return (Criteria) this;
        }

        public Criteria andQ14idLessThanOrEqualTo(Integer value) {
            addCriterion("q14id <=", value, "q14id");
            return (Criteria) this;
        }

        public Criteria andQ14idIn(List<Integer> values) {
            addCriterion("q14id in", values, "q14id");
            return (Criteria) this;
        }

        public Criteria andQ14idNotIn(List<Integer> values) {
            addCriterion("q14id not in", values, "q14id");
            return (Criteria) this;
        }

        public Criteria andQ14idBetween(Integer value1, Integer value2) {
            addCriterion("q14id between", value1, value2, "q14id");
            return (Criteria) this;
        }

        public Criteria andQ14idNotBetween(Integer value1, Integer value2) {
            addCriterion("q14id not between", value1, value2, "q14id");
            return (Criteria) this;
        }

        public Criteria andQ15idIsNull() {
            addCriterion("q15id is null");
            return (Criteria) this;
        }

        public Criteria andQ15idIsNotNull() {
            addCriterion("q15id is not null");
            return (Criteria) this;
        }

        public Criteria andQ15idEqualTo(Integer value) {
            addCriterion("q15id =", value, "q15id");
            return (Criteria) this;
        }

        public Criteria andQ15idNotEqualTo(Integer value) {
            addCriterion("q15id <>", value, "q15id");
            return (Criteria) this;
        }

        public Criteria andQ15idGreaterThan(Integer value) {
            addCriterion("q15id >", value, "q15id");
            return (Criteria) this;
        }

        public Criteria andQ15idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q15id >=", value, "q15id");
            return (Criteria) this;
        }

        public Criteria andQ15idLessThan(Integer value) {
            addCriterion("q15id <", value, "q15id");
            return (Criteria) this;
        }

        public Criteria andQ15idLessThanOrEqualTo(Integer value) {
            addCriterion("q15id <=", value, "q15id");
            return (Criteria) this;
        }

        public Criteria andQ15idIn(List<Integer> values) {
            addCriterion("q15id in", values, "q15id");
            return (Criteria) this;
        }

        public Criteria andQ15idNotIn(List<Integer> values) {
            addCriterion("q15id not in", values, "q15id");
            return (Criteria) this;
        }

        public Criteria andQ15idBetween(Integer value1, Integer value2) {
            addCriterion("q15id between", value1, value2, "q15id");
            return (Criteria) this;
        }

        public Criteria andQ15idNotBetween(Integer value1, Integer value2) {
            addCriterion("q15id not between", value1, value2, "q15id");
            return (Criteria) this;
        }

        public Criteria andQ16idIsNull() {
            addCriterion("q16id is null");
            return (Criteria) this;
        }

        public Criteria andQ16idIsNotNull() {
            addCriterion("q16id is not null");
            return (Criteria) this;
        }

        public Criteria andQ16idEqualTo(Integer value) {
            addCriterion("q16id =", value, "q16id");
            return (Criteria) this;
        }

        public Criteria andQ16idNotEqualTo(Integer value) {
            addCriterion("q16id <>", value, "q16id");
            return (Criteria) this;
        }

        public Criteria andQ16idGreaterThan(Integer value) {
            addCriterion("q16id >", value, "q16id");
            return (Criteria) this;
        }

        public Criteria andQ16idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q16id >=", value, "q16id");
            return (Criteria) this;
        }

        public Criteria andQ16idLessThan(Integer value) {
            addCriterion("q16id <", value, "q16id");
            return (Criteria) this;
        }

        public Criteria andQ16idLessThanOrEqualTo(Integer value) {
            addCriterion("q16id <=", value, "q16id");
            return (Criteria) this;
        }

        public Criteria andQ16idIn(List<Integer> values) {
            addCriterion("q16id in", values, "q16id");
            return (Criteria) this;
        }

        public Criteria andQ16idNotIn(List<Integer> values) {
            addCriterion("q16id not in", values, "q16id");
            return (Criteria) this;
        }

        public Criteria andQ16idBetween(Integer value1, Integer value2) {
            addCriterion("q16id between", value1, value2, "q16id");
            return (Criteria) this;
        }

        public Criteria andQ16idNotBetween(Integer value1, Integer value2) {
            addCriterion("q16id not between", value1, value2, "q16id");
            return (Criteria) this;
        }

        public Criteria andQ17idIsNull() {
            addCriterion("q17id is null");
            return (Criteria) this;
        }

        public Criteria andQ17idIsNotNull() {
            addCriterion("q17id is not null");
            return (Criteria) this;
        }

        public Criteria andQ17idEqualTo(Integer value) {
            addCriterion("q17id =", value, "q17id");
            return (Criteria) this;
        }

        public Criteria andQ17idNotEqualTo(Integer value) {
            addCriterion("q17id <>", value, "q17id");
            return (Criteria) this;
        }

        public Criteria andQ17idGreaterThan(Integer value) {
            addCriterion("q17id >", value, "q17id");
            return (Criteria) this;
        }

        public Criteria andQ17idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q17id >=", value, "q17id");
            return (Criteria) this;
        }

        public Criteria andQ17idLessThan(Integer value) {
            addCriterion("q17id <", value, "q17id");
            return (Criteria) this;
        }

        public Criteria andQ17idLessThanOrEqualTo(Integer value) {
            addCriterion("q17id <=", value, "q17id");
            return (Criteria) this;
        }

        public Criteria andQ17idIn(List<Integer> values) {
            addCriterion("q17id in", values, "q17id");
            return (Criteria) this;
        }

        public Criteria andQ17idNotIn(List<Integer> values) {
            addCriterion("q17id not in", values, "q17id");
            return (Criteria) this;
        }

        public Criteria andQ17idBetween(Integer value1, Integer value2) {
            addCriterion("q17id between", value1, value2, "q17id");
            return (Criteria) this;
        }

        public Criteria andQ17idNotBetween(Integer value1, Integer value2) {
            addCriterion("q17id not between", value1, value2, "q17id");
            return (Criteria) this;
        }

        public Criteria andQ18idIsNull() {
            addCriterion("q18id is null");
            return (Criteria) this;
        }

        public Criteria andQ18idIsNotNull() {
            addCriterion("q18id is not null");
            return (Criteria) this;
        }

        public Criteria andQ18idEqualTo(Integer value) {
            addCriterion("q18id =", value, "q18id");
            return (Criteria) this;
        }

        public Criteria andQ18idNotEqualTo(Integer value) {
            addCriterion("q18id <>", value, "q18id");
            return (Criteria) this;
        }

        public Criteria andQ18idGreaterThan(Integer value) {
            addCriterion("q18id >", value, "q18id");
            return (Criteria) this;
        }

        public Criteria andQ18idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q18id >=", value, "q18id");
            return (Criteria) this;
        }

        public Criteria andQ18idLessThan(Integer value) {
            addCriterion("q18id <", value, "q18id");
            return (Criteria) this;
        }

        public Criteria andQ18idLessThanOrEqualTo(Integer value) {
            addCriterion("q18id <=", value, "q18id");
            return (Criteria) this;
        }

        public Criteria andQ18idIn(List<Integer> values) {
            addCriterion("q18id in", values, "q18id");
            return (Criteria) this;
        }

        public Criteria andQ18idNotIn(List<Integer> values) {
            addCriterion("q18id not in", values, "q18id");
            return (Criteria) this;
        }

        public Criteria andQ18idBetween(Integer value1, Integer value2) {
            addCriterion("q18id between", value1, value2, "q18id");
            return (Criteria) this;
        }

        public Criteria andQ18idNotBetween(Integer value1, Integer value2) {
            addCriterion("q18id not between", value1, value2, "q18id");
            return (Criteria) this;
        }

        public Criteria andQ19idIsNull() {
            addCriterion("q19id is null");
            return (Criteria) this;
        }

        public Criteria andQ19idIsNotNull() {
            addCriterion("q19id is not null");
            return (Criteria) this;
        }

        public Criteria andQ19idEqualTo(Integer value) {
            addCriterion("q19id =", value, "q19id");
            return (Criteria) this;
        }

        public Criteria andQ19idNotEqualTo(Integer value) {
            addCriterion("q19id <>", value, "q19id");
            return (Criteria) this;
        }

        public Criteria andQ19idGreaterThan(Integer value) {
            addCriterion("q19id >", value, "q19id");
            return (Criteria) this;
        }

        public Criteria andQ19idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q19id >=", value, "q19id");
            return (Criteria) this;
        }

        public Criteria andQ19idLessThan(Integer value) {
            addCriterion("q19id <", value, "q19id");
            return (Criteria) this;
        }

        public Criteria andQ19idLessThanOrEqualTo(Integer value) {
            addCriterion("q19id <=", value, "q19id");
            return (Criteria) this;
        }

        public Criteria andQ19idIn(List<Integer> values) {
            addCriterion("q19id in", values, "q19id");
            return (Criteria) this;
        }

        public Criteria andQ19idNotIn(List<Integer> values) {
            addCriterion("q19id not in", values, "q19id");
            return (Criteria) this;
        }

        public Criteria andQ19idBetween(Integer value1, Integer value2) {
            addCriterion("q19id between", value1, value2, "q19id");
            return (Criteria) this;
        }

        public Criteria andQ19idNotBetween(Integer value1, Integer value2) {
            addCriterion("q19id not between", value1, value2, "q19id");
            return (Criteria) this;
        }

        public Criteria andQ20idIsNull() {
            addCriterion("q20id is null");
            return (Criteria) this;
        }

        public Criteria andQ20idIsNotNull() {
            addCriterion("q20id is not null");
            return (Criteria) this;
        }

        public Criteria andQ20idEqualTo(Integer value) {
            addCriterion("q20id =", value, "q20id");
            return (Criteria) this;
        }

        public Criteria andQ20idNotEqualTo(Integer value) {
            addCriterion("q20id <>", value, "q20id");
            return (Criteria) this;
        }

        public Criteria andQ20idGreaterThan(Integer value) {
            addCriterion("q20id >", value, "q20id");
            return (Criteria) this;
        }

        public Criteria andQ20idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q20id >=", value, "q20id");
            return (Criteria) this;
        }

        public Criteria andQ20idLessThan(Integer value) {
            addCriterion("q20id <", value, "q20id");
            return (Criteria) this;
        }

        public Criteria andQ20idLessThanOrEqualTo(Integer value) {
            addCriterion("q20id <=", value, "q20id");
            return (Criteria) this;
        }

        public Criteria andQ20idIn(List<Integer> values) {
            addCriterion("q20id in", values, "q20id");
            return (Criteria) this;
        }

        public Criteria andQ20idNotIn(List<Integer> values) {
            addCriterion("q20id not in", values, "q20id");
            return (Criteria) this;
        }

        public Criteria andQ20idBetween(Integer value1, Integer value2) {
            addCriterion("q20id between", value1, value2, "q20id");
            return (Criteria) this;
        }

        public Criteria andQ20idNotBetween(Integer value1, Integer value2) {
            addCriterion("q20id not between", value1, value2, "q20id");
            return (Criteria) this;
        }

        public Criteria andQ21idIsNull() {
            addCriterion("q21id is null");
            return (Criteria) this;
        }

        public Criteria andQ21idIsNotNull() {
            addCriterion("q21id is not null");
            return (Criteria) this;
        }

        public Criteria andQ21idEqualTo(Integer value) {
            addCriterion("q21id =", value, "q21id");
            return (Criteria) this;
        }

        public Criteria andQ21idNotEqualTo(Integer value) {
            addCriterion("q21id <>", value, "q21id");
            return (Criteria) this;
        }

        public Criteria andQ21idGreaterThan(Integer value) {
            addCriterion("q21id >", value, "q21id");
            return (Criteria) this;
        }

        public Criteria andQ21idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q21id >=", value, "q21id");
            return (Criteria) this;
        }

        public Criteria andQ21idLessThan(Integer value) {
            addCriterion("q21id <", value, "q21id");
            return (Criteria) this;
        }

        public Criteria andQ21idLessThanOrEqualTo(Integer value) {
            addCriterion("q21id <=", value, "q21id");
            return (Criteria) this;
        }

        public Criteria andQ21idIn(List<Integer> values) {
            addCriterion("q21id in", values, "q21id");
            return (Criteria) this;
        }

        public Criteria andQ21idNotIn(List<Integer> values) {
            addCriterion("q21id not in", values, "q21id");
            return (Criteria) this;
        }

        public Criteria andQ21idBetween(Integer value1, Integer value2) {
            addCriterion("q21id between", value1, value2, "q21id");
            return (Criteria) this;
        }

        public Criteria andQ21idNotBetween(Integer value1, Integer value2) {
            addCriterion("q21id not between", value1, value2, "q21id");
            return (Criteria) this;
        }

        public Criteria andQ22idIsNull() {
            addCriterion("q22id is null");
            return (Criteria) this;
        }

        public Criteria andQ22idIsNotNull() {
            addCriterion("q22id is not null");
            return (Criteria) this;
        }

        public Criteria andQ22idEqualTo(Integer value) {
            addCriterion("q22id =", value, "q22id");
            return (Criteria) this;
        }

        public Criteria andQ22idNotEqualTo(Integer value) {
            addCriterion("q22id <>", value, "q22id");
            return (Criteria) this;
        }

        public Criteria andQ22idGreaterThan(Integer value) {
            addCriterion("q22id >", value, "q22id");
            return (Criteria) this;
        }

        public Criteria andQ22idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q22id >=", value, "q22id");
            return (Criteria) this;
        }

        public Criteria andQ22idLessThan(Integer value) {
            addCriterion("q22id <", value, "q22id");
            return (Criteria) this;
        }

        public Criteria andQ22idLessThanOrEqualTo(Integer value) {
            addCriterion("q22id <=", value, "q22id");
            return (Criteria) this;
        }

        public Criteria andQ22idIn(List<Integer> values) {
            addCriterion("q22id in", values, "q22id");
            return (Criteria) this;
        }

        public Criteria andQ22idNotIn(List<Integer> values) {
            addCriterion("q22id not in", values, "q22id");
            return (Criteria) this;
        }

        public Criteria andQ22idBetween(Integer value1, Integer value2) {
            addCriterion("q22id between", value1, value2, "q22id");
            return (Criteria) this;
        }

        public Criteria andQ22idNotBetween(Integer value1, Integer value2) {
            addCriterion("q22id not between", value1, value2, "q22id");
            return (Criteria) this;
        }

        public Criteria andQ23idIsNull() {
            addCriterion("q23id is null");
            return (Criteria) this;
        }

        public Criteria andQ23idIsNotNull() {
            addCriterion("q23id is not null");
            return (Criteria) this;
        }

        public Criteria andQ23idEqualTo(Integer value) {
            addCriterion("q23id =", value, "q23id");
            return (Criteria) this;
        }

        public Criteria andQ23idNotEqualTo(Integer value) {
            addCriterion("q23id <>", value, "q23id");
            return (Criteria) this;
        }

        public Criteria andQ23idGreaterThan(Integer value) {
            addCriterion("q23id >", value, "q23id");
            return (Criteria) this;
        }

        public Criteria andQ23idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q23id >=", value, "q23id");
            return (Criteria) this;
        }

        public Criteria andQ23idLessThan(Integer value) {
            addCriterion("q23id <", value, "q23id");
            return (Criteria) this;
        }

        public Criteria andQ23idLessThanOrEqualTo(Integer value) {
            addCriterion("q23id <=", value, "q23id");
            return (Criteria) this;
        }

        public Criteria andQ23idIn(List<Integer> values) {
            addCriterion("q23id in", values, "q23id");
            return (Criteria) this;
        }

        public Criteria andQ23idNotIn(List<Integer> values) {
            addCriterion("q23id not in", values, "q23id");
            return (Criteria) this;
        }

        public Criteria andQ23idBetween(Integer value1, Integer value2) {
            addCriterion("q23id between", value1, value2, "q23id");
            return (Criteria) this;
        }

        public Criteria andQ23idNotBetween(Integer value1, Integer value2) {
            addCriterion("q23id not between", value1, value2, "q23id");
            return (Criteria) this;
        }

        public Criteria andQ24idIsNull() {
            addCriterion("q24id is null");
            return (Criteria) this;
        }

        public Criteria andQ24idIsNotNull() {
            addCriterion("q24id is not null");
            return (Criteria) this;
        }

        public Criteria andQ24idEqualTo(Integer value) {
            addCriterion("q24id =", value, "q24id");
            return (Criteria) this;
        }

        public Criteria andQ24idNotEqualTo(Integer value) {
            addCriterion("q24id <>", value, "q24id");
            return (Criteria) this;
        }

        public Criteria andQ24idGreaterThan(Integer value) {
            addCriterion("q24id >", value, "q24id");
            return (Criteria) this;
        }

        public Criteria andQ24idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q24id >=", value, "q24id");
            return (Criteria) this;
        }

        public Criteria andQ24idLessThan(Integer value) {
            addCriterion("q24id <", value, "q24id");
            return (Criteria) this;
        }

        public Criteria andQ24idLessThanOrEqualTo(Integer value) {
            addCriterion("q24id <=", value, "q24id");
            return (Criteria) this;
        }

        public Criteria andQ24idIn(List<Integer> values) {
            addCriterion("q24id in", values, "q24id");
            return (Criteria) this;
        }

        public Criteria andQ24idNotIn(List<Integer> values) {
            addCriterion("q24id not in", values, "q24id");
            return (Criteria) this;
        }

        public Criteria andQ24idBetween(Integer value1, Integer value2) {
            addCriterion("q24id between", value1, value2, "q24id");
            return (Criteria) this;
        }

        public Criteria andQ24idNotBetween(Integer value1, Integer value2) {
            addCriterion("q24id not between", value1, value2, "q24id");
            return (Criteria) this;
        }

        public Criteria andQ25idIsNull() {
            addCriterion("q25id is null");
            return (Criteria) this;
        }

        public Criteria andQ25idIsNotNull() {
            addCriterion("q25id is not null");
            return (Criteria) this;
        }

        public Criteria andQ25idEqualTo(Integer value) {
            addCriterion("q25id =", value, "q25id");
            return (Criteria) this;
        }

        public Criteria andQ25idNotEqualTo(Integer value) {
            addCriterion("q25id <>", value, "q25id");
            return (Criteria) this;
        }

        public Criteria andQ25idGreaterThan(Integer value) {
            addCriterion("q25id >", value, "q25id");
            return (Criteria) this;
        }

        public Criteria andQ25idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q25id >=", value, "q25id");
            return (Criteria) this;
        }

        public Criteria andQ25idLessThan(Integer value) {
            addCriterion("q25id <", value, "q25id");
            return (Criteria) this;
        }

        public Criteria andQ25idLessThanOrEqualTo(Integer value) {
            addCriterion("q25id <=", value, "q25id");
            return (Criteria) this;
        }

        public Criteria andQ25idIn(List<Integer> values) {
            addCriterion("q25id in", values, "q25id");
            return (Criteria) this;
        }

        public Criteria andQ25idNotIn(List<Integer> values) {
            addCriterion("q25id not in", values, "q25id");
            return (Criteria) this;
        }

        public Criteria andQ25idBetween(Integer value1, Integer value2) {
            addCriterion("q25id between", value1, value2, "q25id");
            return (Criteria) this;
        }

        public Criteria andQ25idNotBetween(Integer value1, Integer value2) {
            addCriterion("q25id not between", value1, value2, "q25id");
            return (Criteria) this;
        }

        public Criteria andQ26idIsNull() {
            addCriterion("q26id is null");
            return (Criteria) this;
        }

        public Criteria andQ26idIsNotNull() {
            addCriterion("q26id is not null");
            return (Criteria) this;
        }

        public Criteria andQ26idEqualTo(Integer value) {
            addCriterion("q26id =", value, "q26id");
            return (Criteria) this;
        }

        public Criteria andQ26idNotEqualTo(Integer value) {
            addCriterion("q26id <>", value, "q26id");
            return (Criteria) this;
        }

        public Criteria andQ26idGreaterThan(Integer value) {
            addCriterion("q26id >", value, "q26id");
            return (Criteria) this;
        }

        public Criteria andQ26idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q26id >=", value, "q26id");
            return (Criteria) this;
        }

        public Criteria andQ26idLessThan(Integer value) {
            addCriterion("q26id <", value, "q26id");
            return (Criteria) this;
        }

        public Criteria andQ26idLessThanOrEqualTo(Integer value) {
            addCriterion("q26id <=", value, "q26id");
            return (Criteria) this;
        }

        public Criteria andQ26idIn(List<Integer> values) {
            addCriterion("q26id in", values, "q26id");
            return (Criteria) this;
        }

        public Criteria andQ26idNotIn(List<Integer> values) {
            addCriterion("q26id not in", values, "q26id");
            return (Criteria) this;
        }

        public Criteria andQ26idBetween(Integer value1, Integer value2) {
            addCriterion("q26id between", value1, value2, "q26id");
            return (Criteria) this;
        }

        public Criteria andQ26idNotBetween(Integer value1, Integer value2) {
            addCriterion("q26id not between", value1, value2, "q26id");
            return (Criteria) this;
        }

        public Criteria andQ27idIsNull() {
            addCriterion("q27id is null");
            return (Criteria) this;
        }

        public Criteria andQ27idIsNotNull() {
            addCriterion("q27id is not null");
            return (Criteria) this;
        }

        public Criteria andQ27idEqualTo(Integer value) {
            addCriterion("q27id =", value, "q27id");
            return (Criteria) this;
        }

        public Criteria andQ27idNotEqualTo(Integer value) {
            addCriterion("q27id <>", value, "q27id");
            return (Criteria) this;
        }

        public Criteria andQ27idGreaterThan(Integer value) {
            addCriterion("q27id >", value, "q27id");
            return (Criteria) this;
        }

        public Criteria andQ27idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q27id >=", value, "q27id");
            return (Criteria) this;
        }

        public Criteria andQ27idLessThan(Integer value) {
            addCriterion("q27id <", value, "q27id");
            return (Criteria) this;
        }

        public Criteria andQ27idLessThanOrEqualTo(Integer value) {
            addCriterion("q27id <=", value, "q27id");
            return (Criteria) this;
        }

        public Criteria andQ27idIn(List<Integer> values) {
            addCriterion("q27id in", values, "q27id");
            return (Criteria) this;
        }

        public Criteria andQ27idNotIn(List<Integer> values) {
            addCriterion("q27id not in", values, "q27id");
            return (Criteria) this;
        }

        public Criteria andQ27idBetween(Integer value1, Integer value2) {
            addCriterion("q27id between", value1, value2, "q27id");
            return (Criteria) this;
        }

        public Criteria andQ27idNotBetween(Integer value1, Integer value2) {
            addCriterion("q27id not between", value1, value2, "q27id");
            return (Criteria) this;
        }

        public Criteria andQ28idIsNull() {
            addCriterion("q28id is null");
            return (Criteria) this;
        }

        public Criteria andQ28idIsNotNull() {
            addCriterion("q28id is not null");
            return (Criteria) this;
        }

        public Criteria andQ28idEqualTo(Integer value) {
            addCriterion("q28id =", value, "q28id");
            return (Criteria) this;
        }

        public Criteria andQ28idNotEqualTo(Integer value) {
            addCriterion("q28id <>", value, "q28id");
            return (Criteria) this;
        }

        public Criteria andQ28idGreaterThan(Integer value) {
            addCriterion("q28id >", value, "q28id");
            return (Criteria) this;
        }

        public Criteria andQ28idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q28id >=", value, "q28id");
            return (Criteria) this;
        }

        public Criteria andQ28idLessThan(Integer value) {
            addCriterion("q28id <", value, "q28id");
            return (Criteria) this;
        }

        public Criteria andQ28idLessThanOrEqualTo(Integer value) {
            addCriterion("q28id <=", value, "q28id");
            return (Criteria) this;
        }

        public Criteria andQ28idIn(List<Integer> values) {
            addCriterion("q28id in", values, "q28id");
            return (Criteria) this;
        }

        public Criteria andQ28idNotIn(List<Integer> values) {
            addCriterion("q28id not in", values, "q28id");
            return (Criteria) this;
        }

        public Criteria andQ28idBetween(Integer value1, Integer value2) {
            addCriterion("q28id between", value1, value2, "q28id");
            return (Criteria) this;
        }

        public Criteria andQ28idNotBetween(Integer value1, Integer value2) {
            addCriterion("q28id not between", value1, value2, "q28id");
            return (Criteria) this;
        }

        public Criteria andQ29idIsNull() {
            addCriterion("q29id is null");
            return (Criteria) this;
        }

        public Criteria andQ29idIsNotNull() {
            addCriterion("q29id is not null");
            return (Criteria) this;
        }

        public Criteria andQ29idEqualTo(Integer value) {
            addCriterion("q29id =", value, "q29id");
            return (Criteria) this;
        }

        public Criteria andQ29idNotEqualTo(Integer value) {
            addCriterion("q29id <>", value, "q29id");
            return (Criteria) this;
        }

        public Criteria andQ29idGreaterThan(Integer value) {
            addCriterion("q29id >", value, "q29id");
            return (Criteria) this;
        }

        public Criteria andQ29idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q29id >=", value, "q29id");
            return (Criteria) this;
        }

        public Criteria andQ29idLessThan(Integer value) {
            addCriterion("q29id <", value, "q29id");
            return (Criteria) this;
        }

        public Criteria andQ29idLessThanOrEqualTo(Integer value) {
            addCriterion("q29id <=", value, "q29id");
            return (Criteria) this;
        }

        public Criteria andQ29idIn(List<Integer> values) {
            addCriterion("q29id in", values, "q29id");
            return (Criteria) this;
        }

        public Criteria andQ29idNotIn(List<Integer> values) {
            addCriterion("q29id not in", values, "q29id");
            return (Criteria) this;
        }

        public Criteria andQ29idBetween(Integer value1, Integer value2) {
            addCriterion("q29id between", value1, value2, "q29id");
            return (Criteria) this;
        }

        public Criteria andQ29idNotBetween(Integer value1, Integer value2) {
            addCriterion("q29id not between", value1, value2, "q29id");
            return (Criteria) this;
        }

        public Criteria andQ30idIsNull() {
            addCriterion("q30id is null");
            return (Criteria) this;
        }

        public Criteria andQ30idIsNotNull() {
            addCriterion("q30id is not null");
            return (Criteria) this;
        }

        public Criteria andQ30idEqualTo(Integer value) {
            addCriterion("q30id =", value, "q30id");
            return (Criteria) this;
        }

        public Criteria andQ30idNotEqualTo(Integer value) {
            addCriterion("q30id <>", value, "q30id");
            return (Criteria) this;
        }

        public Criteria andQ30idGreaterThan(Integer value) {
            addCriterion("q30id >", value, "q30id");
            return (Criteria) this;
        }

        public Criteria andQ30idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q30id >=", value, "q30id");
            return (Criteria) this;
        }

        public Criteria andQ30idLessThan(Integer value) {
            addCriterion("q30id <", value, "q30id");
            return (Criteria) this;
        }

        public Criteria andQ30idLessThanOrEqualTo(Integer value) {
            addCriterion("q30id <=", value, "q30id");
            return (Criteria) this;
        }

        public Criteria andQ30idIn(List<Integer> values) {
            addCriterion("q30id in", values, "q30id");
            return (Criteria) this;
        }

        public Criteria andQ30idNotIn(List<Integer> values) {
            addCriterion("q30id not in", values, "q30id");
            return (Criteria) this;
        }

        public Criteria andQ30idBetween(Integer value1, Integer value2) {
            addCriterion("q30id between", value1, value2, "q30id");
            return (Criteria) this;
        }

        public Criteria andQ30idNotBetween(Integer value1, Integer value2) {
            addCriterion("q30id not between", value1, value2, "q30id");
            return (Criteria) this;
        }

        public Criteria andQ31idIsNull() {
            addCriterion("q31id is null");
            return (Criteria) this;
        }

        public Criteria andQ31idIsNotNull() {
            addCriterion("q31id is not null");
            return (Criteria) this;
        }

        public Criteria andQ31idEqualTo(Integer value) {
            addCriterion("q31id =", value, "q31id");
            return (Criteria) this;
        }

        public Criteria andQ31idNotEqualTo(Integer value) {
            addCriterion("q31id <>", value, "q31id");
            return (Criteria) this;
        }

        public Criteria andQ31idGreaterThan(Integer value) {
            addCriterion("q31id >", value, "q31id");
            return (Criteria) this;
        }

        public Criteria andQ31idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q31id >=", value, "q31id");
            return (Criteria) this;
        }

        public Criteria andQ31idLessThan(Integer value) {
            addCriterion("q31id <", value, "q31id");
            return (Criteria) this;
        }

        public Criteria andQ31idLessThanOrEqualTo(Integer value) {
            addCriterion("q31id <=", value, "q31id");
            return (Criteria) this;
        }

        public Criteria andQ31idIn(List<Integer> values) {
            addCriterion("q31id in", values, "q31id");
            return (Criteria) this;
        }

        public Criteria andQ31idNotIn(List<Integer> values) {
            addCriterion("q31id not in", values, "q31id");
            return (Criteria) this;
        }

        public Criteria andQ31idBetween(Integer value1, Integer value2) {
            addCriterion("q31id between", value1, value2, "q31id");
            return (Criteria) this;
        }

        public Criteria andQ31idNotBetween(Integer value1, Integer value2) {
            addCriterion("q31id not between", value1, value2, "q31id");
            return (Criteria) this;
        }

        public Criteria andQ32idIsNull() {
            addCriterion("q32id is null");
            return (Criteria) this;
        }

        public Criteria andQ32idIsNotNull() {
            addCriterion("q32id is not null");
            return (Criteria) this;
        }

        public Criteria andQ32idEqualTo(Integer value) {
            addCriterion("q32id =", value, "q32id");
            return (Criteria) this;
        }

        public Criteria andQ32idNotEqualTo(Integer value) {
            addCriterion("q32id <>", value, "q32id");
            return (Criteria) this;
        }

        public Criteria andQ32idGreaterThan(Integer value) {
            addCriterion("q32id >", value, "q32id");
            return (Criteria) this;
        }

        public Criteria andQ32idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q32id >=", value, "q32id");
            return (Criteria) this;
        }

        public Criteria andQ32idLessThan(Integer value) {
            addCriterion("q32id <", value, "q32id");
            return (Criteria) this;
        }

        public Criteria andQ32idLessThanOrEqualTo(Integer value) {
            addCriterion("q32id <=", value, "q32id");
            return (Criteria) this;
        }

        public Criteria andQ32idIn(List<Integer> values) {
            addCriterion("q32id in", values, "q32id");
            return (Criteria) this;
        }

        public Criteria andQ32idNotIn(List<Integer> values) {
            addCriterion("q32id not in", values, "q32id");
            return (Criteria) this;
        }

        public Criteria andQ32idBetween(Integer value1, Integer value2) {
            addCriterion("q32id between", value1, value2, "q32id");
            return (Criteria) this;
        }

        public Criteria andQ32idNotBetween(Integer value1, Integer value2) {
            addCriterion("q32id not between", value1, value2, "q32id");
            return (Criteria) this;
        }

        public Criteria andQ33idIsNull() {
            addCriterion("q33id is null");
            return (Criteria) this;
        }

        public Criteria andQ33idIsNotNull() {
            addCriterion("q33id is not null");
            return (Criteria) this;
        }

        public Criteria andQ33idEqualTo(Integer value) {
            addCriterion("q33id =", value, "q33id");
            return (Criteria) this;
        }

        public Criteria andQ33idNotEqualTo(Integer value) {
            addCriterion("q33id <>", value, "q33id");
            return (Criteria) this;
        }

        public Criteria andQ33idGreaterThan(Integer value) {
            addCriterion("q33id >", value, "q33id");
            return (Criteria) this;
        }

        public Criteria andQ33idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q33id >=", value, "q33id");
            return (Criteria) this;
        }

        public Criteria andQ33idLessThan(Integer value) {
            addCriterion("q33id <", value, "q33id");
            return (Criteria) this;
        }

        public Criteria andQ33idLessThanOrEqualTo(Integer value) {
            addCriterion("q33id <=", value, "q33id");
            return (Criteria) this;
        }

        public Criteria andQ33idIn(List<Integer> values) {
            addCriterion("q33id in", values, "q33id");
            return (Criteria) this;
        }

        public Criteria andQ33idNotIn(List<Integer> values) {
            addCriterion("q33id not in", values, "q33id");
            return (Criteria) this;
        }

        public Criteria andQ33idBetween(Integer value1, Integer value2) {
            addCriterion("q33id between", value1, value2, "q33id");
            return (Criteria) this;
        }

        public Criteria andQ33idNotBetween(Integer value1, Integer value2) {
            addCriterion("q33id not between", value1, value2, "q33id");
            return (Criteria) this;
        }

        public Criteria andQ34idIsNull() {
            addCriterion("q34id is null");
            return (Criteria) this;
        }

        public Criteria andQ34idIsNotNull() {
            addCriterion("q34id is not null");
            return (Criteria) this;
        }

        public Criteria andQ34idEqualTo(Integer value) {
            addCriterion("q34id =", value, "q34id");
            return (Criteria) this;
        }

        public Criteria andQ34idNotEqualTo(Integer value) {
            addCriterion("q34id <>", value, "q34id");
            return (Criteria) this;
        }

        public Criteria andQ34idGreaterThan(Integer value) {
            addCriterion("q34id >", value, "q34id");
            return (Criteria) this;
        }

        public Criteria andQ34idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q34id >=", value, "q34id");
            return (Criteria) this;
        }

        public Criteria andQ34idLessThan(Integer value) {
            addCriterion("q34id <", value, "q34id");
            return (Criteria) this;
        }

        public Criteria andQ34idLessThanOrEqualTo(Integer value) {
            addCriterion("q34id <=", value, "q34id");
            return (Criteria) this;
        }

        public Criteria andQ34idIn(List<Integer> values) {
            addCriterion("q34id in", values, "q34id");
            return (Criteria) this;
        }

        public Criteria andQ34idNotIn(List<Integer> values) {
            addCriterion("q34id not in", values, "q34id");
            return (Criteria) this;
        }

        public Criteria andQ34idBetween(Integer value1, Integer value2) {
            addCriterion("q34id between", value1, value2, "q34id");
            return (Criteria) this;
        }

        public Criteria andQ34idNotBetween(Integer value1, Integer value2) {
            addCriterion("q34id not between", value1, value2, "q34id");
            return (Criteria) this;
        }

        public Criteria andQ35idIsNull() {
            addCriterion("q35id is null");
            return (Criteria) this;
        }

        public Criteria andQ35idIsNotNull() {
            addCriterion("q35id is not null");
            return (Criteria) this;
        }

        public Criteria andQ35idEqualTo(Integer value) {
            addCriterion("q35id =", value, "q35id");
            return (Criteria) this;
        }

        public Criteria andQ35idNotEqualTo(Integer value) {
            addCriterion("q35id <>", value, "q35id");
            return (Criteria) this;
        }

        public Criteria andQ35idGreaterThan(Integer value) {
            addCriterion("q35id >", value, "q35id");
            return (Criteria) this;
        }

        public Criteria andQ35idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q35id >=", value, "q35id");
            return (Criteria) this;
        }

        public Criteria andQ35idLessThan(Integer value) {
            addCriterion("q35id <", value, "q35id");
            return (Criteria) this;
        }

        public Criteria andQ35idLessThanOrEqualTo(Integer value) {
            addCriterion("q35id <=", value, "q35id");
            return (Criteria) this;
        }

        public Criteria andQ35idIn(List<Integer> values) {
            addCriterion("q35id in", values, "q35id");
            return (Criteria) this;
        }

        public Criteria andQ35idNotIn(List<Integer> values) {
            addCriterion("q35id not in", values, "q35id");
            return (Criteria) this;
        }

        public Criteria andQ35idBetween(Integer value1, Integer value2) {
            addCriterion("q35id between", value1, value2, "q35id");
            return (Criteria) this;
        }

        public Criteria andQ35idNotBetween(Integer value1, Integer value2) {
            addCriterion("q35id not between", value1, value2, "q35id");
            return (Criteria) this;
        }

        public Criteria andQ36idIsNull() {
            addCriterion("q36id is null");
            return (Criteria) this;
        }

        public Criteria andQ36idIsNotNull() {
            addCriterion("q36id is not null");
            return (Criteria) this;
        }

        public Criteria andQ36idEqualTo(Integer value) {
            addCriterion("q36id =", value, "q36id");
            return (Criteria) this;
        }

        public Criteria andQ36idNotEqualTo(Integer value) {
            addCriterion("q36id <>", value, "q36id");
            return (Criteria) this;
        }

        public Criteria andQ36idGreaterThan(Integer value) {
            addCriterion("q36id >", value, "q36id");
            return (Criteria) this;
        }

        public Criteria andQ36idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q36id >=", value, "q36id");
            return (Criteria) this;
        }

        public Criteria andQ36idLessThan(Integer value) {
            addCriterion("q36id <", value, "q36id");
            return (Criteria) this;
        }

        public Criteria andQ36idLessThanOrEqualTo(Integer value) {
            addCriterion("q36id <=", value, "q36id");
            return (Criteria) this;
        }

        public Criteria andQ36idIn(List<Integer> values) {
            addCriterion("q36id in", values, "q36id");
            return (Criteria) this;
        }

        public Criteria andQ36idNotIn(List<Integer> values) {
            addCriterion("q36id not in", values, "q36id");
            return (Criteria) this;
        }

        public Criteria andQ36idBetween(Integer value1, Integer value2) {
            addCriterion("q36id between", value1, value2, "q36id");
            return (Criteria) this;
        }

        public Criteria andQ36idNotBetween(Integer value1, Integer value2) {
            addCriterion("q36id not between", value1, value2, "q36id");
            return (Criteria) this;
        }

        public Criteria andQ37idIsNull() {
            addCriterion("q37id is null");
            return (Criteria) this;
        }

        public Criteria andQ37idIsNotNull() {
            addCriterion("q37id is not null");
            return (Criteria) this;
        }

        public Criteria andQ37idEqualTo(Integer value) {
            addCriterion("q37id =", value, "q37id");
            return (Criteria) this;
        }

        public Criteria andQ37idNotEqualTo(Integer value) {
            addCriterion("q37id <>", value, "q37id");
            return (Criteria) this;
        }

        public Criteria andQ37idGreaterThan(Integer value) {
            addCriterion("q37id >", value, "q37id");
            return (Criteria) this;
        }

        public Criteria andQ37idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q37id >=", value, "q37id");
            return (Criteria) this;
        }

        public Criteria andQ37idLessThan(Integer value) {
            addCriterion("q37id <", value, "q37id");
            return (Criteria) this;
        }

        public Criteria andQ37idLessThanOrEqualTo(Integer value) {
            addCriterion("q37id <=", value, "q37id");
            return (Criteria) this;
        }

        public Criteria andQ37idIn(List<Integer> values) {
            addCriterion("q37id in", values, "q37id");
            return (Criteria) this;
        }

        public Criteria andQ37idNotIn(List<Integer> values) {
            addCriterion("q37id not in", values, "q37id");
            return (Criteria) this;
        }

        public Criteria andQ37idBetween(Integer value1, Integer value2) {
            addCriterion("q37id between", value1, value2, "q37id");
            return (Criteria) this;
        }

        public Criteria andQ37idNotBetween(Integer value1, Integer value2) {
            addCriterion("q37id not between", value1, value2, "q37id");
            return (Criteria) this;
        }

        public Criteria andQ38idIsNull() {
            addCriterion("q38id is null");
            return (Criteria) this;
        }

        public Criteria andQ38idIsNotNull() {
            addCriterion("q38id is not null");
            return (Criteria) this;
        }

        public Criteria andQ38idEqualTo(Integer value) {
            addCriterion("q38id =", value, "q38id");
            return (Criteria) this;
        }

        public Criteria andQ38idNotEqualTo(Integer value) {
            addCriterion("q38id <>", value, "q38id");
            return (Criteria) this;
        }

        public Criteria andQ38idGreaterThan(Integer value) {
            addCriterion("q38id >", value, "q38id");
            return (Criteria) this;
        }

        public Criteria andQ38idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q38id >=", value, "q38id");
            return (Criteria) this;
        }

        public Criteria andQ38idLessThan(Integer value) {
            addCriterion("q38id <", value, "q38id");
            return (Criteria) this;
        }

        public Criteria andQ38idLessThanOrEqualTo(Integer value) {
            addCriterion("q38id <=", value, "q38id");
            return (Criteria) this;
        }

        public Criteria andQ38idIn(List<Integer> values) {
            addCriterion("q38id in", values, "q38id");
            return (Criteria) this;
        }

        public Criteria andQ38idNotIn(List<Integer> values) {
            addCriterion("q38id not in", values, "q38id");
            return (Criteria) this;
        }

        public Criteria andQ38idBetween(Integer value1, Integer value2) {
            addCriterion("q38id between", value1, value2, "q38id");
            return (Criteria) this;
        }

        public Criteria andQ38idNotBetween(Integer value1, Integer value2) {
            addCriterion("q38id not between", value1, value2, "q38id");
            return (Criteria) this;
        }

        public Criteria andQ39idIsNull() {
            addCriterion("q39id is null");
            return (Criteria) this;
        }

        public Criteria andQ39idIsNotNull() {
            addCriterion("q39id is not null");
            return (Criteria) this;
        }

        public Criteria andQ39idEqualTo(Integer value) {
            addCriterion("q39id =", value, "q39id");
            return (Criteria) this;
        }

        public Criteria andQ39idNotEqualTo(Integer value) {
            addCriterion("q39id <>", value, "q39id");
            return (Criteria) this;
        }

        public Criteria andQ39idGreaterThan(Integer value) {
            addCriterion("q39id >", value, "q39id");
            return (Criteria) this;
        }

        public Criteria andQ39idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q39id >=", value, "q39id");
            return (Criteria) this;
        }

        public Criteria andQ39idLessThan(Integer value) {
            addCriterion("q39id <", value, "q39id");
            return (Criteria) this;
        }

        public Criteria andQ39idLessThanOrEqualTo(Integer value) {
            addCriterion("q39id <=", value, "q39id");
            return (Criteria) this;
        }

        public Criteria andQ39idIn(List<Integer> values) {
            addCriterion("q39id in", values, "q39id");
            return (Criteria) this;
        }

        public Criteria andQ39idNotIn(List<Integer> values) {
            addCriterion("q39id not in", values, "q39id");
            return (Criteria) this;
        }

        public Criteria andQ39idBetween(Integer value1, Integer value2) {
            addCriterion("q39id between", value1, value2, "q39id");
            return (Criteria) this;
        }

        public Criteria andQ39idNotBetween(Integer value1, Integer value2) {
            addCriterion("q39id not between", value1, value2, "q39id");
            return (Criteria) this;
        }

        public Criteria andQ40idIsNull() {
            addCriterion("q40id is null");
            return (Criteria) this;
        }

        public Criteria andQ40idIsNotNull() {
            addCriterion("q40id is not null");
            return (Criteria) this;
        }

        public Criteria andQ40idEqualTo(Integer value) {
            addCriterion("q40id =", value, "q40id");
            return (Criteria) this;
        }

        public Criteria andQ40idNotEqualTo(Integer value) {
            addCriterion("q40id <>", value, "q40id");
            return (Criteria) this;
        }

        public Criteria andQ40idGreaterThan(Integer value) {
            addCriterion("q40id >", value, "q40id");
            return (Criteria) this;
        }

        public Criteria andQ40idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q40id >=", value, "q40id");
            return (Criteria) this;
        }

        public Criteria andQ40idLessThan(Integer value) {
            addCriterion("q40id <", value, "q40id");
            return (Criteria) this;
        }

        public Criteria andQ40idLessThanOrEqualTo(Integer value) {
            addCriterion("q40id <=", value, "q40id");
            return (Criteria) this;
        }

        public Criteria andQ40idIn(List<Integer> values) {
            addCriterion("q40id in", values, "q40id");
            return (Criteria) this;
        }

        public Criteria andQ40idNotIn(List<Integer> values) {
            addCriterion("q40id not in", values, "q40id");
            return (Criteria) this;
        }

        public Criteria andQ40idBetween(Integer value1, Integer value2) {
            addCriterion("q40id between", value1, value2, "q40id");
            return (Criteria) this;
        }

        public Criteria andQ40idNotBetween(Integer value1, Integer value2) {
            addCriterion("q40id not between", value1, value2, "q40id");
            return (Criteria) this;
        }

        public Criteria andQ41idIsNull() {
            addCriterion("q41id is null");
            return (Criteria) this;
        }

        public Criteria andQ41idIsNotNull() {
            addCriterion("q41id is not null");
            return (Criteria) this;
        }

        public Criteria andQ41idEqualTo(Integer value) {
            addCriterion("q41id =", value, "q41id");
            return (Criteria) this;
        }

        public Criteria andQ41idNotEqualTo(Integer value) {
            addCriterion("q41id <>", value, "q41id");
            return (Criteria) this;
        }

        public Criteria andQ41idGreaterThan(Integer value) {
            addCriterion("q41id >", value, "q41id");
            return (Criteria) this;
        }

        public Criteria andQ41idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q41id >=", value, "q41id");
            return (Criteria) this;
        }

        public Criteria andQ41idLessThan(Integer value) {
            addCriterion("q41id <", value, "q41id");
            return (Criteria) this;
        }

        public Criteria andQ41idLessThanOrEqualTo(Integer value) {
            addCriterion("q41id <=", value, "q41id");
            return (Criteria) this;
        }

        public Criteria andQ41idIn(List<Integer> values) {
            addCriterion("q41id in", values, "q41id");
            return (Criteria) this;
        }

        public Criteria andQ41idNotIn(List<Integer> values) {
            addCriterion("q41id not in", values, "q41id");
            return (Criteria) this;
        }

        public Criteria andQ41idBetween(Integer value1, Integer value2) {
            addCriterion("q41id between", value1, value2, "q41id");
            return (Criteria) this;
        }

        public Criteria andQ41idNotBetween(Integer value1, Integer value2) {
            addCriterion("q41id not between", value1, value2, "q41id");
            return (Criteria) this;
        }

        public Criteria andQ42idIsNull() {
            addCriterion("q42id is null");
            return (Criteria) this;
        }

        public Criteria andQ42idIsNotNull() {
            addCriterion("q42id is not null");
            return (Criteria) this;
        }

        public Criteria andQ42idEqualTo(Integer value) {
            addCriterion("q42id =", value, "q42id");
            return (Criteria) this;
        }

        public Criteria andQ42idNotEqualTo(Integer value) {
            addCriterion("q42id <>", value, "q42id");
            return (Criteria) this;
        }

        public Criteria andQ42idGreaterThan(Integer value) {
            addCriterion("q42id >", value, "q42id");
            return (Criteria) this;
        }

        public Criteria andQ42idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q42id >=", value, "q42id");
            return (Criteria) this;
        }

        public Criteria andQ42idLessThan(Integer value) {
            addCriterion("q42id <", value, "q42id");
            return (Criteria) this;
        }

        public Criteria andQ42idLessThanOrEqualTo(Integer value) {
            addCriterion("q42id <=", value, "q42id");
            return (Criteria) this;
        }

        public Criteria andQ42idIn(List<Integer> values) {
            addCriterion("q42id in", values, "q42id");
            return (Criteria) this;
        }

        public Criteria andQ42idNotIn(List<Integer> values) {
            addCriterion("q42id not in", values, "q42id");
            return (Criteria) this;
        }

        public Criteria andQ42idBetween(Integer value1, Integer value2) {
            addCriterion("q42id between", value1, value2, "q42id");
            return (Criteria) this;
        }

        public Criteria andQ42idNotBetween(Integer value1, Integer value2) {
            addCriterion("q42id not between", value1, value2, "q42id");
            return (Criteria) this;
        }

        public Criteria andQ43idIsNull() {
            addCriterion("q43id is null");
            return (Criteria) this;
        }

        public Criteria andQ43idIsNotNull() {
            addCriterion("q43id is not null");
            return (Criteria) this;
        }

        public Criteria andQ43idEqualTo(Integer value) {
            addCriterion("q43id =", value, "q43id");
            return (Criteria) this;
        }

        public Criteria andQ43idNotEqualTo(Integer value) {
            addCriterion("q43id <>", value, "q43id");
            return (Criteria) this;
        }

        public Criteria andQ43idGreaterThan(Integer value) {
            addCriterion("q43id >", value, "q43id");
            return (Criteria) this;
        }

        public Criteria andQ43idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q43id >=", value, "q43id");
            return (Criteria) this;
        }

        public Criteria andQ43idLessThan(Integer value) {
            addCriterion("q43id <", value, "q43id");
            return (Criteria) this;
        }

        public Criteria andQ43idLessThanOrEqualTo(Integer value) {
            addCriterion("q43id <=", value, "q43id");
            return (Criteria) this;
        }

        public Criteria andQ43idIn(List<Integer> values) {
            addCriterion("q43id in", values, "q43id");
            return (Criteria) this;
        }

        public Criteria andQ43idNotIn(List<Integer> values) {
            addCriterion("q43id not in", values, "q43id");
            return (Criteria) this;
        }

        public Criteria andQ43idBetween(Integer value1, Integer value2) {
            addCriterion("q43id between", value1, value2, "q43id");
            return (Criteria) this;
        }

        public Criteria andQ43idNotBetween(Integer value1, Integer value2) {
            addCriterion("q43id not between", value1, value2, "q43id");
            return (Criteria) this;
        }

        public Criteria andQ44idIsNull() {
            addCriterion("q44id is null");
            return (Criteria) this;
        }

        public Criteria andQ44idIsNotNull() {
            addCriterion("q44id is not null");
            return (Criteria) this;
        }

        public Criteria andQ44idEqualTo(Integer value) {
            addCriterion("q44id =", value, "q44id");
            return (Criteria) this;
        }

        public Criteria andQ44idNotEqualTo(Integer value) {
            addCriterion("q44id <>", value, "q44id");
            return (Criteria) this;
        }

        public Criteria andQ44idGreaterThan(Integer value) {
            addCriterion("q44id >", value, "q44id");
            return (Criteria) this;
        }

        public Criteria andQ44idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q44id >=", value, "q44id");
            return (Criteria) this;
        }

        public Criteria andQ44idLessThan(Integer value) {
            addCriterion("q44id <", value, "q44id");
            return (Criteria) this;
        }

        public Criteria andQ44idLessThanOrEqualTo(Integer value) {
            addCriterion("q44id <=", value, "q44id");
            return (Criteria) this;
        }

        public Criteria andQ44idIn(List<Integer> values) {
            addCriterion("q44id in", values, "q44id");
            return (Criteria) this;
        }

        public Criteria andQ44idNotIn(List<Integer> values) {
            addCriterion("q44id not in", values, "q44id");
            return (Criteria) this;
        }

        public Criteria andQ44idBetween(Integer value1, Integer value2) {
            addCriterion("q44id between", value1, value2, "q44id");
            return (Criteria) this;
        }

        public Criteria andQ44idNotBetween(Integer value1, Integer value2) {
            addCriterion("q44id not between", value1, value2, "q44id");
            return (Criteria) this;
        }

        public Criteria andQ45idIsNull() {
            addCriterion("q45id is null");
            return (Criteria) this;
        }

        public Criteria andQ45idIsNotNull() {
            addCriterion("q45id is not null");
            return (Criteria) this;
        }

        public Criteria andQ45idEqualTo(Integer value) {
            addCriterion("q45id =", value, "q45id");
            return (Criteria) this;
        }

        public Criteria andQ45idNotEqualTo(Integer value) {
            addCriterion("q45id <>", value, "q45id");
            return (Criteria) this;
        }

        public Criteria andQ45idGreaterThan(Integer value) {
            addCriterion("q45id >", value, "q45id");
            return (Criteria) this;
        }

        public Criteria andQ45idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q45id >=", value, "q45id");
            return (Criteria) this;
        }

        public Criteria andQ45idLessThan(Integer value) {
            addCriterion("q45id <", value, "q45id");
            return (Criteria) this;
        }

        public Criteria andQ45idLessThanOrEqualTo(Integer value) {
            addCriterion("q45id <=", value, "q45id");
            return (Criteria) this;
        }

        public Criteria andQ45idIn(List<Integer> values) {
            addCriterion("q45id in", values, "q45id");
            return (Criteria) this;
        }

        public Criteria andQ45idNotIn(List<Integer> values) {
            addCriterion("q45id not in", values, "q45id");
            return (Criteria) this;
        }

        public Criteria andQ45idBetween(Integer value1, Integer value2) {
            addCriterion("q45id between", value1, value2, "q45id");
            return (Criteria) this;
        }

        public Criteria andQ45idNotBetween(Integer value1, Integer value2) {
            addCriterion("q45id not between", value1, value2, "q45id");
            return (Criteria) this;
        }

        public Criteria andQ46idIsNull() {
            addCriterion("q46id is null");
            return (Criteria) this;
        }

        public Criteria andQ46idIsNotNull() {
            addCriterion("q46id is not null");
            return (Criteria) this;
        }

        public Criteria andQ46idEqualTo(Integer value) {
            addCriterion("q46id =", value, "q46id");
            return (Criteria) this;
        }

        public Criteria andQ46idNotEqualTo(Integer value) {
            addCriterion("q46id <>", value, "q46id");
            return (Criteria) this;
        }

        public Criteria andQ46idGreaterThan(Integer value) {
            addCriterion("q46id >", value, "q46id");
            return (Criteria) this;
        }

        public Criteria andQ46idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q46id >=", value, "q46id");
            return (Criteria) this;
        }

        public Criteria andQ46idLessThan(Integer value) {
            addCriterion("q46id <", value, "q46id");
            return (Criteria) this;
        }

        public Criteria andQ46idLessThanOrEqualTo(Integer value) {
            addCriterion("q46id <=", value, "q46id");
            return (Criteria) this;
        }

        public Criteria andQ46idIn(List<Integer> values) {
            addCriterion("q46id in", values, "q46id");
            return (Criteria) this;
        }

        public Criteria andQ46idNotIn(List<Integer> values) {
            addCriterion("q46id not in", values, "q46id");
            return (Criteria) this;
        }

        public Criteria andQ46idBetween(Integer value1, Integer value2) {
            addCriterion("q46id between", value1, value2, "q46id");
            return (Criteria) this;
        }

        public Criteria andQ46idNotBetween(Integer value1, Integer value2) {
            addCriterion("q46id not between", value1, value2, "q46id");
            return (Criteria) this;
        }

        public Criteria andQ47idIsNull() {
            addCriterion("q47id is null");
            return (Criteria) this;
        }

        public Criteria andQ47idIsNotNull() {
            addCriterion("q47id is not null");
            return (Criteria) this;
        }

        public Criteria andQ47idEqualTo(Integer value) {
            addCriterion("q47id =", value, "q47id");
            return (Criteria) this;
        }

        public Criteria andQ47idNotEqualTo(Integer value) {
            addCriterion("q47id <>", value, "q47id");
            return (Criteria) this;
        }

        public Criteria andQ47idGreaterThan(Integer value) {
            addCriterion("q47id >", value, "q47id");
            return (Criteria) this;
        }

        public Criteria andQ47idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q47id >=", value, "q47id");
            return (Criteria) this;
        }

        public Criteria andQ47idLessThan(Integer value) {
            addCriterion("q47id <", value, "q47id");
            return (Criteria) this;
        }

        public Criteria andQ47idLessThanOrEqualTo(Integer value) {
            addCriterion("q47id <=", value, "q47id");
            return (Criteria) this;
        }

        public Criteria andQ47idIn(List<Integer> values) {
            addCriterion("q47id in", values, "q47id");
            return (Criteria) this;
        }

        public Criteria andQ47idNotIn(List<Integer> values) {
            addCriterion("q47id not in", values, "q47id");
            return (Criteria) this;
        }

        public Criteria andQ47idBetween(Integer value1, Integer value2) {
            addCriterion("q47id between", value1, value2, "q47id");
            return (Criteria) this;
        }

        public Criteria andQ47idNotBetween(Integer value1, Integer value2) {
            addCriterion("q47id not between", value1, value2, "q47id");
            return (Criteria) this;
        }

        public Criteria andQ48idIsNull() {
            addCriterion("q48id is null");
            return (Criteria) this;
        }

        public Criteria andQ48idIsNotNull() {
            addCriterion("q48id is not null");
            return (Criteria) this;
        }

        public Criteria andQ48idEqualTo(Integer value) {
            addCriterion("q48id =", value, "q48id");
            return (Criteria) this;
        }

        public Criteria andQ48idNotEqualTo(Integer value) {
            addCriterion("q48id <>", value, "q48id");
            return (Criteria) this;
        }

        public Criteria andQ48idGreaterThan(Integer value) {
            addCriterion("q48id >", value, "q48id");
            return (Criteria) this;
        }

        public Criteria andQ48idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q48id >=", value, "q48id");
            return (Criteria) this;
        }

        public Criteria andQ48idLessThan(Integer value) {
            addCriterion("q48id <", value, "q48id");
            return (Criteria) this;
        }

        public Criteria andQ48idLessThanOrEqualTo(Integer value) {
            addCriterion("q48id <=", value, "q48id");
            return (Criteria) this;
        }

        public Criteria andQ48idIn(List<Integer> values) {
            addCriterion("q48id in", values, "q48id");
            return (Criteria) this;
        }

        public Criteria andQ48idNotIn(List<Integer> values) {
            addCriterion("q48id not in", values, "q48id");
            return (Criteria) this;
        }

        public Criteria andQ48idBetween(Integer value1, Integer value2) {
            addCriterion("q48id between", value1, value2, "q48id");
            return (Criteria) this;
        }

        public Criteria andQ48idNotBetween(Integer value1, Integer value2) {
            addCriterion("q48id not between", value1, value2, "q48id");
            return (Criteria) this;
        }

        public Criteria andQ49idIsNull() {
            addCriterion("q49id is null");
            return (Criteria) this;
        }

        public Criteria andQ49idIsNotNull() {
            addCriterion("q49id is not null");
            return (Criteria) this;
        }

        public Criteria andQ49idEqualTo(Integer value) {
            addCriterion("q49id =", value, "q49id");
            return (Criteria) this;
        }

        public Criteria andQ49idNotEqualTo(Integer value) {
            addCriterion("q49id <>", value, "q49id");
            return (Criteria) this;
        }

        public Criteria andQ49idGreaterThan(Integer value) {
            addCriterion("q49id >", value, "q49id");
            return (Criteria) this;
        }

        public Criteria andQ49idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q49id >=", value, "q49id");
            return (Criteria) this;
        }

        public Criteria andQ49idLessThan(Integer value) {
            addCriterion("q49id <", value, "q49id");
            return (Criteria) this;
        }

        public Criteria andQ49idLessThanOrEqualTo(Integer value) {
            addCriterion("q49id <=", value, "q49id");
            return (Criteria) this;
        }

        public Criteria andQ49idIn(List<Integer> values) {
            addCriterion("q49id in", values, "q49id");
            return (Criteria) this;
        }

        public Criteria andQ49idNotIn(List<Integer> values) {
            addCriterion("q49id not in", values, "q49id");
            return (Criteria) this;
        }

        public Criteria andQ49idBetween(Integer value1, Integer value2) {
            addCriterion("q49id between", value1, value2, "q49id");
            return (Criteria) this;
        }

        public Criteria andQ49idNotBetween(Integer value1, Integer value2) {
            addCriterion("q49id not between", value1, value2, "q49id");
            return (Criteria) this;
        }

        public Criteria andQ50idIsNull() {
            addCriterion("q50id is null");
            return (Criteria) this;
        }

        public Criteria andQ50idIsNotNull() {
            addCriterion("q50id is not null");
            return (Criteria) this;
        }

        public Criteria andQ50idEqualTo(Integer value) {
            addCriterion("q50id =", value, "q50id");
            return (Criteria) this;
        }

        public Criteria andQ50idNotEqualTo(Integer value) {
            addCriterion("q50id <>", value, "q50id");
            return (Criteria) this;
        }

        public Criteria andQ50idGreaterThan(Integer value) {
            addCriterion("q50id >", value, "q50id");
            return (Criteria) this;
        }

        public Criteria andQ50idGreaterThanOrEqualTo(Integer value) {
            addCriterion("q50id >=", value, "q50id");
            return (Criteria) this;
        }

        public Criteria andQ50idLessThan(Integer value) {
            addCriterion("q50id <", value, "q50id");
            return (Criteria) this;
        }

        public Criteria andQ50idLessThanOrEqualTo(Integer value) {
            addCriterion("q50id <=", value, "q50id");
            return (Criteria) this;
        }

        public Criteria andQ50idIn(List<Integer> values) {
            addCriterion("q50id in", values, "q50id");
            return (Criteria) this;
        }

        public Criteria andQ50idNotIn(List<Integer> values) {
            addCriterion("q50id not in", values, "q50id");
            return (Criteria) this;
        }

        public Criteria andQ50idBetween(Integer value1, Integer value2) {
            addCriterion("q50id between", value1, value2, "q50id");
            return (Criteria) this;
        }

        public Criteria andQ50idNotBetween(Integer value1, Integer value2) {
            addCriterion("q50id not between", value1, value2, "q50id");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}