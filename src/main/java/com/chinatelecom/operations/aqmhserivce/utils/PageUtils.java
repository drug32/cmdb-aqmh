
package com.chinatelecom.operations.aqmhserivce.utils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.chinatelecom.udp.core.lang.json.JsonObject;
import net.minidev.json.JSONObject;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 分页工具类
 *
 * @author Mark sunlightcs@gmail.com
 */
public class PageUtils implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 总记录数
	 */
	private int totalCount;
	/**
	 * 每页记录数
	 */
	private int pageSize;
	/**
	 * 总页数
	 */
	private int totalPage;
	/**
	 * 当前页数
	 */
	private int currPage;
	/**
	 * 列表数据
	 */
	private List<?> list;
	private Integer maxIdNow;
	
	/**
	 * 分页
	 * @param list        列表数据
	 * @param totalCount  总记录数
	 * @param pageSize    每页记录数
	 * @param currPage    当前页数
	 */
	public PageUtils(List<?> list, int totalCount, int pageSize, int currPage) {
		this.list = list;
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		this.currPage = currPage;
		this.totalPage = (int)Math.ceil((double)totalCount/pageSize);
	}
	public void setMaxIdNow(Integer maxIdNow){
		this.maxIdNow=maxIdNow;
	}

	/**
	 * 分页
	 */
	public PageUtils(IPage<?> page) {
		this.list = page.getRecords();
		this.totalCount = (int)page.getTotal();
		this.pageSize = (int)page.getSize();
		this.currPage = (int)page.getCurrent();
		this.totalPage = (int)page.getPages();
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	public static Map<String,Object> checkPageParams( Map<String, Object> map){
		if(!map.containsKey(Constant.PAGE)){
			map.put("page","1");
		}
		if(!map.containsKey(Constant.LIMIT)){
			map.put("limit","10");
		}
		return map;
	}

	public static JsonObject getDataFromPage(PageUtils page) {
		JsonObject object = new JsonObject();
		object.put("currPage", page.getCurrPage());
		object.put("totalCount", page.getTotalCount());
		object.put("pageSize", page.getPageSize());
		object.put("totalPage", page.getTotalPage());
		object.put("list", page.getList());
		return object;
	}

	public static Boolean isListNotNull(List list){
		if(list!=null&&list.size()>0){
			return true;
		}
		return false;
	}
}
