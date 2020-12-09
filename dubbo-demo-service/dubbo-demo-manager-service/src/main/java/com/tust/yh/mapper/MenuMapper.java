package com.tust.yh.mapper;

import com.tust.yh.entity.Menu;
import java.util.List;

public interface MenuMapper {
    int deleteByPrimaryKey(Long menuId);

    int insert(Menu record);

    Menu selectByPrimaryKey(Long menuId);

    List<Menu> selectAll();

    int updateByPrimaryKey(Menu record);
}