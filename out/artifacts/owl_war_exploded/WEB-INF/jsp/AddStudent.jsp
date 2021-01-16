<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
<script  >
      function StudentJson(){
    	  var classname=$("#classname").val();
    	  var name=$("#name").val();
    	  var birthday=$("#birthday").val();
    	  $.ajax({
    		 url:"${pageContext.request.contextPath}/Student/addStudent",//设置访问地址 
    		  type:"post" , //提交请求的方法
    		  data:JSON.stringify({id:null,classname:classname,name:name,birthday:birthday}),//提交的数据
    		  //提交的数据格式
    		  contentType:"application/json;charset=UTF-8",
    		  dataType:"json",//定义回调函数的数据格式,即传回的数据格式
    		  //成功响应的回调函数
    		  success:function(data){
    			  if(data!=null){
    				  alert("增加成功:返回的数据为id:"+data.id+"classname"+data.classname+"name"+data.name+"birthday"+data.birthday);
    			  }else{
    				  alert("没有传回数据");
    			  }
    		  }
    	  });
      }

</script>
</head>
<body>
       <center>
       
            杜润生 20173404990<br/>
       
           <form>
                班&nbsp;&nbsp;号:<input type="text" name="classname" id="classname"/> </br>
                姓&nbsp;&nbsp;名:<input type="text" name="name" id="name"/> </br>
                出生日期:<input type="date" name="birthday" id="birthday"/> </br>

                
                <input type="submit" value="插入" onclick="StudentJson()"/><input type="reset" value="重置"/>
            
           </form>
         
         
         <a href="${pageContext.request.contextPath}/Student/main">回首页</a>      
       </center>
</body>
</html>