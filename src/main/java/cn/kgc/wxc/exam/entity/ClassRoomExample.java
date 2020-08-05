package cn.kgc.wxc.exam.entity;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassRoomExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(Integer value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Integer value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Integer value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Integer value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Integer value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Integer> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Integer> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Integer value1, Integer value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andClassNumberIsNull() {
            addCriterion("class_number is null");
            return (Criteria) this;
        }

        public Criteria andClassNumberIsNotNull() {
            addCriterion("class_number is not null");
            return (Criteria) this;
        }

        public Criteria andClassNumberEqualTo(Integer value) {
            addCriterion("class_number =", value, "classNumber");
            return (Criteria) this;
        }

        public Criteria andClassNumberNotEqualTo(Integer value) {
            addCriterion("class_number <>", value, "classNumber");
            return (Criteria) this;
        }

        public Criteria andClassNumberGreaterThan(Integer value) {
            addCriterion("class_number >", value, "classNumber");
            return (Criteria) this;
        }

        public Criteria andClassNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_number >=", value, "classNumber");
            return (Criteria) this;
        }

        public Criteria andClassNumberLessThan(Integer value) {
            addCriterion("class_number <", value, "classNumber");
            return (Criteria) this;
        }

        public Criteria andClassNumberLessThanOrEqualTo(Integer value) {
            addCriterion("class_number <=", value, "classNumber");
            return (Criteria) this;
        }

        public Criteria andClassNumberIn(List<Integer> values) {
            addCriterion("class_number in", values, "classNumber");
            return (Criteria) this;
        }

        public Criteria andClassNumberNotIn(List<Integer> values) {
            addCriterion("class_number not in", values, "classNumber");
            return (Criteria) this;
        }

        public Criteria andClassNumberBetween(Integer value1, Integer value2) {
            addCriterion("class_number between", value1, value2, "classNumber");
            return (Criteria) this;
        }

        public Criteria andClassNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("class_number not between", value1, value2, "classNumber");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleIsNull() {
            addCriterion("max_people is null");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleIsNotNull() {
            addCriterion("max_people is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleEqualTo(Integer value) {
            addCriterion("max_people =", value, "maxPeople");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleNotEqualTo(Integer value) {
            addCriterion("max_people <>", value, "maxPeople");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleGreaterThan(Integer value) {
            addCriterion("max_people >", value, "maxPeople");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_people >=", value, "maxPeople");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleLessThan(Integer value) {
            addCriterion("max_people <", value, "maxPeople");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("max_people <=", value, "maxPeople");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleIn(List<Integer> values) {
            addCriterion("max_people in", values, "maxPeople");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleNotIn(List<Integer> values) {
            addCriterion("max_people not in", values, "maxPeople");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleBetween(Integer value1, Integer value2) {
            addCriterion("max_people between", value1, value2, "maxPeople");
            return (Criteria) this;
        }

        public Criteria andMaxPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("max_people not between", value1, value2, "maxPeople");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andProjectorIsNull() {
            addCriterion("projector is null");
            return (Criteria) this;
        }

        public Criteria andProjectorIsNotNull() {
            addCriterion("projector is not null");
            return (Criteria) this;
        }

        public Criteria andProjectorEqualTo(Integer value) {
            addCriterion("projector =", value, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorNotEqualTo(Integer value) {
            addCriterion("projector <>", value, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorGreaterThan(Integer value) {
            addCriterion("projector >", value, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorGreaterThanOrEqualTo(Integer value) {
            addCriterion("projector >=", value, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorLessThan(Integer value) {
            addCriterion("projector <", value, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorLessThanOrEqualTo(Integer value) {
            addCriterion("projector <=", value, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorIn(List<Integer> values) {
            addCriterion("projector in", values, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorNotIn(List<Integer> values) {
            addCriterion("projector not in", values, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorBetween(Integer value1, Integer value2) {
            addCriterion("projector between", value1, value2, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorNotBetween(Integer value1, Integer value2) {
            addCriterion("projector not between", value1, value2, "projector");
            return (Criteria) this;
        }

        public Criteria andWifiPasswordIsNull() {
            addCriterion("wifi_password is null");
            return (Criteria) this;
        }

        public Criteria andWifiPasswordIsNotNull() {
            addCriterion("wifi_password is not null");
            return (Criteria) this;
        }

        public Criteria andWifiPasswordEqualTo(String value) {
            addCriterion("wifi_password =", value, "wifiPassword");
            return (Criteria) this;
        }

        public Criteria andWifiPasswordNotEqualTo(String value) {
            addCriterion("wifi_password <>", value, "wifiPassword");
            return (Criteria) this;
        }

        public Criteria andWifiPasswordGreaterThan(String value) {
            addCriterion("wifi_password >", value, "wifiPassword");
            return (Criteria) this;
        }

        public Criteria andWifiPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("wifi_password >=", value, "wifiPassword");
            return (Criteria) this;
        }

        public Criteria andWifiPasswordLessThan(String value) {
            addCriterion("wifi_password <", value, "wifiPassword");
            return (Criteria) this;
        }

        public Criteria andWifiPasswordLessThanOrEqualTo(String value) {
            addCriterion("wifi_password <=", value, "wifiPassword");
            return (Criteria) this;
        }

        public Criteria andWifiPasswordLike(String value) {
            addCriterion("wifi_password like", value, "wifiPassword");
            return (Criteria) this;
        }

        public Criteria andWifiPasswordNotLike(String value) {
            addCriterion("wifi_password not like", value, "wifiPassword");
            return (Criteria) this;
        }

        public Criteria andWifiPasswordIn(List<String> values) {
            addCriterion("wifi_password in", values, "wifiPassword");
            return (Criteria) this;
        }

        public Criteria andWifiPasswordNotIn(List<String> values) {
            addCriterion("wifi_password not in", values, "wifiPassword");
            return (Criteria) this;
        }

        public Criteria andWifiPasswordBetween(String value1, String value2) {
            addCriterion("wifi_password between", value1, value2, "wifiPassword");
            return (Criteria) this;
        }

        public Criteria andWifiPasswordNotBetween(String value1, String value2) {
            addCriterion("wifi_password not between", value1, value2, "wifiPassword");
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