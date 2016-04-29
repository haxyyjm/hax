$(function() {

	$("#show_all_message").click(
			function() {

				$.ajax({
					"type" : "get",
					"dataType" : "json",
					"url" : "/message/all",
					"success" : function(rep) {
						if (rep.code == 1) {
							var date = rep.date;// data 接收服务器响应的data数据
							$("#tb tr").remove();// 删除所有的tr节点
							$.each(date, function(k, v) {// data
								var td = $("<td>" + v.title + "</td><td>"
										+ v.content + "</td><td>"
										+ v.crerateTime + "</td><td><button class='btn btn-primary btn-lg' data-toggle='modal' data-target='#updateModal' onclick='updatebyid("+v.id+")'>修改消息</button></td>");
								var tr = $("<tr></tr>");// 创建tr标签对象
								tr.append(td);// 追加
								$("#tb").append(tr);// tr对象追加tbody

							});

						} else {
							alert(rep.date);// data
						}

					}
				});
			});
});

 
/*$(function(){
	$("#updateModal").click(function(){
	    $.ajax({
		"type" : "get",
					"dataType" : "json",
					
					"url" : "/message/single",
					"success" : function(rep){
				
					var date = rep.date;
							$.each(date, function(k, v){
							return v.content	
							
				}
		});

	});

	})*/
 
 function updatebyid(id){
	 $(function(){
		$.getJSON("/message/updatebyid?id="+id,function(rep){
			
			
		}); 
	 });
	 
 }
