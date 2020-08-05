package cn.kgc.wxc.exam.entity;

import java.util.ArrayList;
import java.util.List;

public class ItembankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItembankExample() {
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

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Integer value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Integer value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Integer value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Integer value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Integer value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Integer> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Integer> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Integer value1, Integer value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Integer value1, Integer value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andChoiceIsNull() {
            addCriterion("choice is null");
            return (Criteria) this;
        }

        public Criteria andChoiceIsNotNull() {
            addCriterion("choice is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceEqualTo(Integer value) {
            addCriterion("choice =", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceNotEqualTo(Integer value) {
            addCriterion("choice <>", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceGreaterThan(Integer value) {
            addCriterion("choice >", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("choice >=", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceLessThan(Integer value) {
            addCriterion("choice <", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceLessThanOrEqualTo(Integer value) {
            addCriterion("choice <=", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceIn(List<Integer> values) {
            addCriterion("choice in", values, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceNotIn(List<Integer> values) {
            addCriterion("choice not in", values, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceBetween(Integer value1, Integer value2) {
            addCriterion("choice between", value1, value2, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("choice not between", value1, value2, "choice");
            return (Criteria) this;
        }

        public Criteria andAnswerAIsNull() {
            addCriterion("answer_a is null");
            return (Criteria) this;
        }

        public Criteria andAnswerAIsNotNull() {
            addCriterion("answer_a is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerAEqualTo(String value) {
            addCriterion("answer_a =", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerANotEqualTo(String value) {
            addCriterion("answer_a <>", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerAGreaterThan(String value) {
            addCriterion("answer_a >", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerAGreaterThanOrEqualTo(String value) {
            addCriterion("answer_a >=", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerALessThan(String value) {
            addCriterion("answer_a <", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerALessThanOrEqualTo(String value) {
            addCriterion("answer_a <=", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerALike(String value) {
            addCriterion("answer_a like", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerANotLike(String value) {
            addCriterion("answer_a not like", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerAIn(List<String> values) {
            addCriterion("answer_a in", values, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerANotIn(List<String> values) {
            addCriterion("answer_a not in", values, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerABetween(String value1, String value2) {
            addCriterion("answer_a between", value1, value2, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerANotBetween(String value1, String value2) {
            addCriterion("answer_a not between", value1, value2, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerBIsNull() {
            addCriterion("answer_b is null");
            return (Criteria) this;
        }

        public Criteria andAnswerBIsNotNull() {
            addCriterion("answer_b is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerBEqualTo(String value) {
            addCriterion("answer_b =", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBNotEqualTo(String value) {
            addCriterion("answer_b <>", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBGreaterThan(String value) {
            addCriterion("answer_b >", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBGreaterThanOrEqualTo(String value) {
            addCriterion("answer_b >=", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBLessThan(String value) {
            addCriterion("answer_b <", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBLessThanOrEqualTo(String value) {
            addCriterion("answer_b <=", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBLike(String value) {
            addCriterion("answer_b like", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBNotLike(String value) {
            addCriterion("answer_b not like", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBIn(List<String> values) {
            addCriterion("answer_b in", values, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBNotIn(List<String> values) {
            addCriterion("answer_b not in", values, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBBetween(String value1, String value2) {
            addCriterion("answer_b between", value1, value2, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBNotBetween(String value1, String value2) {
            addCriterion("answer_b not between", value1, value2, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerCIsNull() {
            addCriterion("answer_c is null");
            return (Criteria) this;
        }

        public Criteria andAnswerCIsNotNull() {
            addCriterion("answer_c is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerCEqualTo(String value) {
            addCriterion("answer_c =", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCNotEqualTo(String value) {
            addCriterion("answer_c <>", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCGreaterThan(String value) {
            addCriterion("answer_c >", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCGreaterThanOrEqualTo(String value) {
            addCriterion("answer_c >=", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCLessThan(String value) {
            addCriterion("answer_c <", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCLessThanOrEqualTo(String value) {
            addCriterion("answer_c <=", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCLike(String value) {
            addCriterion("answer_c like", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCNotLike(String value) {
            addCriterion("answer_c not like", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCIn(List<String> values) {
            addCriterion("answer_c in", values, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCNotIn(List<String> values) {
            addCriterion("answer_c not in", values, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCBetween(String value1, String value2) {
            addCriterion("answer_c between", value1, value2, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCNotBetween(String value1, String value2) {
            addCriterion("answer_c not between", value1, value2, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerDIsNull() {
            addCriterion("answer_d is null");
            return (Criteria) this;
        }

        public Criteria andAnswerDIsNotNull() {
            addCriterion("answer_d is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerDEqualTo(String value) {
            addCriterion("answer_d =", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDNotEqualTo(String value) {
            addCriterion("answer_d <>", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDGreaterThan(String value) {
            addCriterion("answer_d >", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDGreaterThanOrEqualTo(String value) {
            addCriterion("answer_d >=", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDLessThan(String value) {
            addCriterion("answer_d <", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDLessThanOrEqualTo(String value) {
            addCriterion("answer_d <=", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDLike(String value) {
            addCriterion("answer_d like", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDNotLike(String value) {
            addCriterion("answer_d not like", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDIn(List<String> values) {
            addCriterion("answer_d in", values, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDNotIn(List<String> values) {
            addCriterion("answer_d not in", values, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDBetween(String value1, String value2) {
            addCriterion("answer_d between", value1, value2, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDNotBetween(String value1, String value2) {
            addCriterion("answer_d not between", value1, value2, "answerD");
            return (Criteria) this;
        }

        public Criteria andRightAnswerIsNull() {
            addCriterion("right_answer is null");
            return (Criteria) this;
        }

        public Criteria andRightAnswerIsNotNull() {
            addCriterion("right_answer is not null");
            return (Criteria) this;
        }

        public Criteria andRightAnswerEqualTo(String value) {
            addCriterion("right_answer =", value, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerNotEqualTo(String value) {
            addCriterion("right_answer <>", value, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerGreaterThan(String value) {
            addCriterion("right_answer >", value, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("right_answer >=", value, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerLessThan(String value) {
            addCriterion("right_answer <", value, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerLessThanOrEqualTo(String value) {
            addCriterion("right_answer <=", value, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerLike(String value) {
            addCriterion("right_answer like", value, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerNotLike(String value) {
            addCriterion("right_answer not like", value, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerIn(List<String> values) {
            addCriterion("right_answer in", values, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerNotIn(List<String> values) {
            addCriterion("right_answer not in", values, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerBetween(String value1, String value2) {
            addCriterion("right_answer between", value1, value2, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerNotBetween(String value1, String value2) {
            addCriterion("right_answer not between", value1, value2, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointIsNull() {
            addCriterion("knowledge_point is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointIsNotNull() {
            addCriterion("knowledge_point is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointEqualTo(String value) {
            addCriterion("knowledge_point =", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointNotEqualTo(String value) {
            addCriterion("knowledge_point <>", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointGreaterThan(String value) {
            addCriterion("knowledge_point >", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointGreaterThanOrEqualTo(String value) {
            addCriterion("knowledge_point >=", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointLessThan(String value) {
            addCriterion("knowledge_point <", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointLessThanOrEqualTo(String value) {
            addCriterion("knowledge_point <=", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointLike(String value) {
            addCriterion("knowledge_point like", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointNotLike(String value) {
            addCriterion("knowledge_point not like", value, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointIn(List<String> values) {
            addCriterion("knowledge_point in", values, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointNotIn(List<String> values) {
            addCriterion("knowledge_point not in", values, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointBetween(String value1, String value2) {
            addCriterion("knowledge_point between", value1, value2, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andKnowledgePointNotBetween(String value1, String value2) {
            addCriterion("knowledge_point not between", value1, value2, "knowledgePoint");
            return (Criteria) this;
        }

        public Criteria andResolveExampleIsNull() {
            addCriterion("resolve_example is null");
            return (Criteria) this;
        }

        public Criteria andResolveExampleIsNotNull() {
            addCriterion("resolve_example is not null");
            return (Criteria) this;
        }

        public Criteria andResolveExampleEqualTo(String value) {
            addCriterion("resolve_example =", value, "resolveExample");
            return (Criteria) this;
        }

        public Criteria andResolveExampleNotEqualTo(String value) {
            addCriterion("resolve_example <>", value, "resolveExample");
            return (Criteria) this;
        }

        public Criteria andResolveExampleGreaterThan(String value) {
            addCriterion("resolve_example >", value, "resolveExample");
            return (Criteria) this;
        }

        public Criteria andResolveExampleGreaterThanOrEqualTo(String value) {
            addCriterion("resolve_example >=", value, "resolveExample");
            return (Criteria) this;
        }

        public Criteria andResolveExampleLessThan(String value) {
            addCriterion("resolve_example <", value, "resolveExample");
            return (Criteria) this;
        }

        public Criteria andResolveExampleLessThanOrEqualTo(String value) {
            addCriterion("resolve_example <=", value, "resolveExample");
            return (Criteria) this;
        }

        public Criteria andResolveExampleLike(String value) {
            addCriterion("resolve_example like", value, "resolveExample");
            return (Criteria) this;
        }

        public Criteria andResolveExampleNotLike(String value) {
            addCriterion("resolve_example not like", value, "resolveExample");
            return (Criteria) this;
        }

        public Criteria andResolveExampleIn(List<String> values) {
            addCriterion("resolve_example in", values, "resolveExample");
            return (Criteria) this;
        }

        public Criteria andResolveExampleNotIn(List<String> values) {
            addCriterion("resolve_example not in", values, "resolveExample");
            return (Criteria) this;
        }

        public Criteria andResolveExampleBetween(String value1, String value2) {
            addCriterion("resolve_example between", value1, value2, "resolveExample");
            return (Criteria) this;
        }

        public Criteria andResolveExampleNotBetween(String value1, String value2) {
            addCriterion("resolve_example not between", value1, value2, "resolveExample");
            return (Criteria) this;
        }

        public Criteria andTestCountIsNull() {
            addCriterion("test_count is null");
            return (Criteria) this;
        }

        public Criteria andTestCountIsNotNull() {
            addCriterion("test_count is not null");
            return (Criteria) this;
        }

        public Criteria andTestCountEqualTo(Integer value) {
            addCriterion("test_count =", value, "testCount");
            return (Criteria) this;
        }

        public Criteria andTestCountNotEqualTo(Integer value) {
            addCriterion("test_count <>", value, "testCount");
            return (Criteria) this;
        }

        public Criteria andTestCountGreaterThan(Integer value) {
            addCriterion("test_count >", value, "testCount");
            return (Criteria) this;
        }

        public Criteria andTestCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_count >=", value, "testCount");
            return (Criteria) this;
        }

        public Criteria andTestCountLessThan(Integer value) {
            addCriterion("test_count <", value, "testCount");
            return (Criteria) this;
        }

        public Criteria andTestCountLessThanOrEqualTo(Integer value) {
            addCriterion("test_count <=", value, "testCount");
            return (Criteria) this;
        }

        public Criteria andTestCountIn(List<Integer> values) {
            addCriterion("test_count in", values, "testCount");
            return (Criteria) this;
        }

        public Criteria andTestCountNotIn(List<Integer> values) {
            addCriterion("test_count not in", values, "testCount");
            return (Criteria) this;
        }

        public Criteria andTestCountBetween(Integer value1, Integer value2) {
            addCriterion("test_count between", value1, value2, "testCount");
            return (Criteria) this;
        }

        public Criteria andTestCountNotBetween(Integer value1, Integer value2) {
            addCriterion("test_count not between", value1, value2, "testCount");
            return (Criteria) this;
        }

        public Criteria andRightCountIsNull() {
            addCriterion("right_count is null");
            return (Criteria) this;
        }

        public Criteria andRightCountIsNotNull() {
            addCriterion("right_count is not null");
            return (Criteria) this;
        }

        public Criteria andRightCountEqualTo(Integer value) {
            addCriterion("right_count =", value, "rightCount");
            return (Criteria) this;
        }

        public Criteria andRightCountNotEqualTo(Integer value) {
            addCriterion("right_count <>", value, "rightCount");
            return (Criteria) this;
        }

        public Criteria andRightCountGreaterThan(Integer value) {
            addCriterion("right_count >", value, "rightCount");
            return (Criteria) this;
        }

        public Criteria andRightCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("right_count >=", value, "rightCount");
            return (Criteria) this;
        }

        public Criteria andRightCountLessThan(Integer value) {
            addCriterion("right_count <", value, "rightCount");
            return (Criteria) this;
        }

        public Criteria andRightCountLessThanOrEqualTo(Integer value) {
            addCriterion("right_count <=", value, "rightCount");
            return (Criteria) this;
        }

        public Criteria andRightCountIn(List<Integer> values) {
            addCriterion("right_count in", values, "rightCount");
            return (Criteria) this;
        }

        public Criteria andRightCountNotIn(List<Integer> values) {
            addCriterion("right_count not in", values, "rightCount");
            return (Criteria) this;
        }

        public Criteria andRightCountBetween(Integer value1, Integer value2) {
            addCriterion("right_count between", value1, value2, "rightCount");
            return (Criteria) this;
        }

        public Criteria andRightCountNotBetween(Integer value1, Integer value2) {
            addCriterion("right_count not between", value1, value2, "rightCount");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(Integer value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(Integer value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(Integer value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(Integer value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(Integer value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<Integer> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<Integer> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(Integer value1, Integer value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(Integer value1, Integer value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andChapterIsNull() {
            addCriterion("chapter is null");
            return (Criteria) this;
        }

        public Criteria andChapterIsNotNull() {
            addCriterion("chapter is not null");
            return (Criteria) this;
        }

        public Criteria andChapterEqualTo(Integer value) {
            addCriterion("chapter =", value, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterNotEqualTo(Integer value) {
            addCriterion("chapter <>", value, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterGreaterThan(Integer value) {
            addCriterion("chapter >", value, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapter >=", value, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterLessThan(Integer value) {
            addCriterion("chapter <", value, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterLessThanOrEqualTo(Integer value) {
            addCriterion("chapter <=", value, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterIn(List<Integer> values) {
            addCriterion("chapter in", values, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterNotIn(List<Integer> values) {
            addCriterion("chapter not in", values, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterBetween(Integer value1, Integer value2) {
            addCriterion("chapter between", value1, value2, "chapter");
            return (Criteria) this;
        }

        public Criteria andChapterNotBetween(Integer value1, Integer value2) {
            addCriterion("chapter not between", value1, value2, "chapter");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(Integer value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(Integer value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(Integer value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(Integer value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(Integer value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<Integer> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<Integer> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(Integer value1, Integer value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(Integer value1, Integer value2) {
            addCriterion("detail not between", value1, value2, "detail");
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