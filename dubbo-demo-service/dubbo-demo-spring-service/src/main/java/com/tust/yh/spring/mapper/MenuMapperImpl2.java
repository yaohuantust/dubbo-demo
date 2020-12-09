package com.tust.yh.spring.mapper;

import com.tust.yh.spring.entity.Menu;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class MenuMapperImpl2 extends SqlSessionDaoSupport implements MenuMapper  {


    @Override
    public int deleteByPrimaryKey(Long menuId) {
        return 0;
    }

    @Override
    public int insert(Menu record) {
        return 0;
    }

    @Override
    public Menu selectByPrimaryKey(Long menuId) {
        return null;
    }

    @Override
    public List<Menu> selectAll() {
        return getSqlSession().getMapper(MenuMapper.class).selectAll();
    }

    @Override
    public int updateByPrimaryKey(Menu record) {
        return 0;
    }
}
