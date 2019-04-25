package com.example.bss.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.bss.common.MyException;
import com.example.bss.dao.BssCostDepartmentMapper;
import com.example.bss.dao.BssProjectClassMapper;
import com.example.bss.dao.BssProjectInfoMapper;
import com.example.bss.dao.BssProjectPersonMapper;
import com.example.bss.dao.BssProjectPriceMapper;
import com.example.bss.dao.BssSupplierMapper;
import com.example.bss.pojo.BssCostDepartment;
import com.example.bss.pojo.BssProjectClass;
import com.example.bss.pojo.BssProjectInfo;
import com.example.bss.pojo.BssProjectPerson;
import com.example.bss.pojo.BssProjectPrice;
import com.example.bss.pojo.BssSupplier;

@Service
public class ImportServiceImpl implements com.example.bss.service.ImportService {

	@Autowired
	BssProjectInfoMapper bssProjectInfoMapper;
	@Autowired
	BssProjectPersonMapper bssProjectPersonMapper;
	@Autowired
	BssProjectClassMapper bssProjectClassMapper;
	@Autowired
	BssCostDepartmentMapper bssCostDepartmentMapper;
	@Autowired
	BssSupplierMapper bssSupplierMapper;
	@Autowired
	BssProjectPriceMapper bssProjectPriceMapper;

	@Override
	public boolean batchImport(String fileName, MultipartFile file) {
		boolean notNull = false;
		List<BssProjectInfo> infoList = new ArrayList<>();
		if (!fileName.matches("^.+\\.(?i)(xls)$") && !fileName.matches("^.+\\.(?i)(xlsx)$")) {
			throw new MyException("上传文件格式不正确");
		}
		boolean isExcel2003 = true;
		if (fileName.matches("^.+\\.(?i)(xlsx)$")) {
			isExcel2003 = false;
		}

		InputStream is;

		try {

			is = file.getInputStream();

			Workbook wb = null;
			if (isExcel2003) {
				wb = new HSSFWorkbook(is);
			} else {
				wb = new XSSFWorkbook(is);
			}

			Sheet sheet = wb.getSheetAt(0);
			if (sheet != null) {
				notNull = true;
			}

			BssProjectInfo bssProjectInfo;

			String ggxmlx = "";
			for (int r = 2; r <= sheet.getLastRowNum() - 1; r++) {// r = 2 表示从第三行开始循环 如果你的第三行开始是数据
				Row row = sheet.getRow(r);// 通过sheet表单对象得到 行对象
				if (row == null || row.getCell(5).getStringCellValue().isEmpty()
						|| row.getCell(2).getStringCellValue().isEmpty()) {
					continue;
				}


				bssProjectInfo = new BssProjectInfo();

				// if( row.getCell(1).getCellType() !=1){//循环时，得到每一行的单元格进行判断
				// throw new MyException("导入失败(第"+(r+1)+"行,用户名请设为文本格式)");
				// }

				String xmlx = row.getCell(0).getStringCellValue();// 得到每一行第2个单元格的值

				if (xmlx == null || xmlx.isEmpty()) {// 判断是否为空
					xmlx = ggxmlx;
				} else {
					ggxmlx = xmlx;
				}

				String xmmc = row.getCell(1).getStringCellValue();
				String xmsm = row.getCell(2).getStringCellValue();

				String ssd = row.getCell(3).getStringCellValue();
				// 查询
				String fzr = row.getCell(4).getStringCellValue();
				Integer fzrid = null;
				if (!fzr.trim().isEmpty()) {
					fzrid = bssProjectPersonMapper.selectIdByXm(fzr.trim());
					if (fzrid == null) {
						// 插入
						BssProjectPerson bssProjectPerson = new BssProjectPerson();
						bssProjectPerson.setXm(fzr.trim());
						bssProjectPersonMapper.insert(bssProjectPerson);
						fzrid = bssProjectPerson.getId();
					}
				}

				String cwkmgl = row.getCell(5).getStringCellValue();
				String sflx = row.getCell(6).getStringCellValue();
				// 查询
				String xmfl = row.getCell(7).getStringCellValue();
				Integer xmflid = bssProjectClassMapper.selectIdByLB(xmfl.trim());
				if (xmflid == null) {
					// 插入
					BssProjectClass bssProjectClass = new BssProjectClass();
					bssProjectClass.setLb(xmfl);
					bssProjectClassMapper.insert(bssProjectClass);
					xmflid = bssProjectClass.getId();
				}

				// 查询
				String fygsbm = row.getCell(8).getStringCellValue();
				String sx = row.getCell(9).getStringCellValue();
				Integer fygsbmid = bssCostDepartmentMapper.selectIdByBmmc(fygsbm.trim());
				if (fygsbmid == null) {
					// 插入
					BssCostDepartment bsCostDepartment = new BssCostDepartment();
					bsCostDepartment.setBmmc(fygsbm);
					bssCostDepartmentMapper.insert(bsCostDepartment);
					fygsbmid = bsCostDepartment.getId();

				}

				String qdx = row.getCell(10).getStringCellValue();
				// 价格表
				row.getCell(11).setCellType(CellType.STRING);
				String danjia = row.getCell(11).getStringCellValue();
				row.getCell(12).setCellType(CellType.STRING);
				String shuliang = row.getCell(12).getStringCellValue();
				row.getCell(13).setCellType(CellType.STRING);
				String zysje = row.getCell(13).getStringCellValue();
				row.getCell(14).setCellType(CellType.STRING);
				String xz19 = row.getCell(14).getStringCellValue();
				row.getCell(15).setCellType(CellType.STRING);
				String dy18 = row.getCell(15).getStringCellValue();
				row.getCell(16).setCellType(CellType.STRING);
				String yzf = row.getCell(16).getStringCellValue();
				row.getCell(17).setCellType(CellType.STRING);
				String beizhu = row.getCell(17).getStringCellValue();

				// 查询
				String gys = row.getCell(18).getStringCellValue();
				Integer gysid = bssSupplierMapper.selectIdByGysmc(gys.trim());
				if (gysid == null) {
					// 插入
					BssSupplier bssSupplier = new BssSupplier();
					bssSupplier.setGysmc(gys);
					bssSupplierMapper.insert(bssSupplier);
					gysid = bssSupplier.getId();
				}

				String dyyw = row.getCell(19).getStringCellValue();
				String byyxj = row.getCell(20).getStringCellValue();
				String dyywbk = row.getCell(21).getStringCellValue();
				String zcfs = row.getCell(22).getStringCellValue();
				row.getCell(23).setCellType(CellType.STRING);
				String itjsfy = row.getCell(23).getStringCellValue();
				row.getCell(24).setCellType(CellType.STRING);
				String itywcb = row.getCell(24).getStringCellValue();
				row.getCell(25).setCellType(CellType.STRING);
				String wnysyzjnys = row.getCell(25).getStringCellValue();
				row.getCell(26).setCellType(CellType.STRING);
				String cxywkzys = row.getCell(26).getStringCellValue();
				String gdgxzc = row.getCell(27).getStringCellValue();
				String zlywzz = row.getCell(28).getStringCellValue();
				String tsxl = row.getCell(29).getStringCellValue();
				String xmsx = row.getCell(30).getStringCellValue();
				row.getCell(31).setCellType(CellType.STRING);
				String cxky = row.getCell(31).getStringCellValue();
				row.getCell(32).setCellType(CellType.STRING);
				String qtxm = row.getCell(32).getStringCellValue();
				row.getCell(33).setCellType(CellType.STRING);
				String zys = row.getCell(33).getStringCellValue();

	

				bssProjectInfo.setXmlx(xmlx);
				bssProjectInfo.setXmmc(xmmc);
				bssProjectInfo.setXmsm(xmsm);
				bssProjectInfo.setSsd(ssd);
				bssProjectInfo.setFzr(fzrid);
				bssProjectInfo.setCwkmgl(cwkmgl);
				bssProjectInfo.setSflx(sflx);
				bssProjectInfo.setXmfl(xmflid);
				bssProjectInfo.setSx(sx);
				bssProjectInfo.setFygsbm(fygsbmid);
				bssProjectInfo.setQdx(qdx);   
				bssProjectInfo.setGys(gysid);
				bssProjectInfo.setDyyw(dyyw);
				bssProjectInfo.setByyxj(byyxj);
				bssProjectInfo.setDyywbk(dyywbk);
				bssProjectInfo.setZcfs(zcfs);
				bssProjectInfo.setItjsfy(itjsfy);
				bssProjectInfo.setItywcb(itywcb);
				bssProjectInfo.setWnysyzjnys(wnysyzjnys);
				bssProjectInfo.setCxywkzys(cxywkzys);
				bssProjectInfo.setGdgxzc(gdgxzc);
				bssProjectInfo.setZlywzz(zlywzz);
				bssProjectInfo.setTsxl(tsxl);
				bssProjectInfo.setXmsx(xmsx);
				bssProjectInfo.setCxky(cxky);
				bssProjectInfo.setStatus("1");
				if (!qtxm.equals("0")) {
					bssProjectInfo.setQtxm(qtxm);
				} 
				if (!zys.equals("0")) {
					bssProjectInfo.setZys(zys);
				} 
				
				// bssProjectInfo.setBz(bz);

				bssProjectInfoMapper.insert(bssProjectInfo);
				int infoId = bssProjectInfo.getId();

				BssProjectPrice bssProjectPrice = new BssProjectPrice();
				bssProjectPrice.setProjectId(infoId);
				bssProjectPrice.setDj(danjia);
				bssProjectPrice.setSl(shuliang);
				bssProjectPrice.setZysje(zysje);
				bssProjectPrice.setXz19(xz19);
				bssProjectPrice.setDy18(dy18);
				bssProjectPrice.setYzf(yzf);
				bssProjectPrice.setStatus("1");
				if (!danjia.isEmpty() && !shuliang.isEmpty()) {
					bssProjectPriceMapper.insert(bssProjectPrice);
				}

			}

		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return notNull;
	}
}
