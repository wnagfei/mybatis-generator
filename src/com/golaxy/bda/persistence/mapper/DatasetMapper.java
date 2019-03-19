package com.golaxy.bda.persistence.mapper;

import com.golaxy.bda.persistence.entity.Dataset;
import com.golaxy.bda.persistence.entity.DatasetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatasetMapper {
    int countByExample(DatasetExample example);

    int deleteByExample(DatasetExample example);

    int deleteByPrimaryKey(String id);

    int insert(Dataset record);

    int insertSelective(Dataset record);

    List<Dataset> selectByExample(DatasetExample example);

    Dataset selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Dataset record, @Param("example") DatasetExample example);

    int updateByExample(@Param("record") Dataset record, @Param("example") DatasetExample example);

    int updateByPrimaryKeySelective(Dataset record);

    int updateByPrimaryKey(Dataset record);
}