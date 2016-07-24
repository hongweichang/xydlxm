<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>房屋信息管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
		
		//复选框事件
		//全选、取消全选的事件
		function selectAll(){
			if ($("#SelectAll").attr("checked")) {
				$(":checkbox").attr("checked", true);
			} else {
				$(":checkbox").attr("checked", false);
			}
		}
		//子复选框的事件
		function setSelectAll(){
			//当没有选中某个子复选框时，SelectAll取消选中
			if (!$("#subcheck").checked) {
				$("#SelectAll").attr("checked", false);
			}
			var chsub = $("input[type='checkbox'][id='subcheck']").length; //获取subcheck的个数
			var checkedsub = $("input[type='checkbox'][id='subcheck']:checked").length; //获取选中的subcheck的个数
			if (checkedsub == chsub) {
				$("#SelectAll").attr("checked", true);
			}
		}
		
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
	</script>

	<style type="text/css">
	a:link {color: #000;text-decoration:none;}
	a:visited {color: #000}
	a:hover {color: #000;text-decoration:underline;}
	a:active {color: #000}
	</style>
</head>
<body>

	<%-- <ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/gzf/gzfHouseInfo/">房屋信息列表</a></li>
		<shiro:hasPermission name="gzf:gzfHouseInfo:edit"><li><a href="${ctx}/gzf/gzfHouseInfo/form">房屋信息添加</a></li></shiro:hasPermission>
	</ul> --%>
	<div id="houseHistory" class="row-fluid">
		<div class="span12">
			<form:form id="searchForm" modelAttribute="gzfHouseInfo" action="${ctx}/gzf/gzfHouseInfo/information" method="post" class="form-search">
			<form:input type="hidden" path="id"/>
				<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
				<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
				<div class="input-append">
					<form:input path="allSelect" class="m-wrap" placeholder="请输入住户姓名、电话、身份证查询"/>
					<button type="submit" class="btn blue"><i class="icon-search"></i>&nbsp;&nbsp;搜索</button>
				</div>
				<div class="controls pull-left margin-r-20">
				
					<div class="input-append date date-picker" data-date="2015-11-15" data-date-format="yyyy-mm-dd" data-date-viewmode="years">
									<input name="startTime" type="text" readonly="readonly" maxlength="20" class="m-wrap m-ctrl-medium date-picker input-medium Wdate required"
										value="<fmt:formatDate value="${startTime}" pattern="yyyy-MM-dd"/>"
										onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});"/><span class="add-on"><i class="icon-calendar"></i></span>
					</div>-
					<div class="input-append date date-picker" data-date="2015-11-15" data-date-format="yyyy-mm-dd" data-date-viewmode="years">
									<input name="endTime" type="text" readonly="readonly" maxlength="20" class="m-wrap m-ctrl-medium date-picker input-medium Wdate required"
										value="<fmt:formatDate value="${endTime}" pattern="yyyy-MM-dd"/>"
										onclick="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:false});"/><span class="add-on"><i class="icon-calendar"></i></span>
					</div>
				</div>
			</form:form>
			<div class="portlet box blue">
				<div class="portlet-title">
					<div class="caption"><i class="icon-list"></i><span class="whiteFont">"${gzfHouseInfo.gzfPalaces.gzfVillage.name}
					${gzfHouseInfo.gzfPalaces.name}${gzfHouseInfo.buildNum}号楼${gzfHouseInfo.unit}单元${gzfHouseInfo.room}房间"历史使用详情</span></div>
				</div>
				<div class="portlet-body">
					<table class="table table-striped table-bordered table-hover">
						<thead>
							<tr>
								<!-- <th>序号</th> -->
								<th style="text-align: center">住户姓名</th>
								<th style="text-align: center">电话</th>
								<th style="text-align: center">身份证</th>
								<th style="text-align: center">使用年限</th>
								<th style="text-align: center">开始时间</th>
								<th style="text-align: center">截止时间</th>
								<th style="text-align: center">备注</th>
								<th style="text-align: center">详情</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${page.list}" var="gzfHousePerson">
								<tr>
									<%-- <td><input type="checkbox" id="subcheck"  value="${gzfHouseInfo.id}" onclick="setSelectAll();"/></td> --%>
									<td style="text-align: center">
										${gzfHousePerson.gzfHouseholdInfo.name}
									</td>
									<td style="text-align: center">
										${gzfHousePerson.gzfHouseholdInfo.phone}
									</td>
									<td style="text-align: center">
										${gzfHousePerson.gzfHouseholdInfo.cardid}
									</td>
									<td style="text-align: center">
										${gzfHousePerson.timeDiff}
									</td>
									<td style="text-align: center">
										<fmt:formatDate value="${gzfHousePerson.startDate}" pattern="yyyy-MM-dd"/>
									</td>
									<td style="text-align: center">
										<fmt:formatDate value="${gzfHousePerson.endDate}" pattern="yyyy-MM-dd"/>
									</td>
									<td style="text-align: center">
										${gzfHousePerson.remarks}
									</td>
									<td style="text-align: center">
										<a href="${ctx}/gzf/gzfHouseCheckOut/detail?id=${gzfHousePerson.id}">查看详情</a>
									</td>
								</tr>
							</c:forEach>
							
						</tbody>
					</table>
					<div class="pagination">${page}</div>
				</div>
			</div>
		</div>
		
	</div>
	
	<%-- <form:form id="searchForm" modelAttribute="gzfHouseInfo" action="${ctx}/gzf/gzfHouseInfo/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th><input type="checkbox" id="SelectAll"  value="全选" onclick="selectAll();"/></th>
				<th>住户姓名</th>
				<th>电话</th>
				<th>身份证</th>
				<th>使用年限</th>
				<th>开始时间</th>
				<th>截止时间</th>
				<th>备注</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="gzfHousePerson">
			<tr>
				<td><input type="checkbox" id="subcheck"  value="${gzfHouseInfo.id}" onclick="setSelectAll();"/></td>
				<td>
					${gzfHousePerson.gzfHouseholdInfo.name}
				</td>
				<td>
					${gzfHousePerson.gzfHouseholdInfo.phone}
				</td>
				<td>
					${gzfHousePerson.gzfHouseholdInfo.cardid}
				</td>
				<td>
					
				</td>
				<td>
					<fmt:formatDate value="${gzfHousePerson.startDate}" pattern="yyyy-MM-dd"/>
				</td>
				<td>
					<fmt:formatDate value="${gzfHousePerson.endDate}" pattern="yyyy-MM-dd"/>
				</td>
				<td>
					${gzfHousePerson.remarks}
				</td>
			
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div> --%>
</body>
</html>