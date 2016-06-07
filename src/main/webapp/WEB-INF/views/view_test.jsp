<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>My HTML View</title>
	<%-- <link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />		 --%>
</head>
<body>
<div class="success">
	<var name="base" value="/" />
	<a href="${base }/views/html">views/html</a>
	<a href="${base }/views/viewName">views/viewName</a>
	<a href="${base }/views/pathVariables/bar/apple">views/pathVariables/bar/apple</a>
</div>
</body>
</html>