package com.jd.shoping.dao;

import java.util.List;

import com.jd.shoping.model.Message;

public interface MessageDao {
	public List<Message> findAll();//查询所有的信息
	public Message findById(int id);//查询一条消息
	
}


