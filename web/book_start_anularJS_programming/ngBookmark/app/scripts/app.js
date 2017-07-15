angular.module("ngBookmark", ['ngRoute', 'ngBookmark.bookmark']);

angular.module("ngBookmark.bookmark", ['ngBookmark.bookmark.controller', 'ngBookmark.bookmark.service']);
angular.module("ngBookmark.bookmark.controller", []);
angular.module("ngBookmark.bookmark.service", ['ngResource']);

angular.module("ngBookmark")
    .config(['$routeProvider', function($routeProvider) {
        $routeProvider
            .when('/bookmarks', {
                templateUrl: 'scripts/bookmark/template/bookmark-list.tmpl.html', 
                controller: 'bookmarkListCtrl',
                resolve: {
                    bookmarks: function (Bookmark) {
                        return Bookmark.query().$promise;
                    }
                }
            })
            .when('/bookmarks/:bookmarkId', {
                templateUrl: 'scripts/bookmark/template/bookmark-detail.tmpl.html', controller: 'bookmarkDetailCtrl'
            })
            .otherwise({
                redirectTo: '/bookmarks'
            });
    }])
    .controller('bookmarkMainCtrl', ['$scope', function($scope) {
        $scope.bookmarkListViewType = 'grid';
        $scope.searchInfo = {
            bookmarkName: ''
        };

        $scope.toggleBookmarkListViewType = function() {
            if($scope.bookmarkListViewType === 'grid') {
                $scope.bookmarkListViewType = 'list';
            } else {
                $scope.bookmarkListViewType = 'grid';
            }
        };

        $scope.search = function (searchInfo) {
            $scope.$broadcast('search:newSearchInfo', searchInfo);
        };
    }]);