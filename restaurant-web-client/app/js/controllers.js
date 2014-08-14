'use strict';

/* Controllers */

var restaurantControllers = angular.module('restaurantControllers', []);

restaurantControllers.controller('ClientSignUpCtrl', [ '$scope',
        function($scope) {
            $scope.register = function(client) {
                $scope.client = angular.copy(client);
            };
        } ]);

restaurantControllers.controller('RestaurantSignUpCtrl', [ '$scope',
        function($scope) {
            $scope.restaurantTypes = [ 'restaurant', 'bar', 'cafe' ];
            $scope.currentStep = 1;

            $scope.toStep = function(step) {
                $scope.currentStep = step;
            };
            $scope.isStepActive = function(step) {
                return $scope.currentStep == step;
            };
            $scope.register = function(restaurant) {
                $scope.restaurant = angular.copy(restaurant);
            };
        } ]);

restaurantControllers.controller('SupplierSignUpCtrl', [ '$scope',
        function($scope) {
            $scope.supplier={'type':'company'};
            $scope.supplierTypes = [ 'company', 'person'];
            $scope.currentStep = 1;

            $scope.toStep = function(step) {
                $scope.currentStep = step;
            };
            $scope.isStepActive = function(step) {
                return $scope.currentStep == step;
            };
            $scope.isCompany = function(){
                return $scope.supplier.type == 'company';
            };
            $scope.register = function(supplier) {
                $scope.supplier = angular.copy(supplier);
            };
        } ]);