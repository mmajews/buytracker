angular.module('myApp').controller('homeController', ['$scope', 'ItemService', '$filter',
    function ($scope, ItemService, $filter) {
        console.log("LOG");

        $scope.newItemName = "";

        $scope.changeButtons = [];
        $scope.items = [];

        $scope.getItems = function () {
            $scope.items = ItemService.getItems(function (success) {
                $scope.items = success.data;
                //console.log($scope.items);
            });
        };

        $scope.getItems();

        $scope.addNewItem = function () {
            ItemService.addItem($scope.newItemName).then(function (s) {
                $scope.getItems();
            }, function (err) {
                console.log("Error while downloading data!");
            });
        };

        $scope.triggerChange = function ($index) {
            $scope.changeButtons[$index] = true;

        };

        $scope.changeLastBuyer = function (name, $index, item) {
            $scope.changeButtons[$index] = false;
            item.nameOfLastUser = name;
            ItemService.updateItem(item).then(function (s) {
                $scope.getItems();
            }, function (err) {
                console.log("Error while updating data");
            })

        }


    }
]);