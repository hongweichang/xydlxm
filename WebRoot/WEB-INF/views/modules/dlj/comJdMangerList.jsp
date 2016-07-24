<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>局点管理</title>
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
		<li class="active"><a href="${ctx}/dlj/comJdManger/">局点列表</a></li>
		<shiro:hasPermission name="dlj:comJdManger:edit"><li><a href="${ctx}/dlj/comJdManger/form">局点添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="comJdManger" action="${ctx}/dlj/comJdManger/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>名称：</label>
				<form:input path="name" htmlEscape="false" maxlength="100" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>名称</th>
				<th>手机</th>
				<th>地址</th>
				<th>坐标</th>
				<shiro:hasPermission name="dlj:comJdManger:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="comJdManger">
			<tr>
				<td><a href="${ctx}/dlj/comJdManger/form?id=${comJdManger.id}">
					${comJdManger.name}
				</a></td>
				<td>
					${comJdManger.phone}
				</td>
				<td>
					${comJdManger.address}
				</td>
				<td>
					${comJdManger.point}
				</td>
				<shiro:hasPermission name="dlj:comJdManger:edit"><td>
    				<a href="${ctx}/dlj/comJdManger/form?id=${comJdManger.id}">修改</a>
					<a href="${ctx}/dlj/comJdManger/delete?id=${comJdManger.id}" onclick="return confirmx('确认要删除该保存局点吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>