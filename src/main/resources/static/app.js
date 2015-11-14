'use strict';
var app = angular.module('myApp', ['ui.router', 'xeditable']);

app.config(['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise('/home');

    $stateProvider.state('home', {
        url: '/home',
        templateUrl: 'views/pages/home.html',
        controller: 'homeController'
    })
}]);



