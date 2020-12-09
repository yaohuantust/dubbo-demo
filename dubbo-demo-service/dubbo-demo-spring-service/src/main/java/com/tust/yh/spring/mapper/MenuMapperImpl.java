package com.tust.yh.spring.mapper;

import com.tust.yh.spring.entity.Menu;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class MenuMapperImpl implements MenuMapper {


    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    private SqlSessionTemplate sqlSession;
    
    

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
        return sqlSession.getMapper(MenuMapper.class).selectAll();
    }

    @Override
    public int updateByPrimaryKey(Menu record) {
        return 0;
    }
}
