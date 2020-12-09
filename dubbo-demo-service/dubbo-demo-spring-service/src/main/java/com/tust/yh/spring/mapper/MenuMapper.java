package com.tust.yh.spring.mapper;

import com.tust.yh.spring.entity.Menu;

import java.util.List;

public interface MenuMapper {
    int deleteByPrimaryKey(Long menuId);

    int insert(Menu record);

    Menu selectByPrimaryKey(Long menuId);

    List<Menu> selectAll();

    int updateByPrimaryKey(Menu record);
}