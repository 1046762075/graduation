package com.gq.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.gq.entity.Log;
import org.apache.ibatis.annotations.Mapper;

@Mapper
/**
 * 数据访问层
 */
public interface LogMapper extends BaseMapper<Log> {

}
