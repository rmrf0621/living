package com.fc.bot.service;

import java.util.List;
import java.util.Arrays;

import com.fc.bot.mapper.TgAccountMapper;
import com.fc.bot.model.TgAccount;
import com.fc.bot.model.TgAccountVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.v2.common.base.BaseService;
import com.fc.v2.common.support.ConvertUtil;
import com.fc.v2.model.custom.Tablepar;

/**
 * tg账号设置 TgAccountService
 * @Title: TgAccountService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2021-02-07 14:41:00  
 **/
@Service
public class TgAccountService implements BaseService<TgAccount, TgAccountVo>{
	@Autowired
	private TgAccountMapper tgAccountMapper;
	
      	   	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @return
	 */
	 public PageInfo<TgAccount> list(Tablepar tablepar,TgAccount tgAccount){
	        TgAccountVo testExample=new TgAccountVo();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(tgAccount);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<TgAccount> list= tgAccountMapper.selectByVo(testExample);
	        PageInfo<TgAccount> pageInfo = new PageInfo<TgAccount>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
					
			Integer[] integers = ConvertUtil.toIntArray(",", ids);
			List<Integer> stringB = Arrays.asList(integers);
			TgAccountVo example=new TgAccountVo();
			example.createCriteria().andIdIn(stringB);
			return tgAccountMapper.deleteByVo(example);
			
				
	}
	
	
	@Override
	public TgAccount selectByPrimaryKey(String id) {
				
			Integer id1 = Integer.valueOf(id);
			return tgAccountMapper.selectByPrimaryKey(id1);
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(TgAccount record) {
		return tgAccountMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(TgAccount record) {
				
		record.setId(null);
		
				
		return tgAccountMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(TgAccount record, TgAccountVo example) {
		
		return tgAccountMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(TgAccount record, TgAccountVo example) {
		
		return tgAccountMapper.updateByVo(record, example);
	}

	@Override
	public List<TgAccount> selectByExample(TgAccountVo example) {
		
		return tgAccountMapper.selectByVo(example);
	}

	
	@Override
	public long countByExample(TgAccountVo example) {
		
		return tgAccountMapper.countByVo(example);
	}

	
	@Override
	public int deleteByExample(TgAccountVo example) {
		
		return tgAccountMapper.deleteByVo(example);
	}


}
