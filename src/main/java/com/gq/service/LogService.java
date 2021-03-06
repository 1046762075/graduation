package com.gq.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.gq.entity.Log;

public interface LogService {
    /**
     * 分页查询
     *
     */
    Page<Log> selectPage(Log Log, int page, int limit);

    /**
     * 新增
     *
     */
    boolean insert(String operation);

    /**
     * 删除
     */
    boolean delById(String id);


}
