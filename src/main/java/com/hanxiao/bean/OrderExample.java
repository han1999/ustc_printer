package com.hanxiao.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("filename is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("filename is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("filename like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("filename not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("filename not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andPrintColorIsNull() {
            addCriterion("print_color is null");
            return (Criteria) this;
        }

        public Criteria andPrintColorIsNotNull() {
            addCriterion("print_color is not null");
            return (Criteria) this;
        }

        public Criteria andPrintColorEqualTo(Byte value) {
            addCriterion("print_color =", value, "printColor");
            return (Criteria) this;
        }

        public Criteria andPrintColorNotEqualTo(Byte value) {
            addCriterion("print_color <>", value, "printColor");
            return (Criteria) this;
        }

        public Criteria andPrintColorGreaterThan(Byte value) {
            addCriterion("print_color >", value, "printColor");
            return (Criteria) this;
        }

        public Criteria andPrintColorGreaterThanOrEqualTo(Byte value) {
            addCriterion("print_color >=", value, "printColor");
            return (Criteria) this;
        }

        public Criteria andPrintColorLessThan(Byte value) {
            addCriterion("print_color <", value, "printColor");
            return (Criteria) this;
        }

        public Criteria andPrintColorLessThanOrEqualTo(Byte value) {
            addCriterion("print_color <=", value, "printColor");
            return (Criteria) this;
        }

        public Criteria andPrintColorIn(List<Byte> values) {
            addCriterion("print_color in", values, "printColor");
            return (Criteria) this;
        }

        public Criteria andPrintColorNotIn(List<Byte> values) {
            addCriterion("print_color not in", values, "printColor");
            return (Criteria) this;
        }

        public Criteria andPrintColorBetween(Byte value1, Byte value2) {
            addCriterion("print_color between", value1, value2, "printColor");
            return (Criteria) this;
        }

        public Criteria andPrintColorNotBetween(Byte value1, Byte value2) {
            addCriterion("print_color not between", value1, value2, "printColor");
            return (Criteria) this;
        }

        public Criteria andPageSizeIsNull() {
            addCriterion("page_size is null");
            return (Criteria) this;
        }

        public Criteria andPageSizeIsNotNull() {
            addCriterion("page_size is not null");
            return (Criteria) this;
        }

        public Criteria andPageSizeEqualTo(Byte value) {
            addCriterion("page_size =", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeNotEqualTo(Byte value) {
            addCriterion("page_size <>", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeGreaterThan(Byte value) {
            addCriterion("page_size >", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeGreaterThanOrEqualTo(Byte value) {
            addCriterion("page_size >=", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeLessThan(Byte value) {
            addCriterion("page_size <", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeLessThanOrEqualTo(Byte value) {
            addCriterion("page_size <=", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeIn(List<Byte> values) {
            addCriterion("page_size in", values, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeNotIn(List<Byte> values) {
            addCriterion("page_size not in", values, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeBetween(Byte value1, Byte value2) {
            addCriterion("page_size between", value1, value2, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeNotBetween(Byte value1, Byte value2) {
            addCriterion("page_size not between", value1, value2, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageNumbersIsNull() {
            addCriterion("page_numbers is null");
            return (Criteria) this;
        }

        public Criteria andPageNumbersIsNotNull() {
            addCriterion("page_numbers is not null");
            return (Criteria) this;
        }

        public Criteria andPageNumbersEqualTo(Integer value) {
            addCriterion("page_numbers =", value, "pageNumbers");
            return (Criteria) this;
        }

        public Criteria andPageNumbersNotEqualTo(Integer value) {
            addCriterion("page_numbers <>", value, "pageNumbers");
            return (Criteria) this;
        }

        public Criteria andPageNumbersGreaterThan(Integer value) {
            addCriterion("page_numbers >", value, "pageNumbers");
            return (Criteria) this;
        }

        public Criteria andPageNumbersGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_numbers >=", value, "pageNumbers");
            return (Criteria) this;
        }

        public Criteria andPageNumbersLessThan(Integer value) {
            addCriterion("page_numbers <", value, "pageNumbers");
            return (Criteria) this;
        }

        public Criteria andPageNumbersLessThanOrEqualTo(Integer value) {
            addCriterion("page_numbers <=", value, "pageNumbers");
            return (Criteria) this;
        }

        public Criteria andPageNumbersIn(List<Integer> values) {
            addCriterion("page_numbers in", values, "pageNumbers");
            return (Criteria) this;
        }

        public Criteria andPageNumbersNotIn(List<Integer> values) {
            addCriterion("page_numbers not in", values, "pageNumbers");
            return (Criteria) this;
        }

        public Criteria andPageNumbersBetween(Integer value1, Integer value2) {
            addCriterion("page_numbers between", value1, value2, "pageNumbers");
            return (Criteria) this;
        }

        public Criteria andPageNumbersNotBetween(Integer value1, Integer value2) {
            addCriterion("page_numbers not between", value1, value2, "pageNumbers");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeIsNull() {
            addCriterion("delivery_mode is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeIsNotNull() {
            addCriterion("delivery_mode is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeEqualTo(Byte value) {
            addCriterion("delivery_mode =", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeNotEqualTo(Byte value) {
            addCriterion("delivery_mode <>", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeGreaterThan(Byte value) {
            addCriterion("delivery_mode >", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeGreaterThanOrEqualTo(Byte value) {
            addCriterion("delivery_mode >=", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeLessThan(Byte value) {
            addCriterion("delivery_mode <", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeLessThanOrEqualTo(Byte value) {
            addCriterion("delivery_mode <=", value, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeIn(List<Byte> values) {
            addCriterion("delivery_mode in", values, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeNotIn(List<Byte> values) {
            addCriterion("delivery_mode not in", values, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeBetween(Byte value1, Byte value2) {
            addCriterion("delivery_mode between", value1, value2, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryModeNotBetween(Byte value1, Byte value2) {
            addCriterion("delivery_mode not between", value1, value2, "deliveryMode");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIsNull() {
            addCriterion("delivery_address is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIsNotNull() {
            addCriterion("delivery_address is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressEqualTo(String value) {
            addCriterion("delivery_address =", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotEqualTo(String value) {
            addCriterion("delivery_address <>", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressGreaterThan(String value) {
            addCriterion("delivery_address >", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_address >=", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLessThan(String value) {
            addCriterion("delivery_address <", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLessThanOrEqualTo(String value) {
            addCriterion("delivery_address <=", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLike(String value) {
            addCriterion("delivery_address like", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotLike(String value) {
            addCriterion("delivery_address not like", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIn(List<String> values) {
            addCriterion("delivery_address in", values, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotIn(List<String> values) {
            addCriterion("delivery_address not in", values, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressBetween(String value1, String value2) {
            addCriterion("delivery_address between", value1, value2, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotBetween(String value1, String value2) {
            addCriterion("delivery_address not between", value1, value2, "deliveryAddress");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andOtherDemandIsNull() {
            addCriterion("other_demand is null");
            return (Criteria) this;
        }

        public Criteria andOtherDemandIsNotNull() {
            addCriterion("other_demand is not null");
            return (Criteria) this;
        }

        public Criteria andOtherDemandEqualTo(String value) {
            addCriterion("other_demand =", value, "otherDemand");
            return (Criteria) this;
        }

        public Criteria andOtherDemandNotEqualTo(String value) {
            addCriterion("other_demand <>", value, "otherDemand");
            return (Criteria) this;
        }

        public Criteria andOtherDemandGreaterThan(String value) {
            addCriterion("other_demand >", value, "otherDemand");
            return (Criteria) this;
        }

        public Criteria andOtherDemandGreaterThanOrEqualTo(String value) {
            addCriterion("other_demand >=", value, "otherDemand");
            return (Criteria) this;
        }

        public Criteria andOtherDemandLessThan(String value) {
            addCriterion("other_demand <", value, "otherDemand");
            return (Criteria) this;
        }

        public Criteria andOtherDemandLessThanOrEqualTo(String value) {
            addCriterion("other_demand <=", value, "otherDemand");
            return (Criteria) this;
        }

        public Criteria andOtherDemandLike(String value) {
            addCriterion("other_demand like", value, "otherDemand");
            return (Criteria) this;
        }

        public Criteria andOtherDemandNotLike(String value) {
            addCriterion("other_demand not like", value, "otherDemand");
            return (Criteria) this;
        }

        public Criteria andOtherDemandIn(List<String> values) {
            addCriterion("other_demand in", values, "otherDemand");
            return (Criteria) this;
        }

        public Criteria andOtherDemandNotIn(List<String> values) {
            addCriterion("other_demand not in", values, "otherDemand");
            return (Criteria) this;
        }

        public Criteria andOtherDemandBetween(String value1, String value2) {
            addCriterion("other_demand between", value1, value2, "otherDemand");
            return (Criteria) this;
        }

        public Criteria andOtherDemandNotBetween(String value1, String value2) {
            addCriterion("other_demand not between", value1, value2, "otherDemand");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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