package com.pinkong.mapper;

import com.pinkong.model.CmsHelpCategory;
import com.pinkong.model.CmsHelpCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsHelpCategoryMapper {
    long countByExample(CmsHelpCategoryExample example);

    int deleteByExample(CmsHelpCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsHelpCategory record);

    int insertSelective(CmsHelpCategory record);

    List<CmsHelpCategory> selectByExample(CmsHelpCategoryExample example);

    CmsHelpCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsHelpCategory record, @Param("example") CmsHelpCategoryExample example);

    int updateByExample(@Param("record") CmsHelpCategory record, @Param("example") CmsHelpCategoryExample example);

    int updateByPrimaryKeySelective(CmsHelpCategory record);

    int updateByPrimaryKey(CmsHelpCategory record);
}