package com.fc.bot.mapper;

import java.util.List;

import com.fc.bot.model.TgBofeatures;
import com.fc.bot.model.TgBofeaturesVo;
import org.apache.ibatis.annotations.Param;

/**
 * 机器人功能列表 TgBofeaturesMapper
 *
 * @author fuce_自动生成
 * @email ${email}
 * @date 2021-02-09 15:12:35
 */
public interface TgBofeaturesMapper {

    long countByVo(TgBofeaturesVo example);

    int deleteByVo(TgBofeaturesVo example);

    int deleteByPrimaryKey(Integer id);

    int insert(TgBofeatures record);

    int insertSelective(TgBofeatures record);

    List<TgBofeatures> selectByVo(TgBofeaturesVo example);

    TgBofeatures selectByPrimaryKey(Integer id);

    int updateByVoSelective(@Param("record") TgBofeatures record, @Param("example") TgBofeaturesVo example);

    int updateByExample(@Param("record") TgBofeatures record, @Param("example") TgBofeaturesVo example);

    int updateByPrimaryKeySelective(TgBofeatures record);

    int updateByPrimaryKey(TgBofeatures record);

}