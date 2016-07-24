<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>天然气表录入管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			//$("#name").focus();
			$("#inputForm").validate({
				errorContainer: "#messageBox",
				errorPlacement: function(error, element) {
					$("#messageBox").text("输入有误，请先更正。");
					if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
						error.appendTo(element.parent().parent());
					} else {
						error.insertAfter(element);
					}
				}
			});
		});
	</script>
</head>
<body>
	<%-- <ul class="nav nav-tabs">
		<li><a href="${ctx}/gzf/gzfNaturalGas/">天然气表录入列表</a></li>
		<li class="active"><a href="${ctx}/gzf/gzfNaturalGas/form?id=${gzfNaturalGas.id}">天然气表录入<shiro:hasPermission name="gzf:gzfNaturalGas:edit">${not empty gzfNaturalGas.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="gzf:gzfNaturalGas:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/> --%>
	
	<div id="inputWater">
		<div class="row-fluid">
			<div class="span12">
				<div class="portlet">
					<div class="portlet-title bottom-line" style="border-bottom: #f5f5f5 1px solid;">
						<div class="caption" style="color: rgb(77, 144, 254);"><i class="icon-edit"></i>查看天然气表数</div>
					</div>
					<div class="portlet-body">
						<form:form id="inputForm" modelAttribute="gzfNaturalGas" action="${ctx}/gzf/gzfNaturalGas/save" method="post" class="form-horizontal">
							<form:hidden path="id"/>
							<form:hidden path="gzfHouseInfoId" value="${gzfNaturalGas.gzfHousePerson.gzfHouseInfo.id}"/>
							<form:hidden path="gzfHouseholdInfoId" value="${gzfNaturalGas.gzfHousePerson.gzfHouseholdInfo.id}"/>
							<sys:message content="${message}"/>	
							<div class="control-group">
								<label class="control-label">操作日期</label>
								<div class="controls">
									<span class="pad"><fmt:formatDate value="${sysdate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
								</div>
							</div>
							<%-- <div class="control-group">
								<label class="control-label">抄表日期</label>
								<div class="controls">
									<div class="input-append date date-picker" data-date="2015-11-15" data-date-format="yyyy-mm-dd" data-date-viewmode="years">
										<input name="time" type="text" readonly="readonly" maxlength="20" class="m-wrap m-ctrl-medium date-picker Wdate "
											value="<fmt:formatDate value="${gzfNaturalGas.time}" pattern="yyyy-MM-dd HH:mm:ss"/>"
											onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
											<span class="add-on"><i class="icon-calendar"></i></span>
									</div>
								</div>
							</div> --%>															
							<div class="control-group">
								<label class="control-label">房屋地址</label>
								<div class="controls">
									<span class="pad">
										${gzfNaturalGas.gzfHousePerson.gzfHouseInfo.gzfPalaces.gzfVillage.name}
										${gzfNaturalGas.gzfHousePerson.gzfHouseInfo.gzfPalaces.name}
										${gzfNaturalGas.gzfHousePerson.gzfHouseInfo.buildNum}号
										${gzfNaturalGas.gzfHousePerson.gzfHouseInfo.unit}单
										${gzfNaturalGas.gzfHousePerson.gzfHouseInfo.room}
									</span>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">燃气表数</label>
								<div class="controls">
									<form:input path="num" htmlEscape="false" class="input-xlarge m-wrap small"/>
									<span class="help-inline">立方</span>
								</div>
							</div>
							 <%-- <div class="control-group">
								<label class="control-label">备注住息</label>
								<div class="control-group">
									<div class="controls">
										<form:textarea path="remarks" htmlEscape="false" rows="4" maxlength="255" class="input-xxlarge large m-wrap"/>
									</div>
								</div>
							</div>  --%>
							<div class="form-actions save-cancle ">
								<%-- <shiro:hasPermission name="gzf:gzfNaturalGas:edit">
									<button id="btnSubmit" class="btn blue margin-r-20 " type="submit" ><i class="icon-ok"></i> 保存</button></shiro:hasPermission>
									 --%><input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<%-- <form:form id="inputForm" modelAttribute="gzfNaturalGas" action="${ctx}/gzf/gzfNaturalGas/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<form:hidden path="gzfHouseInfoId" value="${gzfNaturalGas.gzfHousePerson.gzfHouseInfo.id}"/>
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">房屋地址：</label>
			<div class="controls">
				${gzfNaturalGas.gzfHousePerson.gzfHouseInfo.gzfPalaces.gzfVillage.name}
				${gzfNaturalGas.gzfHousePerson.gzfHouseInfo.gzfPalaces.name}
				${gzfNaturalGas.gzfHousePerson.gzfHouseInfo.buildNum}号
				${gzfNaturalGas.gzfHousePerson.gzfHouseInfo.unit}单
				${gzfNaturalGas.gzfHousePerson.gzfHouseInfo.room}
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">立方：</label>
			<div class="controls">
				<form:input path="num" htmlEscape="false" maxlength="64" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">抄表时间：</label>
			<div class="controls">
				<input name="time" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${gzfNaturalGas.time}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">备注：</label>
			<div class="controls">
				<form:textarea path="remarks" htmlEscape="false" rows="4" maxlength="255" class="input-xxlarge "/>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="gzf:gzfNaturalGas:edit"><button id="btnSubmit" class="btn blue margin-r-20 " type="submit" ><i class="icon-ok"></i> 保存</button></shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form> --%>
</body>
</html>