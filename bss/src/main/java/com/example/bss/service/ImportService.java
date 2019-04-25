package com.example.bss.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImportService {
	/**
	 * 读取excel中的数据,生成list
	 */
	boolean batchImport(String fileName, MultipartFile file);
}
