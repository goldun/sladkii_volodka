'use strict';

/* App Module */

var restaurantApp = angular.module('restaurantApp', [
        'ngRoute',
        'restaurantControllers',
]);

restaurantApp.config([ '$routeProvider', function($routeProvider) {
    $routeProvider.when('/registration/client', {
        templateUrl : 'partials/registration/client-registration-form.html',
        controller : 'ClientSignUpCtrl'
    }).when('/registration/restaurant', {
        templateUrl : 'partials/registration/restaurant-registration-form.html',
        controller : 'RestaurantSignUpCtrl'
    }).when('/registration/supplier', {
        templateUrl : 'partials/registration/supplier-registration-form.html',
        controller : 'SupplierSignUpCtrl'
    }).otherwise({
        redirectTo : '/registration/client'
    });
} ]);