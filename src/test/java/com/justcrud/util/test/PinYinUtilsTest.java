package com.justcrud.util.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.justcrud.util.PinYinUtils;

public class PinYinUtilsTest {
	@Test
	public void test() {
		List<Map<String,String>> videoMapList=new ArrayList<>();
		String[] nameList=new String[] {"省级管理员-初始化设置","省级管理员-日常权限","财务预算岗","方案制定部门经办","复核及审批角色","其他用户","系统操作全流程"};
		for(String name:nameList) {
			System.out.println(PinYinUtils.hanZiToPinyin(name));
			System.out.println(PinYinUtils.hanZiToPinyin2(name));
		}
	}
}
