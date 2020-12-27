<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户列表</title>
</head>
<body>
<script type="text/javascript">
onload=function(){
// 如果当前页码为空，则首先查询一次
if("${page.pageIndex}" == "" || "${page.pageIndex}" == null){
window.location.href="${pageContext.servletContext.contextPath}/pageServlet?pageIndex=1";
}
}
</script>
<!-- 遍历显示用户信息 -->
<table border="1">

<c:forEach var="user" items="${page.dataList}">
<tr>
<td>
	用户名：${user.name}
</td>
</tr>
</c:forEach>
<tr>

</tr>
</table>
 
<!-- 上一页 -->
<!-- 判断是否是第一页 -->
<c:if test="${page.pageIndex == 1}">
<a href="javascript:void(0)" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a>
</c:if>
<c:if test="${page.pageIndex != 1}">
<a href="${pageContext.servletContext.contextPath}/pageServlet?pageIndex=${page.pageIndex-1}" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a>
</c:if>
 
<c:forEach begin="1" end="${page.pageCount}" var="pageNum">
<!-- 判断当前页 -->
<c:if test="${page.pageIndex == pageNum}">
<a href="javascript:void(0)">${pageNum}</a>
</c:if>
<c:if test="${page.pageIndex != pageNum}">
<a href="${pageContext.servletContext.contextPath}/pageServlet?pageIndex=${pageNum}">${pageNum}</a>
</c:if>
</c:forEach>
 
<!-- 下一页 -->
<!-- 判断当前页是否是最后一页 -->
<c:if test="${page.pageIndex == page.pageCount}">
<a href="javascript:void(0)" aria-label="Next"><span aria-hidden="true">&raquo;</span></a>
</c:if>
<c:if test="${page.pageIndex != page.pageCount}">
<a href="${pageContext.servletContext.contextPath}/pageServlet?pageIndex=${page.pageIndex+1}" aria-label="Next"><span aria-hidden="true">&raquo;</span></a>
</c:if>

<!-- 分页结束 -->
</body>
</html>