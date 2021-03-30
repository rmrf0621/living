package com.fc.bot.mapper;

import com.fc.bot.model.TgAccount;
import com.fc.bot.model.TgAccountVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * tg账号设置 TgAccountMapper
 * @author fuce_自动生成
 * @email ${email}
 * @date 2021-02-07 14:41:00
 */
public interface TgAccountMapper {
      	   	      	      	      	      	      	      	      	      
    long countByVo(TgAccountVo example);

    int deleteByVo(TgAccountVo example);
		
    int deleteByPrimaryKey(Integer id);
		
    int insert(TgAccount record);

    int insertSelective(TgAccount record);

    List<TgAccount> selectByVo(TgAccountVo example);
		
    TgAccount selectByPrimaryKey(Integer id);
		
    int updateByExampleSelective(@Param("record") TgAccount record, @Param("example") TgAccountVo example);

    int updateByVo(@Param("record") TgAccount record, @Param("example") TgAccountVo example);
		
    int updateByPrimaryKeySelective(TgAccount record);

    int updateByPrimaryKey(TgAccount record);
  	  	
}