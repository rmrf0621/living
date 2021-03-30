package com.fc.bot.mapper;

import com.fc.bot.model.TgBot;
import com.fc.bot.model.TgBotVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * telegram机器人 TgBotMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2021-02-07 14:41:01
 */
public interface TgBotMapper {
      	   	      	      	      
    long countByVo(TgBotVo example);

    int deleteByVo(TgBotVo example);
		
    int deleteByPrimaryKey(Integer id);
		
    int insert(TgBot record);

    int insertSelective(TgBot record);

    List<TgBot> selectByVo(TgBotVo tgBotVo);
		
    TgBot selectByPrimaryKey(Integer id);
		
    int updateByExampleSelective(@Param("record") TgBot record, @Param("example") TgBotVo example);

    int updateByVo(@Param("record") TgBot record, @Param("example") TgBotVo example);
		
    int updateByPrimaryKeySelective(TgBot record);

    int updateByPrimaryKey(TgBot record);
  	  	
}