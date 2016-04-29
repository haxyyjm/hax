package com.jd.shoping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jd.shoping.dao.MessageDao;
import com.jd.shoping.model.Message;

@Service
public class MessageService {
	@Autowired
	private MessageDao messageDao;//创建dao对象
	/**
	 * 查询所有的消息
	 * 
	 */
	public List<Message> findAll(){
		
		return messageDao.findAll();
	}
	 
	public Message findById(int id){
		return messageDao.findById(id);
	}

}


 
