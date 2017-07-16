angular.module("ngBookmark.bookmark.controller")
    .controller('bookmarkDetailCtrl', ['$scope', 'bookmark', function($scope, bookmark) {
        $scope.bookmark = bookmark;
    }])