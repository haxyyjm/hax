package com.jd.shoping.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.jd.shoping.dao.MessageDao;
import com.jd.shoping.model.Message;
@Repository
public class MessageDaoImpl implements MessageDao {
	@Autowired
    private JdbcTemplate jdbcTemplate;//创建jdbc对象
	/**
	 * 查询所有的消息
	 */
	@Override
	public List<Message> findAll() {
		String sql="select * from t_message1 ";//准备SQL语句
		final List<Message> messages=new ArrayList<Message>();//创建list集合对象
		jdbcTemplate.query(sql, new RowCallbackHandler() {
			
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				Message message=new Message();//创建消息（Message）对象
				message.setId(rs.getInt("id"));
				message.setTitle(rs.getString("title"));
				message.setContent(rs.getString("content"));
				message.setCrerateTime(rs.getDate("crerateTime"));
				messages.add(message);//将消息对象添加到集合里
			
				
			}
		});
	   return messages;
	}
	/**
	 * 查询一条消息
	 */

	@Override
	public Message findById(int id) {
		// TODO Auto-generated method stub
		String sql="select * from t_message1 where id=?";//SQL查询语句
		Object[] params=new Object[]{id};//准备数据
		final Message message=new Message();//创建消息（Message）对象
		jdbcTemplate.query(sql, params, new RowCallbackHandler(){

			@Override
			public void processRow(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
			
				message.setId(rs.getInt("id"));
				message.setTitle(rs.getString("title"));
				message.setContent(rs.getString("content"));
				message.setCrerateTime(rs.getDate("crerateTime"));
			   
				
			}
			
		});
		return message ;
	}
	

}
