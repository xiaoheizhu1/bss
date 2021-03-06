package com.example.bss.pojo;

import java.io.Serializable;

public class BssProjectPrice implements Serializable {
    /**
     * 
     * 表字段 : bss_project_price.id
     */
    private Integer id;

    /**
     * 所在项目id
     * 表字段 : bss_project_price.project_id
     */
    private Integer projectId;

    /**
     * 单价
     * 表字段 : bss_project_price.dj
     */
    private String dj;

    /**
     * 数量
     * 表字段 : bss_project_price.sl
     */
    private String sl;

    /**
     * 总预算金额
     * 表字段 : bss_project_price.zysje
     */
    private String zysje;

    /**
     * 19年新增
     * 表字段 : bss_project_price.xz_19
     */
    private String xz19;

    /**
     * 18年递延
     * 表字段 : bss_project_price.dy_18
     */
    private String dy18;

    /**
     * 已支付
     * 表字段 : bss_project_price.yzf
     */
    private String yzf;

    /**
     * 
     * 表字段 : bss_project_price.bz
     */
    private String bz;

    /**
     * 预留字段1
     * 表字段 : bss_project_price.reserved1
     */
    private String reserved1;

    /**
     *状态
     * 表字段 : bss_project_price.status
     */
    private String status;

    /**
     * 创建时间
     * 表字段 : bss_project_price.create_time
     */
    private String createTime;

    /**
     * 修改时间
     * 表字段 : bss_project_price.update_time
     */
    private String updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bss_project_price
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:bss_project_price.id
     *
     * @return bss_project_price.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:bss_project_price.id
     *
     * @param id the value for bss_project_price.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 所在项目id 字段:bss_project_price.project_id
     *
     * @return bss_project_price.project_id, 所在项目id
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * 设置 所在项目id 字段:bss_project_price.project_id
     *
     * @param projectId the value for bss_project_price.project_id, 所在项目id
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取 单价 字段:bss_project_price.dj
     *
     * @return bss_project_price.dj, 单价
     */
    public String getDj() {
        return dj;
    }

    /**
     * 设置 单价 字段:bss_project_price.dj
     *
     * @param dj the value for bss_project_price.dj, 单价
     */
    public void setDj(String dj) {
        this.dj = dj == null ? null : dj.trim();
    }

    /**
     * 获取 数量 字段:bss_project_price.sl
     *
     * @return bss_project_price.sl, 数量
     */
    public String getSl() {
        return sl;
    }

    /**
     * 设置 数量 字段:bss_project_price.sl
     *
     * @param sl the value for bss_project_price.sl, 数量
     */
    public void setSl(String sl) {
        this.sl = sl == null ? null : sl.trim();
    }

    /**
     * 获取 总预算金额 字段:bss_project_price.zysje
     *
     * @return bss_project_price.zysje, 总预算金额
     */
    public String getZysje() {
        return zysje;
    }

    /**
     * 设置 总预算金额 字段:bss_project_price.zysje
     *
     * @param zysje the value for bss_project_price.zysje, 总预算金额
     */
    public void setZysje(String zysje) {
        this.zysje = zysje == null ? null : zysje.trim();
    }

    /**
     * 获取 19年新增 字段:bss_project_price.xz_19
     *
     * @return bss_project_price.xz_19, 19年新增
     */
    public String getXz19() {
        return xz19;
    }

    /**
     * 设置 19年新增 字段:bss_project_price.xz_19
     *
     * @param xz19 the value for bss_project_price.xz_19, 19年新增
     */
    public void setXz19(String xz19) {
        this.xz19 = xz19 == null ? null : xz19.trim();
    }

    /**
     * 获取 18年递延 字段:bss_project_price.dy_18
     *
     * @return bss_project_price.dy_18, 18年递延
     */
    public String getDy18() {
        return dy18;
    }

    /**
     * 设置 18年递延 字段:bss_project_price.dy_18
     *
     * @param dy18 the value for bss_project_price.dy_18, 18年递延
     */
    public void setDy18(String dy18) {
        this.dy18 = dy18 == null ? null : dy18.trim();
    }

    /**
     * 获取 已支付 字段:bss_project_price.yzf
     *
     * @return bss_project_price.yzf, 已支付
     */
    public String getYzf() {
        return yzf;
    }

    /**
     * 设置 已支付 字段:bss_project_price.yzf
     *
     * @param yzf the value for bss_project_price.yzf, 已支付
     */
    public void setYzf(String yzf) {
        this.yzf = yzf == null ? null : yzf.trim();
    }

    /**
     * 获取  字段:bss_project_price.bz
     *
     * @return bss_project_price.bz, 
     */
    public String getBz() {
        return bz;
    }

    /**
     * 设置  字段:bss_project_price.bz
     *
     * @param bz the value for bss_project_price.bz, 
     */
    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    /**
     * 获取 预留字段1 字段:bss_project_price.reserved1
     *
     * @return bss_project_price.reserved1, 预留字段1
     */
    public String getReserved1() {
        return reserved1;
    }

    /**
     * 设置 预留字段1 字段:bss_project_price.reserved1
     *
     * @param reserved1 the value for bss_project_price.reserved1, 预留字段1
     */
    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1 == null ? null : reserved1.trim();
    }

    /**
     * 获取 预留字段2 字段:bss_project_price.status
     *
     * @return bss_project_price.status, 预留字段2
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置 预留字段2 字段:bss_project_price.status
     *
     * @param status the value for bss_project_price.status, 预留字段2
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取 创建时间 字段:bss_project_price.create_time
     *
     * @return bss_project_price.create_time, 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:bss_project_price.create_time
     *
     * @param createTime the value for bss_project_price.create_time, 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * 获取 修改时间 字段:bss_project_price.update_time
     *
     * @return bss_project_price.update_time, 修改时间
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 修改时间 字段:bss_project_price.update_time
     *
     * @param updateTime the value for bss_project_price.update_time, 修改时间
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}