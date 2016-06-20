package com.java;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, Object> map = new HashMap<String, Object>();
	map.put("AUDIENCE_COUNT", 12);
	System.out.println();
	//System.out.println(StringUtils.containsOnly("PURCHASE_PROFILE_OVERVIEW", new char[] {'PURCHASE_PROFILE_OVERVIEW', 'OPPORTUNITIES'}));
	System.out.println(StringUtils.containsOnly("PURCHASE_PROFILE_OVERVIEW OPPORTUNITIES","PURCHASE_PROFILE_OVERVIEW"));

	}
	
}
