package com.tust.yh.spring.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Menu implements Serializable {
    private Long menuId;

    private String menuName;

    private Long parentId;

    private BigDecimal status;

    private BigDecimal type;

    private String url;

    private BigDecimal target;

    private BigDecimal sort;

    private String remark;

    private String icon;

    private String homePageName;

    private static final long serialVersionUID = 1L;

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public BigDecimal getType() {
        return type;
    }

    public void setType(BigDecimal type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public BigDecimal getTarget() {
        return target;
    }

    public void setTarget(BigDecimal target) {
        this.target = target;
    }

    public BigDecimal getSort() {
        return sort;
    }

    public void setSort(BigDecimal sort) {
        this.sort = sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getHomePageName() {
        return homePageName;
    }

    public void setHomePageName(String homePageName) {
        this.homePageName = homePageName == null ? null : homePageName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuId=").append(menuId);
        sb.append(", menuName=").append(menuName);
        sb.append(", parentId=").append(parentId);
        sb.append(", status=").append(status);
        sb.append(", type=").append(type);
        sb.append(", url=").append(url);
        sb.append(", target=").append(target);
        sb.append(", sort=").append(sort);
        sb.append(", remark=").append(remark);
        sb.append(", icon=").append(icon);
        sb.append(", homePageName=").append(homePageName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}