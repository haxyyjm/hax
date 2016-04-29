package com.jd.shoping.model;

public class Result {

	private int code;
	private Object date;//data
   final private static int SUCCESS=1;//定义常量
   final private static int ERROR=2;
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getDate() {
		return date;
	}

	public void setDate(Object date) {
		this.date = date;
	}
	/**
	 * 成功返回结果
	 * @param object
	 * @return
	 */
	
	public static Result successResult(Object object){
		Result result=new Result();
		 result.setCode(SUCCESS);
		 result.setDate(object);
		return result;
	}
	/**
	 * 失败返回结果
	 */
	
	public static Result failResult(Object object){
		Result result=new Result();
		 result.setCode(ERROR);
		 result.setDate(object);
		return result;
	}

}
