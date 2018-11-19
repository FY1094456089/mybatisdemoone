package com.aaa.mb.dao;

import com.aaa.mb.entity.Dept;

import java.util.List;

/**
 * className:DeptDao
 * discriptoin:部门dao接口
 * author:fy
 * createTime:2018-11-03 16:19
 */
public interface DeptDao {
    /**
     * 获取部门列表
     * @return
     */
    List<Dept> getList();

    /**
     * 部门添加
     * @param dept
     * @return
     */
    int add(Dept dept);

    /**
     * 根据部门编号查部门信息
     * @param deptNo
     * @return
     */
    Dept getById(int deptNo);

    /**
     * 更新
     * @param dept
     * @return
     */
    int update(Dept dept);

    /**
     * 删除
     * @param deptNo
     * @return
     */
    int delete(int deptNo);

    /**
     * mynbatis高级映射一对多
     * @return
     */
    List<Dept> oneToMany();
}
