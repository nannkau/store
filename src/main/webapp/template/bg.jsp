<%--
  Created by IntelliJ IDEA.
  User: Nam
  Date: 9/13/2020
  Time: 12:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<!doctype html>
<html class="no-js" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title><tiles:insertAttribute name="title" /></title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- favicon
		============================================ -->
    <link rel="shortcut icon" type="image/x-icon" href="<c:url value='/themes/img/favicon.ico'/>">
    <!-- Google Fonts
		============================================ -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i,800" rel="stylesheet">
    <!-- Bootstrap CSS
		============================================ -->
    <link rel="stylesheet" href="<c:url value='/themes/css/bootstrap.min.css'/>">
    <!-- Bootstrap CSS
		============================================ -->
    <link rel="stylesheet" href="<c:url value='/themes/css/font-awesome.min.css'/>">
    <!-- adminpro icon CSS
		============================================ -->
    <link rel="stylesheet" href="<c:url value='/themes/css/adminpro-custon-icon.css'/>">
    <!-- meanmenu icon CSS
		============================================ -->
    <link rel="stylesheet" href="<c:url value='/themes/css/meanmenu.min.css'/>">
    <!-- mCustomScrollbar CSS
		============================================ -->
    <link rel="stylesheet" href="<c:url value='/themes/css/jquery.mCustomScrollbar.min.css'/>">
    <!-- animate CSS
		============================================ -->
    <link rel="stylesheet" href="<c:url value='/themes/css/animate.css'/>">
    <!-- data-table CSS
		============================================ -->
    <link rel="stylesheet" href="<c:url value='/themes/css/data-table/bootstrap-table.css'/>">
    <link rel="stylesheet" href="<c:url value='/themes/css/data-table/bootstrap-editable.css'/>">
    <!-- normalize CSS
		============================================ -->
    <link rel="stylesheet" href="<c:url value='/themes/css/normalize.css'/>">
    <!-- charts C3 CSS
		============================================ -->
    <link rel="stylesheet" href="<c:url value='/themes/css/c3.min.css'/>">
    <!-- forms CSS
		============================================ -->
    <link rel="stylesheet" href="<c:url value='/themes/css/form/all-type-forms.css'/>">
    <!-- style CSS
		============================================ -->
    <link rel="stylesheet" href="<c:url value='/themes/css/style.css'/>">
    <!-- responsive CSS
		============================================ -->
    <link rel="stylesheet" href="<c:url value='/themes/css/responsive.css'/>">
    <!-- modernizr JS
		============================================ -->
    <script src="<c:url value='/themes/js/vendor/modernizr-2.8.3.min.js'/>"></script>
</head>

<body class="materialdesign">
<!--[if lt IE 8]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
<![endif]-->

<!-- Header top area start-->

        <!-- Header top area end-->
        <%@include file="/common/topbar.jsp"%>
        <!-- Mobile Menu start -->
        <%@include file="/common/mobile-menu.jsp"%>
        <!-- Mobile Menu end -->
<%--body start--%>

<div class="container-fluid">
    <tiles:insertAttribute name="content" />
</div>




<%--body end--%>







<!-- jquery
    ============================================ -->
<script src="<c:url value='/themes/js/vendor/jquery-1.11.3.min.js'/>"></script>
<!-- bootstrap JS
    ============================================ -->
<script src="<c:url value='/themes/js/bootstrap.min.js'/>"></script>
<!-- meanmenu JS
    ============================================ -->
<script src="<c:url value='/themes/js/jquery.meanmenu.js'/>"></script>

<script src="<c:url value='/themes/js/jquery.mCustomScrollbar.concat.min.js'/>"></script>
<!-- sticky JS
    ============================================ -->
<script src="<c:url value='/themes/js/jquery.sticky.js'/>"></script>
<!-- scrollUp JS
    ============================================ -->
<script src="<c:url value='/themes/js/jquery.scrollUp.min.js'/>"></script>
<!-- counterup JS
    ============================================ -->
<script src="<c:url value='/themes/js/counterup/jquery.counterup.min.js'/>"></script>
<script src="<c:url value='/themes/js/counterup/waypoints.min.js"'/>></script>
<script src="<c:url value='/themes/js/counterup/counterup-active.js'/>"></script>
<!-- peity JS
    ============================================ -->
<script src="<c:url value='/themes/js/peity/jquery.peity.min.js'/>"></script>
<script src="<c:url value='/themes/js/peity/peity-active.js'/>"></script>
<!-- sparkline JS
    ============================================ -->
<script src="<c:url value='/themes/js/sparkline/jquery.sparkline.min.js'/>"></script>
<script src="<c:url value='/themes/js/sparkline/sparkline-active.js'/>"></script>
<!-- flot JS
    ============================================ -->
<script src="<c:url value='/themes/js/flot/jquery.flot.js'/>"></script>
<script src="<c:url value='/themes/js/flot/jquery.flot.tooltip.min.js'/>"></script>
<script src="<c:url value='/themes/js/flot/jquery.flot.spline.js'/>"></script>
<script src="<c:url value='/themes/js/flot/jquery.flot.resize.js'/>"></script>
<script src="<c:url value='/themes/js/flot/jquery.flot.pie.js'/>"></script>
<script src="<c:url value='/themes/js/flot/Chart.min.js'/>"></script>
<script src="<c:url value='/themes/js/flot/flot-active.js'/>"></script>
<!-- map JS
    ============================================ -->
<script src="<c:url value='/themes/js/map/raphael.min.js'/>"></script>
<script src="<c:url value='/themes/js/map/jquery.mapael.js'/>"></script>
<script src="<c:url value='/themes/js/map/france_departments.js'/>"></script>
<script src="<c:url value='/themes/js/map/world_countries.js'/>"></script>
<script src="<c:url value='/themes/js/map/usa_states.js'/>"></script>
<script src="<c:url value='/themes/js/map/map-active.js'/>"></script>
<!-- data table JS
    ============================================ -->
<script src="<c:url value='/themes/js/data-table/bootstrap-table.js'/>"></script>
<script src="<c:url value='/themes/js/data-table/tableExport.js'/>"></script>
<script src="<c:url value='/themes/js/data-table/data-table-active.js'/>"></script>
<script src="<c:url value='/themes/js/data-table/bootstrap-table-editable.js'/>"></script>
<script src="<c:url value='/themes/js/data-table/bootstrap-editable.js'/>"></script>
<script src="<c:url value='/themes/js/data-table/bootstrap-table-resizable.js'/>"></script>
<script src="<c:url value='/themes/js/data-table/colResizable-1.5.source.js'/>"></script>
<script src="<c:url value='/themes/js/data-table/bootstrap-table-export.js'/>"></script>
<!-- main JS
    ============================================ -->
<script src="<c:url value='/themes/js/main.js'/>"></script>
</body>

</html>
