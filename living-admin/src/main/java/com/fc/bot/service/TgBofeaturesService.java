package com.fc.bot.service;

import java.util.List;
import java.util.Arrays;

import com.fc.bot.mapper.TgBofeaturesMapper;
import com.fc.bot.model.TgBofeatures;
import com.fc.bot.model.TgBofeaturesVo;
import com.fc.v2.common.base.BaseService;
import com.fc.v2.common.support.ConvertUtil;
import com.fc.v2.model.custom.Tablepar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.core.util.StrUtil;

/**
 * 机器人功能列表 TgBofeaturesService
 * @Title: TgBofeaturesService.java 
 * @Package com.fc.bot.service 
 * @author fuce_自动生成
 * @email ${email}
 * @date 2021-02-09 15:12:35  
 **/
@Service
public class TgBofeaturesService implements BaseService<TgBofeatures, TgBofeaturesVo> {
	@Autowired
	private TgBofeaturesMapper tgBofeaturesMapper;
	
      	   	      	      	      	      	
	/**
	 * 分页查询
	 * @return
	 */
	 public PageInfo<TgBofeatures> list(Tablepar tablepar, TgBofeatures tgBofeatures){
	        TgBofeaturesVo testExample=new TgBofeaturesVo();
			//搜索
			if(StrUtil.isNotEmpty(tablepar.getSearchText())) {//小窗体
	        	testExample.createCriteria().andLikeQuery2(tablepar.getSearchText());
	        }else {//大搜索
	        	testExample.createCriteria().andLikeQuery(tgBofeatures);
	        }
			//表格排序
			//if(StrUtil.isNotEmpty(tablepar.getOrderByColumn())) {
	        //	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        //}else{
	        //	testExample.setOrderByClause("id ASC");
	        //}
	        PageHelper.startPage(tablepar.getPage(), tablepar.getLimit());
	        List<TgBofeatures> list= tgBofeaturesMapper.selectByVo(testExample);
	        PageInfo<TgBofeatures> pageInfo = new PageInfo<TgBofeatures>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
					
			Integer[] integers = ConvertUtil.toIntArray(",", ids);
			List<Integer> stringB = Arrays.asList(integers);
			TgBofeaturesVo example=new TgBofeaturesVo();
			example.createCriteria().andIdIn(stringB);
			return tgBofeaturesMapper.deleteByVo(example);
			
				
	}
	
	
	@Override
	public TgBofeatures selectByPrimaryKey(String id) {
				
			Integer id1 = Integer.valueOf(id);
			return tgBofeaturesMapper.selectByPrimaryKey(id1);
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(TgBofeatures record) {
		return tgBofeaturesMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(TgBofeatures record) {
				
		record.setId(null);
		
				
		return tgBofeaturesMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(TgBofeatures record, TgBofeaturesVo example) {
		
		return tgBofeaturesMapper.updateByVoSelective(record, example);
	}

	
	@Override
	public int updateByExample(TgBofeatures record, TgBofeaturesVo example) {
		
		return tgBofeaturesMapper.updateByExample(record, example);
	}

	@Override
	public List<TgBofeatures> selectByExample(TgBofeaturesVo example) {
		
		return tgBofeaturesMapper.selectByVo(example);
	}

	
	@Override
	public long countByExample(TgBofeaturesVo example) {
		
		return tgBofeaturesMapper.countByVo(example);
	}

	
	@Override
	public int deleteByExample(TgBofeaturesVo example) {
		
		return tgBofeaturesMapper.deleteByVo(example);
	}


}
