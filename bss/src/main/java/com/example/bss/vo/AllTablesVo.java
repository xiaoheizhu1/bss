package com.example.bss.vo;

import java.io.Serializable;

public class AllTablesVo implements Serializable {
    /**
     * 主键id
     * 表字段 : bss_project_info.id
     */
    private Integer id;

    /**
     * 类型
     * 表字段 : bss_project_info.xmlx
     */
    private String xmlx;

    /**
     * 项目名称
     * 表字段 : bss_project_info.xmmc
     */
    private String xmmc;

    /**
     * 项目说明
     * 表字段 : bss_project_info.xmsm
     */
    private String xmsm;

    /**
     * 所属地
     * 表字段 : bss_project_info.ssd
     */
    private String ssd;

    /**
     * 负责人
     * 表字段 : bss_project_info.fzr
     */
    private Integer fzr;

    /**
     * 财务科目归类
     * 表字段 : bss_project_info.cwkmgl
     */
    private String cwkmgl;

    /**
     * 是否立项
     * 表字段 : bss_project_info.sflx
     */
    private String sflx;

    /**
     * 项目分类
     * 表字段 : bss_project_info.xmfl
     */
    private Integer xmfl;

    /**
     * 费用归属部门
     * 表字段 : bss_project_info.fygsbm
     */
    private Integer fygsbm;

    /**
     * 属性
     * 表字段 : bss_project_info.sx
     */
    private String sx;

    /**
     * 确定性
     * 表字段 : bss_project_info.qdx
     */
    private String qdx;

    /**
     * 供应商
     * 表字段 : bss_project_info.gys
     */
    private Integer gys;

    /**
     * 对应业务
     * 表字段 : bss_project_info.dyyw
     */
    private String dyyw;

    /**
     * 必要优先级
     * 表字段 : bss_project_info.byyxj
     */
    private String byyxj;

    /**
     * 对应业务板块
     * 表字段 : bss_project_info.dyywbk
     */
    private String dyywbk;

    /**
     * 支出方式 (0:资本性支出 1:费用性支出)
     * 表字段 : bss_project_info.zcfs
     */
    private String zcfs;

    /**
     * IT建设费用
     * 表字段 : bss_project_info.itjsfy
     */
    private String itjsfy;

    /**
     * IT运维成本
     * 表字段 : bss_project_info.itywcb
     */
    private String itywcb;

    /**
     * 往年预算移至今年预算
     * 表字段 : bss_project_info.wnysyzjnys
     */
    private String wnysyzjnys;

    /**
     * 创新业务拓展预算
     * 表字段 : bss_project_info.cxywkzys
     */
    private String cxywkzys;

    /**
     * 固定刚性支出
     * 表字段 : bss_project_info.gdgxzc
     */
    private String gdgxzc;

    /**
     * 助力业务增长
     * 表字段 : bss_project_info.zlywzz
     */
    private String zlywzz;

    /**
     * 提升效率
     * 表字段 : bss_project_info.tsxl
     */
    private String tsxl;

    /**
     * 项目属性
     * 表字段 : bss_project_info.xmsx
     */
    private String xmsx;

    /**
     * 创新科研
     * 表字段 : bss_project_info.cxky
     */
    private String cxky;

    /**
     * 其他项目
     * 表字段 : bss_project_info.qtxm
     */
    private String qtxm;

    /**
     * 2019年总预算
     * 表字段 : bss_project_info.zys
     */
    private String zys;

    /**
     * 备注
     * 表字段 : bss_project_info.bz
     */
    private String bz;

    /**
     * 状态:1正常 2草稿
     * 表字段 : bss_project_info.status
     */
    private String status;

    /**
     * 预留字段1
     * 表字段 : bss_project_info.reserved1
     */
    private String reserved1;

    /**
     * 预留字段2
     * 表字段 : bss_project_info.reserved2
     */
    private String reserved2;

    /**
     * 预留字段3
     * 表字段 : bss_project_info.reserved3
     */
    private String reserved3;

    /**
     * 创建时间
     * 表字段 : bss_project_info.create_time
     */
    private String createTime;

    /**
     * 修改时间
     * 表字段 : bss_project_info.update_time
     */
    private String updateTime;
    
    

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bss_project_info
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 主键id 字段:bss_project_info.id
     *
     * @return bss_project_info.id, 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键id 字段:bss_project_info.id
     *
     * @param id the value for bss_project_info.id, 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 类型 字段:bss_project_info.xmlx
     *
     * @return bss_project_info.xmlx, 类型
     */
    public String getXmlx() {
        return xmlx;
    }

    /**
     * 设置 类型 字段:bss_project_info.xmlx
     *
     * @param xmlx the value for bss_project_info.xmlx, 类型
     */
    public void setXmlx(String xmlx) {
        this.xmlx = xmlx == null ? null : xmlx.trim();
    }

    /**
     * 获取 项目名称 字段:bss_project_info.xmmc
     *
     * @return bss_project_info.xmmc, 项目名称
     */
    public String getXmmc() {
        return xmmc;
    }

    /**
     * 设置 项目名称 字段:bss_project_info.xmmc
     *
     * @param xmmc the value for bss_project_info.xmmc, 项目名称
     */
    public void setXmmc(String xmmc) {
        this.xmmc = xmmc == null ? null : xmmc.trim();
    }

    /**
     * 获取 项目说明 字段:bss_project_info.xmsm
     *
     * @return bss_project_info.xmsm, 项目说明
     */
    public String getXmsm() {
        return xmsm;
    }

    /**
     * 设置 项目说明 字段:bss_project_info.xmsm
     *
     * @param xmsm the value for bss_project_info.xmsm, 项目说明
     */
    public void setXmsm(String xmsm) {
        this.xmsm = xmsm == null ? null : xmsm.trim();
    }

    /**
     * 获取 所属地 字段:bss_project_info.ssd
     *
     * @return bss_project_info.ssd, 所属地
     */
    public String getSsd() {
        return ssd;
    }

    /**
     * 设置 所属地 字段:bss_project_info.ssd
     *
     * @param ssd the value for bss_project_info.ssd, 所属地
     */
    public void setSsd(String ssd) {
        this.ssd = ssd == null ? null : ssd.trim();
    }

    /**
     * 获取 负责人 字段:bss_project_info.fzr
     *
     * @return bss_project_info.fzr, 负责人
     */
    public Integer getFzr() {
        return fzr;
    }

    /**
     * 设置 负责人 字段:bss_project_info.fzr
     *
     * @param fzr the value for bss_project_info.fzr, 负责人
     */
    public void setFzr(Integer fzr) {
        this.fzr = fzr;
    }

    /**
     * 获取 财务科目归类 字段:bss_project_info.cwkmgl
     *
     * @return bss_project_info.cwkmgl, 财务科目归类
     */
    public String getCwkmgl() {
        return cwkmgl;
    }

    /**
     * 设置 财务科目归类 字段:bss_project_info.cwkmgl
     *
     * @param cwkmgl the value for bss_project_info.cwkmgl, 财务科目归类
     */
    public void setCwkmgl(String cwkmgl) {
        this.cwkmgl = cwkmgl == null ? null : cwkmgl.trim();
    }

    /**
     * 获取 是否立项 字段:bss_project_info.sflx
     *
     * @return bss_project_info.sflx, 是否立项
     */
    public String getSflx() {
        return sflx;
    }

    /**
     * 设置 是否立项 字段:bss_project_info.sflx
     *
     * @param sflx the value for bss_project_info.sflx, 是否立项
     */
    public void setSflx(String sflx) {
        this.sflx = sflx == null ? null : sflx.trim();
    }

    /**
     * 获取 项目分类 字段:bss_project_info.xmfl
     *
     * @return bss_project_info.xmfl, 项目分类
     */
    public Integer getXmfl() {
        return xmfl;
    }

    /**
     * 设置 项目分类 字段:bss_project_info.xmfl
     *
     * @param xmfl the value for bss_project_info.xmfl, 项目分类
     */
    public void setXmfl(Integer xmfl) {
        this.xmfl = xmfl;
    }

    /**
     * 获取 费用归属部门 字段:bss_project_info.fygsbm
     *
     * @return bss_project_info.fygsbm, 费用归属部门
     */
    public Integer getFygsbm() {
        return fygsbm;
    }

    /**
     * 设置 费用归属部门 字段:bss_project_info.fygsbm
     *
     * @param fygsbm the value for bss_project_info.fygsbm, 费用归属部门
     */
    public void setFygsbm(Integer fygsbm) {
        this.fygsbm = fygsbm;
    }

    /**
     * 获取 属性 字段:bss_project_info.sx
     *
     * @return bss_project_info.sx, 属性
     */
    public String getSx() {
        return sx;
    }

    /**
     * 设置 属性 字段:bss_project_info.sx
     *
     * @param sx the value for bss_project_info.sx, 属性
     */
    public void setSx(String sx) {
        this.sx = sx == null ? null : sx.trim();
    }

    /**
     * 获取 确定性 字段:bss_project_info.qdx
     *
     * @return bss_project_info.qdx, 确定性
     */
    public String getQdx() {
        return qdx;
    }

    /**
     * 设置 确定性 字段:bss_project_info.qdx
     *
     * @param qdx the value for bss_project_info.qdx, 确定性
     */
    public void setQdx(String qdx) {
        this.qdx = qdx == null ? null : qdx.trim();
    }

    /**
     * 获取 供应商 字段:bss_project_info.gys
     *
     * @return bss_project_info.gys, 供应商
     */
    public Integer getGys() {
        return gys;
    }

    /**
     * 设置 供应商 字段:bss_project_info.gys
     *
     * @param gys the value for bss_project_info.gys, 供应商
     */
    public void setGys(Integer gys) {
        this.gys = gys;
    }

    /**
     * 获取 对应业务 字段:bss_project_info.dyyw
     *
     * @return bss_project_info.dyyw, 对应业务
     */
    public String getDyyw() {
        return dyyw;
    }

    /**
     * 设置 对应业务 字段:bss_project_info.dyyw
     *
     * @param dyyw the value for bss_project_info.dyyw, 对应业务
     */
    public void setDyyw(String dyyw) {
        this.dyyw = dyyw == null ? null : dyyw.trim();
    }

    /**
     * 获取 必要优先级 字段:bss_project_info.byyxj
     *
     * @return bss_project_info.byyxj, 必要优先级
     */
    public String getByyxj() {
        return byyxj;
    }

    /**
     * 设置 必要优先级 字段:bss_project_info.byyxj
     *
     * @param byyxj the value for bss_project_info.byyxj, 必要优先级
     */
    public void setByyxj(String byyxj) {
        this.byyxj = byyxj == null ? null : byyxj.trim();
    }

    /**
     * 获取 对应业务板块 字段:bss_project_info.dyywbk
     *
     * @return bss_project_info.dyywbk, 对应业务板块
     */
    public String getDyywbk() {
        return dyywbk;
    }

    /**
     * 设置 对应业务板块 字段:bss_project_info.dyywbk
     *
     * @param dyywbk the value for bss_project_info.dyywbk, 对应业务板块
     */
    public void setDyywbk(String dyywbk) {
        this.dyywbk = dyywbk == null ? null : dyywbk.trim();
    }

    /**
     * 获取 支出方式 (0:资本性支出 1:费用性支出) 字段:bss_project_info.zcfs
     *
     * @return bss_project_info.zcfs, 支出方式 (0:资本性支出 1:费用性支出)
     */
    public String getZcfs() {
        return zcfs;
    }

    /**
     * 设置 支出方式 (0:资本性支出 1:费用性支出) 字段:bss_project_info.zcfs
     *
     * @param zcfs the value for bss_project_info.zcfs, 支出方式 (0:资本性支出 1:费用性支出)
     */
    public void setZcfs(String zcfs) {
        this.zcfs = zcfs == null ? null : zcfs.trim();
    }

    /**
     * 获取 IT建设费用 字段:bss_project_info.itjsfy
     *
     * @return bss_project_info.itjsfy, IT建设费用
     */
    public String getItjsfy() {
        return itjsfy;
    }

    /**
     * 设置 IT建设费用 字段:bss_project_info.itjsfy
     *
     * @param itjsfy the value for bss_project_info.itjsfy, IT建设费用
     */
    public void setItjsfy(String itjsfy) {
        this.itjsfy = itjsfy == null ? null : itjsfy.trim();
    }

    /**
     * 获取 IT运维成本 字段:bss_project_info.itywcb
     *
     * @return bss_project_info.itywcb, IT运维成本
     */
    public String getItywcb() {
        return itywcb;
    }

    /**
     * 设置 IT运维成本 字段:bss_project_info.itywcb
     *
     * @param itywcb the value for bss_project_info.itywcb, IT运维成本
     */
    public void setItywcb(String itywcb) {
        this.itywcb = itywcb == null ? null : itywcb.trim();
    }

    /**
     * 获取 往年预算移至今年预算 字段:bss_project_info.wnysyzjnys
     *
     * @return bss_project_info.wnysyzjnys, 往年预算移至今年预算
     */
    public String getWnysyzjnys() {
        return wnysyzjnys;
    }

    /**
     * 设置 往年预算移至今年预算 字段:bss_project_info.wnysyzjnys
     *
     * @param wnysyzjnys the value for bss_project_info.wnysyzjnys, 往年预算移至今年预算
     */
    public void setWnysyzjnys(String wnysyzjnys) {
        this.wnysyzjnys = wnysyzjnys == null ? null : wnysyzjnys.trim();
    }

    /**
     * 获取 创新业务拓展预算 字段:bss_project_info.cxywkzys
     *
     * @return bss_project_info.cxywkzys, 创新业务拓展预算
     */
    public String getCxywkzys() {
        return cxywkzys;
    }

    /**
     * 设置 创新业务拓展预算 字段:bss_project_info.cxywkzys
     *
     * @param cxywkzys the value for bss_project_info.cxywkzys, 创新业务拓展预算
     */
    public void setCxywkzys(String cxywkzys) {
        this.cxywkzys = cxywkzys == null ? null : cxywkzys.trim();
    }

    /**
     * 获取 固定刚性支出 字段:bss_project_info.gdgxzc
     *
     * @return bss_project_info.gdgxzc, 固定刚性支出
     */
    public String getGdgxzc() {
        return gdgxzc;
    }

    /**
     * 设置 固定刚性支出 字段:bss_project_info.gdgxzc
     *
     * @param gdgxzc the value for bss_project_info.gdgxzc, 固定刚性支出
     */
    public void setGdgxzc(String gdgxzc) {
        this.gdgxzc = gdgxzc == null ? null : gdgxzc.trim();
    }

    /**
     * 获取 助力业务增长 字段:bss_project_info.zlywzz
     *
     * @return bss_project_info.zlywzz, 助力业务增长
     */
    public String getZlywzz() {
        return zlywzz;
    }

    /**
     * 设置 助力业务增长 字段:bss_project_info.zlywzz
     *
     * @param zlywzz the value for bss_project_info.zlywzz, 助力业务增长
     */
    public void setZlywzz(String zlywzz) {
        this.zlywzz = zlywzz == null ? null : zlywzz.trim();
    }

    /**
     * 获取 提升效率 字段:bss_project_info.tsxl
     *
     * @return bss_project_info.tsxl, 提升效率
     */
    public String getTsxl() {
        return tsxl;
    }

    /**
     * 设置 提升效率 字段:bss_project_info.tsxl
     *
     * @param tsxl the value for bss_project_info.tsxl, 提升效率
     */
    public void setTsxl(String tsxl) {
        this.tsxl = tsxl == null ? null : tsxl.trim();
    }

    /**
     * 获取 项目属性 字段:bss_project_info.xmsx
     *
     * @return bss_project_info.xmsx, 项目属性
     */
    public String getXmsx() {
        return xmsx;
    }

    /**
     * 设置 项目属性 字段:bss_project_info.xmsx
     *
     * @param xmsx the value for bss_project_info.xmsx, 项目属性
     */
    public void setXmsx(String xmsx) {
        this.xmsx = xmsx == null ? null : xmsx.trim();
    }

    /**
     * 获取 创新科研 字段:bss_project_info.cxky
     *
     * @return bss_project_info.cxky, 创新科研
     */
    public String getCxky() {
        return cxky;
    }

    /**
     * 设置 创新科研 字段:bss_project_info.cxky
     *
     * @param cxky the value for bss_project_info.cxky, 创新科研
     */
    public void setCxky(String cxky) {
        this.cxky = cxky == null ? null : cxky.trim();
    }

    /**
     * 获取 其他项目 字段:bss_project_info.qtxm
     *
     * @return bss_project_info.qtxm, 其他项目
     */
    public String getQtxm() {
        return qtxm;
    }

    /**
     * 设置 其他项目 字段:bss_project_info.qtxm
     *
     * @param qtxm the value for bss_project_info.qtxm, 其他项目
     */
    public void setQtxm(String qtxm) {
        this.qtxm = qtxm == null ? null : qtxm.trim();
    }

    /**
     * 获取 2019年总预算 字段:bss_project_info.zys
     *
     * @return bss_project_info.zys, 2019年总预算
     */
    public String getZys() {
        return zys;
    }

    /**
     * 设置 2019年总预算 字段:bss_project_info.zys
     *
     * @param zys the value for bss_project_info.zys, 2019年总预算
     */
    public void setZys(String zys) {
        this.zys = zys == null ? null : zys.trim();
    }

    /**
     * 获取 备注 字段:bss_project_info.bz
     *
     * @return bss_project_info.bz, 备注
     */
    public String getBz() {
        return bz;
    }

    /**
     * 设置 备注 字段:bss_project_info.bz
     *
     * @param bz the value for bss_project_info.bz, 备注
     */
    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    /**
     * 获取 状态:1正常 2草稿 字段:bss_project_info.status
     *
     * @return bss_project_info.status, 状态:1正常 2草稿
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置 状态:1正常 2草稿 字段:bss_project_info.status
     *
     * @param status the value for bss_project_info.status, 状态:1正常 2草稿
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取 预留字段1 字段:bss_project_info.reserved1
     *
     * @return bss_project_info.reserved1, 预留字段1
     */
    public String getReserved1() {
        return reserved1;
    }

    /**
     * 设置 预留字段1 字段:bss_project_info.reserved1
     *
     * @param reserved1 the value for bss_project_info.reserved1, 预留字段1
     */
    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1 == null ? null : reserved1.trim();
    }

    /**
     * 获取 预留字段2 字段:bss_project_info.reserved2
     *
     * @return bss_project_info.reserved2, 预留字段2
     */
    public String getReserved2() {
        return reserved2;
    }

    /**
     * 设置 预留字段2 字段:bss_project_info.reserved2
     *
     * @param reserved2 the value for bss_project_info.reserved2, 预留字段2
     */
    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2 == null ? null : reserved2.trim();
    }

    /**
     * 获取 预留字段3 字段:bss_project_info.reserved3
     *
     * @return bss_project_info.reserved3, 预留字段3
     */
    public String getReserved3() {
        return reserved3;
    }

    /**
     * 设置 预留字段3 字段:bss_project_info.reserved3
     *
     * @param reserved3 the value for bss_project_info.reserved3, 预留字段3
     */
    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3 == null ? null : reserved3.trim();
    }

    /**
     * 获取 创建时间 字段:bss_project_info.create_time
     *
     * @return bss_project_info.create_time, 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:bss_project_info.create_time
     *
     * @param createTime the value for bss_project_info.create_time, 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * 获取 修改时间 字段:bss_project_info.update_time
     *
     * @return bss_project_info.update_time, 修改时间
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 修改时间 字段:bss_project_info.update_time
     *
     * @param updateTime the value for bss_project_info.update_time, 修改时间
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}