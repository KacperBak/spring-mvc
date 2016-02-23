<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Spring Home</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css" />" >
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/navbar-fixed-top.css" />">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/ie10-viewport-bug-workaround.css" />">

    <link rel="shortcut icon" type="image/x-icon" href="<c:url value="/resources/img/spring-favicon.png" />"/>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
        <script src="<c:url value="/resources/js/html5shiv.min.js" />"></script>
        <script src="<c:url value="/resources/js/respond.min.js" />"></script>
    <![endif]-->
</head>
<body>

    <!-- Fixed navbar -->
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Spring-mvc</a>
            </div>

            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Words</a></li>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </nav>

    <div class="container">

        <!-- Main component for a primary marketing message or call to action -->
        <div class="jumbotron">
            <h1>Spring mvc</h1>
            <p>This example is a quick exercise to Spring4 techniques</p>
        </div>

    </div> <!-- /container -->


    <script src="<c:url value="/resources/js/jquery.min.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src=<c:url value="/resources/js/ie10-viewport-bug-workaround.js" />></script>
</body>
</html>