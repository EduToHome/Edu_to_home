package com.edh.service.impl;

import com.edh.dao.ContentDao;
import com.edh.entity.Content;
import com.edh.service.ContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Content)表服务实现类
 *
 * @author makejava
 * @since 2020-12-12 14:26:06
 */
@Service("contentService")
public class ContentServiceImpl implements ContentService {
    @Resource
    private ContentDao contentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param coid 主键
     * @return 实例对象
     */
    @Override
    public Content queryById(Integer coid) {
        return this.contentDao.queryById(coid);
    }

    @Override
    public List<Content> queryAll(Content content) {
        return contentDao.queryAll(content);
    }

    /**
     * 新增数据
     *
     * @param content 实例对象
     * @return 实例对象
     */
    @Override
    public Content insert(Content content) {
        this.contentDao.insert(content);
        return content;
    }

    /**
     * 修改数据
     *
     * @param content 实例对象
     * @return 实例对象
     */
    @Override
    public Content update(Content content) {
        this.contentDao.update(content);
        return this.queryById(content.getCoid());
    }

    /**
     * 通过主键删除数据
     *
     * @param coid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer coid) {
        return this.contentDao.deleteById(coid) > 0;
    }
}