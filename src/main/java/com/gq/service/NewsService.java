package com.gq.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.gq.entity.News;

public interface NewsService {
    /**
     * 分页查询
     *
     */
    Page<News> selectPage(News news, int page, int limit);

    /**
     * 新增
     *
     */
    boolean insert(News news);

    /**
     * 删除
     */
    boolean delById(String id);

    boolean editById(News news);

    News getOneById(String id);


}
