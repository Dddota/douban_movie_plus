package org.humingk.movie.dal.entity;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

/** @author humingk */
@Repository
@Data
@AllArgsConstructor
public class CelebrityDoubanToClassicDoubanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CelebrityDoubanToClassicDoubanExample() {
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

    public Criteria start() {
        oredCriteria = new ArrayList<>();
        clear();
        return createCriteria();
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

        public Criteria andIdCelebrityDoubanIsNull() {
            addCriterion("id_celebrity_douban is null");
            return (Criteria) this;
        }

        public Criteria andIdCelebrityDoubanIsNotNull() {
            addCriterion("id_celebrity_douban is not null");
            return (Criteria) this;
        }

        public Criteria andIdCelebrityDoubanEqualTo(Long value) {
            addCriterion("id_celebrity_douban =", value, "idCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andIdCelebrityDoubanNotEqualTo(Long value) {
            addCriterion("id_celebrity_douban <>", value, "idCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andIdCelebrityDoubanGreaterThan(Long value) {
            addCriterion("id_celebrity_douban >", value, "idCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andIdCelebrityDoubanGreaterThanOrEqualTo(Long value) {
            addCriterion("id_celebrity_douban >=", value, "idCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andIdCelebrityDoubanLessThan(Long value) {
            addCriterion("id_celebrity_douban <", value, "idCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andIdCelebrityDoubanLessThanOrEqualTo(Long value) {
            addCriterion("id_celebrity_douban <=", value, "idCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andIdCelebrityDoubanIn(List<Long> values) {
            addCriterion("id_celebrity_douban in", values, "idCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andIdCelebrityDoubanNotIn(List<Long> values) {
            addCriterion("id_celebrity_douban not in", values, "idCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andIdCelebrityDoubanBetween(Long value1, Long value2) {
            addCriterion("id_celebrity_douban between", value1, value2, "idCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andIdCelebrityDoubanNotBetween(Long value1, Long value2) {
            addCriterion("id_celebrity_douban not between", value1, value2, "idCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andIdClassicDoubanIsNull() {
            addCriterion("id_classic_douban is null");
            return (Criteria) this;
        }

        public Criteria andIdClassicDoubanIsNotNull() {
            addCriterion("id_classic_douban is not null");
            return (Criteria) this;
        }

        public Criteria andIdClassicDoubanEqualTo(String value) {
            addCriterion("id_classic_douban =", value, "idClassicDouban");
            return (Criteria) this;
        }

        public Criteria andIdClassicDoubanNotEqualTo(String value) {
            addCriterion("id_classic_douban <>", value, "idClassicDouban");
            return (Criteria) this;
        }

        public Criteria andIdClassicDoubanGreaterThan(String value) {
            addCriterion("id_classic_douban >", value, "idClassicDouban");
            return (Criteria) this;
        }

        public Criteria andIdClassicDoubanGreaterThanOrEqualTo(String value) {
            addCriterion("id_classic_douban >=", value, "idClassicDouban");
            return (Criteria) this;
        }

        public Criteria andIdClassicDoubanLessThan(String value) {
            addCriterion("id_classic_douban <", value, "idClassicDouban");
            return (Criteria) this;
        }

        public Criteria andIdClassicDoubanLessThanOrEqualTo(String value) {
            addCriterion("id_classic_douban <=", value, "idClassicDouban");
            return (Criteria) this;
        }

        public Criteria andIdClassicDoubanLike(String value) {
            addCriterion("id_classic_douban like", value, "idClassicDouban");
            return (Criteria) this;
        }

        public Criteria andIdClassicDoubanNotLike(String value) {
            addCriterion("id_classic_douban not like", value, "idClassicDouban");
            return (Criteria) this;
        }

        public Criteria andIdClassicDoubanIn(List<String> values) {
            addCriterion("id_classic_douban in", values, "idClassicDouban");
            return (Criteria) this;
        }

        public Criteria andIdClassicDoubanNotIn(List<String> values) {
            addCriterion("id_classic_douban not in", values, "idClassicDouban");
            return (Criteria) this;
        }

        public Criteria andIdClassicDoubanBetween(String value1, String value2) {
            addCriterion("id_classic_douban between", value1, value2, "idClassicDouban");
            return (Criteria) this;
        }

        public Criteria andIdClassicDoubanNotBetween(String value1, String value2) {
            addCriterion("id_classic_douban not between", value1, value2, "idClassicDouban");
            return (Criteria) this;
        }

        public Criteria andNameZhCelebrityDoubanIsNull() {
            addCriterion("name_zh_celebrity_douban is null");
            return (Criteria) this;
        }

        public Criteria andNameZhCelebrityDoubanIsNotNull() {
            addCriterion("name_zh_celebrity_douban is not null");
            return (Criteria) this;
        }

        public Criteria andNameZhCelebrityDoubanEqualTo(String value) {
            addCriterion("name_zh_celebrity_douban =", value, "nameZhCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andNameZhCelebrityDoubanNotEqualTo(String value) {
            addCriterion("name_zh_celebrity_douban <>", value, "nameZhCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andNameZhCelebrityDoubanGreaterThan(String value) {
            addCriterion("name_zh_celebrity_douban >", value, "nameZhCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andNameZhCelebrityDoubanGreaterThanOrEqualTo(String value) {
            addCriterion("name_zh_celebrity_douban >=", value, "nameZhCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andNameZhCelebrityDoubanLessThan(String value) {
            addCriterion("name_zh_celebrity_douban <", value, "nameZhCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andNameZhCelebrityDoubanLessThanOrEqualTo(String value) {
            addCriterion("name_zh_celebrity_douban <=", value, "nameZhCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andNameZhCelebrityDoubanLike(String value) {
            addCriterion("name_zh_celebrity_douban like", value, "nameZhCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andNameZhCelebrityDoubanNotLike(String value) {
            addCriterion("name_zh_celebrity_douban not like", value, "nameZhCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andNameZhCelebrityDoubanIn(List<String> values) {
            addCriterion("name_zh_celebrity_douban in", values, "nameZhCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andNameZhCelebrityDoubanNotIn(List<String> values) {
            addCriterion("name_zh_celebrity_douban not in", values, "nameZhCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andNameZhCelebrityDoubanBetween(String value1, String value2) {
            addCriterion("name_zh_celebrity_douban between", value1, value2, "nameZhCelebrityDouban");
            return (Criteria) this;
        }

        public Criteria andNameZhCelebrityDoubanNotBetween(String value1, String value2) {
            addCriterion("name_zh_celebrity_douban not between", value1, value2, "nameZhCelebrityDouban");
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