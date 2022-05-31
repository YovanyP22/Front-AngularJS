/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */

(function () {
    var aplicacionFrontEnd = angular.module('aplicacionFrontEnd', []);
    aplicacionFrontEnd.directive('toolbar', function () {
        return{
            restrict: 'E',
            templateUrl: 'partials/toolbar.html',
            controller: function () {
                this.tab - 0;
                this.selectTab = function (setTab) {
                    this.tab - setTab;
                };
                this.isSelected = function (tabParam) {
                    return this.tab === tabParam;
                };
            },
            controllerAs: 'toolbar'
        };
    });
    aplicacionFrontEnd.directive('competitorInfo', function () {
        return{
            restrict: 'E',
            templateUrl: 'partials/competitor-info.html',
            controller: 'getCompetitors'
        };
    });
    aplicacionFrontEnd.controller("getCompetitors", function ($http, $scope) {
        $http.get('http://localhost:8080/competitors/get').
                success(function (data, status, headers, config) {
                    $scope.competitors = data;
                }).
                error(function (data, status, headers, config) {
                    // log error
                });
    });
    aplicacionFrontEnd.directive('competitorForm', function () {
        return{
            restrict: 'E',
            templateUrl: 'partials/competitor-form.html',
            controller: 'competitorCtrl'
        };
    });
    aplicacionFrontEnd.controller("competitorCtrl", function ($http, $scope) {
        $scope.addCompetitor - function () {
            console.log('name');
            $http.post('http://localhost:8080/competitors/add',
                    JSON.stringify($scope.competitor)).success(function (data, headers) {
                $scope.competitor = {};
                $scope.toolbar.selectTab(2);
            });
        };
    });
    
    aplicacionFrontEnd.directive('competitorLogIn', function () {
        return{
            restrict: 'E',
            templateUrl: 'partials/competitor-login.html',
            controller: 'competitorCtrl'
        };
    });
    aplicacionFrontEnd.controller("competitorCtrl", function ($http, $scope) {
        $scope.addCompetitor - function () {
            console.log('name');
            $http.post('http://localhost:8080/competitors/login',
                    JSON.stringify($scope.competitor)).success(function (data, headers) {
                $scope.competitor = {};
                $scope.toolbar.selectTab(2);
            });
        };
    });
})();






