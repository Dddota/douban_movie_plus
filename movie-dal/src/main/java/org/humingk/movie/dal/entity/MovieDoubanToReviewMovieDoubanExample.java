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
public class MovieDoubanToReviewMovieDoubanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovieDoubanToReviewMovieDoubanExample() {
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

        public Criteria andIdMovieDoubanIsNull() {
            addCriterion("id_movie_douban is null");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanIsNotNull() {
            addCriterion("id_movie_douban is not null");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanEqualTo(Long value) {
            addCriterion("id_movie_douban =", value, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanNotEqualTo(Long value) {
            addCriterion("id_movie_douban <>", value, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanGreaterThan(Long value) {
            addCriterion("id_movie_douban >", value, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanGreaterThanOrEqualTo(Long value) {
            addCriterion("id_movie_douban >=", value, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanLessThan(Long value) {
            addCriterion("id_movie_douban <", value, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanLessThanOrEqualTo(Long value) {
            addCriterion("id_movie_douban <=", value, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanIn(List<Long> values) {
            addCriterion("id_movie_douban in", values, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanNotIn(List<Long> values) {
            addCriterion("id_movie_douban not in", values, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanBetween(Long value1, Long value2) {
            addCriterion("id_movie_douban between", value1, value2, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanNotBetween(Long value1, Long value2) {
            addCriterion("id_movie_douban not between", value1, value2, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdReviewMovieDoubanIsNull() {
            addCriterion("id_review_movie_douban is null");
            return (Criteria) this;
        }

        public Criteria andIdReviewMovieDoubanIsNotNull() {
            addCriterion("id_review_movie_douban is not null");
            return (Criteria) this;
        }

        public Criteria andIdReviewMovieDoubanEqualTo(Long value) {
            addCriterion("id_review_movie_douban =", value, "idReviewMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdReviewMovieDoubanNotEqualTo(Long value) {
            addCriterion("id_review_movie_douban <>", value, "idReviewMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdReviewMovieDoubanGreaterThan(Long value) {
            addCriterion("id_review_movie_douban >", value, "idReviewMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdReviewMovieDoubanGreaterThanOrEqualTo(Long value) {
            addCriterion("id_review_movie_douban >=", value, "idReviewMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdReviewMovieDoubanLessThan(Long value) {
            addCriterion("id_review_movie_douban <", value, "idReviewMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdReviewMovieDoubanLessThanOrEqualTo(Long value) {
            addCriterion("id_review_movie_douban <=", value, "idReviewMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdReviewMovieDoubanIn(List<Long> values) {
            addCriterion("id_review_movie_douban in", values, "idReviewMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdReviewMovieDoubanNotIn(List<Long> values) {
            addCriterion("id_review_movie_douban not in", values, "idReviewMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdReviewMovieDoubanBetween(Long value1, Long value2) {
            addCriterion("id_review_movie_douban between", value1, value2, "idReviewMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdReviewMovieDoubanNotBetween(Long value1, Long value2) {
            addCriterion("id_review_movie_douban not between", value1, value2, "idReviewMovieDouban");
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