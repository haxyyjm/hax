package com.jd.shoping.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jd.shoping.model.Message;
import com.jd.shoping.model.Result;
import com.jd.shoping.service.MessageService;

@RestController
@RequestMapping(value = "/message")
public class MessageController {
	@Autowired
	private MessageService messageService;// 创建Service对象

	/**
	 * 显示首页模板
	 * 
	 * @param void
	 * @return ModelAndView result
	 */
	@RequestMapping(value = "/index")
	public ModelAndView getIndexView() {
		ModelAndView result = new ModelAndView("/message");// 创建message.html模板
		return result;

	}

	/**
	 * 查询所有的消息
	 * 
	 * @param void
	 * @return
	 */
	@RequestMapping(value = "/all")
	public Result getMessageAll() {
		if (messageService.findAll()!=null) {
			return Result.successResult(messageService.findAll());			
		}else {
			return Result.failResult("查询失败！");
		}
	}

	/**
	 * 更新消息
	 * 
	 * @param void
	 * @return
	 */
	@RequestMapping(value="/single")
	 public Message getMessageSingle(){
	   messageService.findById(1);
	   return  messageService.findById(1);
		
	}
	@RequestMapping(value="/updatebyid",params="id")
	  public Result updateById(@RequestParam("id")int id){
		return null;
		
	}
	
}
