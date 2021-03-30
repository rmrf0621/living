package com.fc.bot.service;

import java.util.List;
import java.util.Arrays;

import com.fc.bot.mapper.TgBotMapper;
import com.fc.bot.model.TgBot;
import com.fc.bot.model.TgBotVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;
import com.fc.v2.common.base.BaseService;
import com.fc.v2.common.support.ConvertUtil;
import com.fc.v2.model.custom.Tablepar;

/**
 * telegram机器人 TgBotService
 * @Title: TgBotService.java 
 * @Package com.fc.v2.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2021-02-07 14:41:01  
 **/
@Service
public class TgBotService implements BaseService<TgBot, TgBotVo>{
	@Autowired
	private TgBotMapper tgBotMapper;
	
      	   	      	      	      	
	/**
	 * 分页查询
	 * @return
	 */
	 public PageInfo<TgBot> list(Tablepar tablepar,TgBot tgBot){
	        TgBotVo tgBotVo = new TgBotVo();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	tgBotVo.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	tgBotVo.createCriteria().andLikeQuery(tgBot);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<TgBot> list= tgBotMapper.selectByVo(tgBotVo);
	        PageInfo<TgBot> pageInfo = new PageInfo<TgBot>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
					
			Integer[] integers = ConvertUtil.toIntArray(",", ids);
			List<Integer> stringB = Arrays.asList(integers);
			TgBotVo example=new TgBotVo();
			example.createCriteria().andIdIn(stringB);
			return tgBotMapper.deleteByVo(example);
			
				
	}
	
	
	@Override
	public TgBot selectByPrimaryKey(String id) {
				
			Integer id1 = Integer.valueOf(id);
			return tgBotMapper.selectByPrimaryKey(id1);
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(TgBot record) {
		return tgBotMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(TgBot record) {
				
		record.setId(null);
		
				
		return tgBotMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(TgBot record, TgBotVo example) {
		
		return tgBotMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(TgBot record, TgBotVo example) {
		
		return tgBotMapper.updateByVo(record, example);
	}

	@Override
	public List<TgBot> selectByExample(TgBotVo example) {
		
		return tgBotMapper.selectByVo(example);
	}

	
	@Override
	public long countByExample(TgBotVo example) {
		
		return tgBotMapper.countByVo(example);
	}

	
	@Override
	public int deleteByExample(TgBotVo example) {
		
		return tgBotMapper.deleteByVo(example);
	}


}
