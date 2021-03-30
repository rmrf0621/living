package com.fc.bot.service;

import java.util.List;
import java.util.Arrays;

import com.fc.bot.mapper.TgGroupMapper;
import com.fc.bot.model.TgGroup;
import com.fc.bot.model.TgGroupVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.v2.common.base.BaseService;
import com.fc.v2.common.support.ConvertUtil;
import com.fc.v2.model.custom.Tablepar;

/**
 * tg群组 TgGroupService
 * @Title: TgGroupService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2021-02-07 14:40:55  
 **/
@Service
public class TgGroupService implements BaseService<TgGroup, TgGroupVo>{
	@Autowired
	private TgGroupMapper tgGroupMapper;
	
      	   	      	      	      	      	
	/**
	 * 分页查询
	 * @return
	 */
	 public PageInfo<TgGroup> list(Tablepar tablepar,TgGroup tgGroup){
	        TgGroupVo testExample=new TgGroupVo();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(tgGroup);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<TgGroup> list= tgGroupMapper.selectByVo(testExample);
	        PageInfo<TgGroup> pageInfo = new PageInfo<TgGroup>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
					
			Integer[] integers = ConvertUtil.toIntArray(",", ids);
			List<Integer> stringB = Arrays.asList(integers);
			TgGroupVo example=new TgGroupVo();
			example.createCriteria().andIdIn(stringB);
			return tgGroupMapper.deleteByVo(example);
			
				
	}
	
	
	@Override
	public TgGroup selectByPrimaryKey(String id) {
				
			Integer id1 = Integer.valueOf(id);
			return tgGroupMapper.selectByPrimaryKey(id1);
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(TgGroup record) {
		return tgGroupMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(TgGroup record) {
				
		record.setId(null);
		
				
		return tgGroupMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(TgGroup record, TgGroupVo example) {
		
		return tgGroupMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(TgGroup record, TgGroupVo example) {
		
		return tgGroupMapper.updateByVo(record, example);
	}

	@Override
	public List<TgGroup> selectByExample(TgGroupVo example) {
		
		return tgGroupMapper.selectByVo(example);
	}

	
	@Override
	public long countByExample(TgGroupVo example) {
		
		return tgGroupMapper.countByVo(example);
	}

	
	@Override
	public int deleteByExample(TgGroupVo example) {
		
		return tgGroupMapper.deleteByVo(example);
	}


}
