/**
 * Created by liangwang on 4/6/16.
 */
"use strict";
(function () {
    var app = angular.module('jtdscs.controller');
    app.controller('HomeCtrl', HomeCtrl);
    function HomeCtrl() {
        var self = this;
        self.test = "home test";
    }
})();