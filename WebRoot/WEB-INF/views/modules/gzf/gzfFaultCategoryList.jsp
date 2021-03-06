<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>故障类别管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/gzf/gzfFaultCategory/">故障类别列表</a></li>
		<shiro:hasPermission name="gzf:gzfFaultCategory:edit"><li><a href="${ctx}/gzf/gzfFaultCategory/form">故障类别添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="gzfFaultCategory" action="${ctx}/gzf/gzfFaultCategory/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>名称：</label>
				<form:input path="name" htmlEscape="false" maxlength="100" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn blue" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>名称</th>
				<shiro:hasPermission name="gzf:gzfFaultCategory:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="gzfFaultCategory">
			<tr>
				<td><a href="${ctx}/gzf/gzfFaultCategory/form?id=${gzfFaultCategory.id}">
					${gzfFaultCategory.name}
				</a></td>
				<shiro:hasPermission name="gzf:gzfFaultCategory:edit"><td>
    				<a href="${ctx}/gzf/gzfFaultCategory/form?id=${gzfFaultCategory.id}">修改</a>
					<a href="${ctx}/gzf/gzfFaultCategory/delete?id=${gzfFaultCategory.id}" onclick="return confirmx('确认要删除该故障类别吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>