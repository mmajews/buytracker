'use strict';
var app = angular.module('myApp', ['ui.router', 'xeditable']);

app.config(['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise('/login');

    $stateProvider.state('home', {
        url: '/home',
        templateUrl: 'views/pages/home.html',
        controller: 'homeController'
    });

    $stateProvider.state('login', {
        url: '/login',
        templateUrl: 'views/login/login.html',
        controller: 'loginController'
    })
}]);



