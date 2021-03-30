package com.fc.bot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.hutool.core.util.StrUtil;

/**
 * tg账号设置 TgAccountExample
 * @author fuce_自动生成
 * @date 2021-02-07 20:09:14
 */
public class TgAccountVo {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TgAccountVo() {
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
        
				
        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(Integer value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(Integer value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }
        
				
        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }
        
				
        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }
        
				
        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Integer value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Integer value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Integer value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Integer value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Integer value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(Integer value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(Integer value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Integer> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Integer> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Integer value1, Integer value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }
        
				
        public Criteria andAppHashIsNull() {
            addCriterion("app_hash is null");
            return (Criteria) this;
        }

        public Criteria andAppHashIsNotNull() {
            addCriterion("app_hash is not null");
            return (Criteria) this;
        }

        public Criteria andAppHashEqualTo(String value) {
            addCriterion("app_hash =", value, "appHash");
            return (Criteria) this;
        }

        public Criteria andAppHashNotEqualTo(String value) {
            addCriterion("app_hash <>", value, "appHash");
            return (Criteria) this;
        }

        public Criteria andAppHashGreaterThan(String value) {
            addCriterion("app_hash >", value, "appHash");
            return (Criteria) this;
        }

        public Criteria andAppHashGreaterThanOrEqualTo(String value) {
            addCriterion("app_hash >=", value, "appHash");
            return (Criteria) this;
        }

        public Criteria andAppHashLessThan(String value) {
            addCriterion("app_hash <", value, "appHash");
            return (Criteria) this;
        }

        public Criteria andAppHashLessThanOrEqualTo(String value) {
            addCriterion("app_hash <=", value, "appHash");
            return (Criteria) this;
        }

        public Criteria andAppHashLike(String value) {
            addCriterion("app_hash like", value, "appHash");
            return (Criteria) this;
        }

        public Criteria andAppHashNotLike(String value) {
            addCriterion("app_hash not like", value, "appHash");
            return (Criteria) this;
        }

        public Criteria andAppHashIn(List<String> values) {
            addCriterion("app_hash in", values, "appHash");
            return (Criteria) this;
        }

        public Criteria andAppHashNotIn(List<String> values) {
            addCriterion("app_hash not in", values, "appHash");
            return (Criteria) this;
        }

        public Criteria andAppHashBetween(String value1, String value2) {
            addCriterion("app_hash between", value1, value2, "appHash");
            return (Criteria) this;
        }

        public Criteria andAppHashNotBetween(String value1, String value2) {
            addCriterion("app_hash not between", value1, value2, "appHash");
            return (Criteria) this;
        }
        
				
        public Criteria andTestConfigIsNull() {
            addCriterion("test_config is null");
            return (Criteria) this;
        }

        public Criteria andTestConfigIsNotNull() {
            addCriterion("test_config is not null");
            return (Criteria) this;
        }

        public Criteria andTestConfigEqualTo(String value) {
            addCriterion("test_config =", value, "testConfig");
            return (Criteria) this;
        }

        public Criteria andTestConfigNotEqualTo(String value) {
            addCriterion("test_config <>", value, "testConfig");
            return (Criteria) this;
        }

        public Criteria andTestConfigGreaterThan(String value) {
            addCriterion("test_config >", value, "testConfig");
            return (Criteria) this;
        }

        public Criteria andTestConfigGreaterThanOrEqualTo(String value) {
            addCriterion("test_config >=", value, "testConfig");
            return (Criteria) this;
        }

        public Criteria andTestConfigLessThan(String value) {
            addCriterion("test_config <", value, "testConfig");
            return (Criteria) this;
        }

        public Criteria andTestConfigLessThanOrEqualTo(String value) {
            addCriterion("test_config <=", value, "testConfig");
            return (Criteria) this;
        }

        public Criteria andTestConfigLike(String value) {
            addCriterion("test_config like", value, "testConfig");
            return (Criteria) this;
        }

        public Criteria andTestConfigNotLike(String value) {
            addCriterion("test_config not like", value, "testConfig");
            return (Criteria) this;
        }

        public Criteria andTestConfigIn(List<String> values) {
            addCriterion("test_config in", values, "testConfig");
            return (Criteria) this;
        }

        public Criteria andTestConfigNotIn(List<String> values) {
            addCriterion("test_config not in", values, "testConfig");
            return (Criteria) this;
        }

        public Criteria andTestConfigBetween(String value1, String value2) {
            addCriterion("test_config between", value1, value2, "testConfig");
            return (Criteria) this;
        }

        public Criteria andTestConfigNotBetween(String value1, String value2) {
            addCriterion("test_config not between", value1, value2, "testConfig");
            return (Criteria) this;
        }
        
				
        public Criteria andProConfigIsNull() {
            addCriterion("pro_config is null");
            return (Criteria) this;
        }

        public Criteria andProConfigIsNotNull() {
            addCriterion("pro_config is not null");
            return (Criteria) this;
        }

        public Criteria andProConfigEqualTo(String value) {
            addCriterion("pro_config =", value, "proConfig");
            return (Criteria) this;
        }

        public Criteria andProConfigNotEqualTo(String value) {
            addCriterion("pro_config <>", value, "proConfig");
            return (Criteria) this;
        }

        public Criteria andProConfigGreaterThan(String value) {
            addCriterion("pro_config >", value, "proConfig");
            return (Criteria) this;
        }

        public Criteria andProConfigGreaterThanOrEqualTo(String value) {
            addCriterion("pro_config >=", value, "proConfig");
            return (Criteria) this;
        }

        public Criteria andProConfigLessThan(String value) {
            addCriterion("pro_config <", value, "proConfig");
            return (Criteria) this;
        }

        public Criteria andProConfigLessThanOrEqualTo(String value) {
            addCriterion("pro_config <=", value, "proConfig");
            return (Criteria) this;
        }

        public Criteria andProConfigLike(String value) {
            addCriterion("pro_config like", value, "proConfig");
            return (Criteria) this;
        }

        public Criteria andProConfigNotLike(String value) {
            addCriterion("pro_config not like", value, "proConfig");
            return (Criteria) this;
        }

        public Criteria andProConfigIn(List<String> values) {
            addCriterion("pro_config in", values, "proConfig");
            return (Criteria) this;
        }

        public Criteria andProConfigNotIn(List<String> values) {
            addCriterion("pro_config not in", values, "proConfig");
            return (Criteria) this;
        }

        public Criteria andProConfigBetween(String value1, String value2) {
            addCriterion("pro_config between", value1, value2, "proConfig");
            return (Criteria) this;
        }

        public Criteria andProConfigNotBetween(String value1, String value2) {
            addCriterion("pro_config not between", value1, value2, "proConfig");
            return (Criteria) this;
        }
        
				
        public Criteria andPublicKeysIsNull() {
            addCriterion("public_keys is null");
            return (Criteria) this;
        }

        public Criteria andPublicKeysIsNotNull() {
            addCriterion("public_keys is not null");
            return (Criteria) this;
        }

        public Criteria andPublicKeysEqualTo(String value) {
            addCriterion("public_keys =", value, "publicKeys");
            return (Criteria) this;
        }

        public Criteria andPublicKeysNotEqualTo(String value) {
            addCriterion("public_keys <>", value, "publicKeys");
            return (Criteria) this;
        }

        public Criteria andPublicKeysGreaterThan(String value) {
            addCriterion("public_keys >", value, "publicKeys");
            return (Criteria) this;
        }

        public Criteria andPublicKeysGreaterThanOrEqualTo(String value) {
            addCriterion("public_keys >=", value, "publicKeys");
            return (Criteria) this;
        }

        public Criteria andPublicKeysLessThan(String value) {
            addCriterion("public_keys <", value, "publicKeys");
            return (Criteria) this;
        }

        public Criteria andPublicKeysLessThanOrEqualTo(String value) {
            addCriterion("public_keys <=", value, "publicKeys");
            return (Criteria) this;
        }

        public Criteria andPublicKeysLike(String value) {
            addCriterion("public_keys like", value, "publicKeys");
            return (Criteria) this;
        }

        public Criteria andPublicKeysNotLike(String value) {
            addCriterion("public_keys not like", value, "publicKeys");
            return (Criteria) this;
        }

        public Criteria andPublicKeysIn(List<String> values) {
            addCriterion("public_keys in", values, "publicKeys");
            return (Criteria) this;
        }

        public Criteria andPublicKeysNotIn(List<String> values) {
            addCriterion("public_keys not in", values, "publicKeys");
            return (Criteria) this;
        }

        public Criteria andPublicKeysBetween(String value1, String value2) {
            addCriterion("public_keys between", value1, value2, "publicKeys");
            return (Criteria) this;
        }

        public Criteria andPublicKeysNotBetween(String value1, String value2) {
            addCriterion("public_keys not between", value1, value2, "publicKeys");
            return (Criteria) this;
        }
        
				
        public Criteria andDepIdIsNull() {
            addCriterion("dep_id is null");
            return (Criteria) this;
        }

        public Criteria andDepIdIsNotNull() {
            addCriterion("dep_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepIdEqualTo(Integer value) {
            addCriterion("dep_id =", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotEqualTo(Integer value) {
            addCriterion("dep_id <>", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThan(Integer value) {
            addCriterion("dep_id >", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dep_id >=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThan(Integer value) {
            addCriterion("dep_id <", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThanOrEqualTo(Integer value) {
            addCriterion("dep_id <=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLike(Integer value) {
            addCriterion("dep_id like", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotLike(Integer value) {
            addCriterion("dep_id not like", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdIn(List<Integer> values) {
            addCriterion("dep_id in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotIn(List<Integer> values) {
            addCriterion("dep_id not in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdBetween(Integer value1, Integer value2) {
            addCriterion("dep_id between", value1, value2, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dep_id not between", value1, value2, "depId");
            return (Criteria) this;
        }
        
			
		 public Criteria andLikeQuery(TgAccount record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		}
			if(record.getNickName()!=null&&StrUtil.isNotEmpty(record.getNickName().toString())) {
    			 list.add("ifnull(nick_name,'')");
    		}
			if(record.getAccount()!=null&&StrUtil.isNotEmpty(record.getAccount().toString())) {
    			 list.add("ifnull(account,'')");
    		}
			if(record.getAppId()!=null&&StrUtil.isNotEmpty(record.getAppId().toString())) {
    			 list.add("ifnull(app_id,'')");
    		}
			if(record.getAppHash()!=null&&StrUtil.isNotEmpty(record.getAppHash().toString())) {
    			 list.add("ifnull(app_hash,'')");
    		}
			if(record.getTestConfig()!=null&&StrUtil.isNotEmpty(record.getTestConfig().toString())) {
    			 list.add("ifnull(test_config,'')");
    		}
			if(record.getProConfig()!=null&&StrUtil.isNotEmpty(record.getProConfig().toString())) {
    			 list.add("ifnull(pro_config,'')");
    		}
			if(record.getPublicKeys()!=null&&StrUtil.isNotEmpty(record.getPublicKeys().toString())) {
    			 list.add("ifnull(public_keys,'')");
    		}
			if(record.getDepId()!=null&&StrUtil.isNotEmpty(record.getDepId().toString())) {
    			 list.add("ifnull(dep_id,'')");
    		}
			if(record.getId()!=null&&StrUtil.isNotEmpty(record.getId().toString())) {
    			list2.add("'%"+record.getId()+"%'");
    		}
			if(record.getNickName()!=null&&StrUtil.isNotEmpty(record.getNickName().toString())) {
    			list2.add("'%"+record.getNickName()+"%'");
    		}
			if(record.getAccount()!=null&&StrUtil.isNotEmpty(record.getAccount().toString())) {
    			list2.add("'%"+record.getAccount()+"%'");
    		}
			if(record.getAppId()!=null&&StrUtil.isNotEmpty(record.getAppId().toString())) {
    			list2.add("'%"+record.getAppId()+"%'");
    		}
			if(record.getAppHash()!=null&&StrUtil.isNotEmpty(record.getAppHash().toString())) {
    			list2.add("'%"+record.getAppHash()+"%'");
    		}
			if(record.getTestConfig()!=null&&StrUtil.isNotEmpty(record.getTestConfig().toString())) {
    			list2.add("'%"+record.getTestConfig()+"%'");
    		}
			if(record.getProConfig()!=null&&StrUtil.isNotEmpty(record.getProConfig().toString())) {
    			list2.add("'%"+record.getProConfig()+"%'");
    		}
			if(record.getPublicKeys()!=null&&StrUtil.isNotEmpty(record.getPublicKeys().toString())) {
    			list2.add("'%"+record.getPublicKeys()+"%'");
    		}
			if(record.getDepId()!=null&&StrUtil.isNotEmpty(record.getDepId().toString())) {
    			list2.add("'%"+record.getDepId()+"%'");
    		}
        	buffer.append(" CONCAT(");
	        buffer.append(StrUtil.join(",",list));
        	buffer.append(")");
        	buffer.append(" like CONCAT(");
        	buffer.append(StrUtil.join(",",list2));
        	buffer.append(")");
        	if(!" CONCAT() like CONCAT()".equals(buffer.toString())) {
        		addCriterion(buffer.toString());
        	}
        	return (Criteria) this;
        }
        
        public Criteria andLikeQuery2(String searchText) {
		 	List<String> list= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
    		list.add("ifnull(id,'')");
    		list.add("ifnull(nick_name,'')");
    		list.add("ifnull(account,'')");
    		list.add("ifnull(app_id,'')");
    		list.add("ifnull(app_hash,'')");
    		list.add("ifnull(test_config,'')");
    		list.add("ifnull(pro_config,'')");
    		list.add("ifnull(public_keys,'')");
    		list.add("ifnull(dep_id,'')");
        	buffer.append(" CONCAT(");
	        buffer.append(StrUtil.join(",",list));
        	buffer.append(")");
        	buffer.append("like '%");
        	buffer.append(searchText);
        	buffer.append("%'");
        	addCriterion(buffer.toString());
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