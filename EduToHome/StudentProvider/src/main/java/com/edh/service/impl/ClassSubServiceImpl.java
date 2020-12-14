package com.edh.service.impl;

import com.edh.dao.ClassSubDao;
import com.edh.entity.ClassSub;
import com.edh.service.ClassSubService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ClassSub)表服务实现类
 *
 * @author makejava
 * @since 2020-12-14 16:29:34
 */
@Service("classSubService")
public class ClassSubServiceImpl implements ClassSubService {
    @Resource
    private ClassSubDao classSubDao;

    @Override
    public List<ClassSub> getClassSubByCid(Integer cid) {
        return classSubDao.getClassSubByCid(cid);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param csid 主键
     * @return 实例对象
     */
    @Override
    public ClassSub queryById(Integer csid) {
        return this.classSubDao.queryById(csid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ClassSub> queryAllByLimit(int offset, int limit) {
        return this.classSubDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param classSub 实例对象
     * @return 实例对象
     */
    @Override
    public ClassSub insert(ClassSub classSub) {
        this.classSubDao.insert(classSub);
        return classSub;
    }

    /**
     * 修改数据
     *
     * @param classSub 实例对象
     * @return 实例对象
     */
    @Override
    public ClassSub update(ClassSub classSub) {
        this.classSubDao.update(classSub);
        return this.queryById(classSub.getCsid());
    }

    /**
     * 通过主键删除数据
     *
     * @param csid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer csid) {
        return this.classSubDao.deleteById(csid) > 0;
    }
}