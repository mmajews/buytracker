angular.module('myApp').factory('ItemService', ['$http', function ($http) {

    var urlBase = '/api';
    var ItemService = {};

    ItemService.getItems = function (success) {
        return $http.get(urlBase + '/items').then(success);
    };

    ItemService.addItem = function (itemName) {
        var item = {};

        item.name = itemName;
        item.lastModification = new Date();
        item.nameOfLastUser = "";

        return $http.put(urlBase + '/item', item);
    };

    ItemService.updateItem = function (item, success, err) {
        item.lastModification = new Date();
        return $http.put(urlBase + '/item', item).then(success, err);
    };

    return ItemService;
}]);