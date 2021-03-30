package com.fc.bot.mapper;

import com.fc.bot.model.TgGroup;
import com.fc.bot.model.TgGroupVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * tg群组 TgGroupMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2021-02-07 19:17:53
 */
public interface TgGroupMapper {
      	   	      	      	      	      	      	      	      
    long countByVo(TgGroupVo example);

    int deleteByVo(TgGroupVo example);
		
    int deleteByPrimaryKey(Integer id);
		
    int insert(TgGroup record);

    int insertSelective(TgGroup record);

    List<TgGroup> selectByVo(TgGroupVo example);
		
    TgGroup selectByPrimaryKey(Integer id);
		
    int updateByExampleSelective(@Param("record") TgGroup record, @Param("example") TgGroupVo example);

    int updateByVo(@Param("record") TgGroup record, @Param("example") TgGroupVo example);
		
    int updateByPrimaryKeySelective(TgGroup record);

    int updateByPrimaryKey(TgGroup record);
  	  	
}