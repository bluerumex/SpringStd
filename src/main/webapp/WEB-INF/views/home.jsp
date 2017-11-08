<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<script type="text/javascript" src="./javascript/angular.js"></script>
</head>
<body ng-app="app" ng-controller="MainCtrl">
    <h1>Angular!</h1>
    Hello, {{message}}
</body>
<script>
    var app = angular.module('app', []);

    app.controller('MainCtrl', function($scope) {
        $scope.message = 'World';
    });
</script>
</html>
