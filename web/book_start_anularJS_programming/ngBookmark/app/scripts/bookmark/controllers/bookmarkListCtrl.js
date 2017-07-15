angular.module("ngBookmark.bookmark.controller")
    .controller('bookmarkListCtrl', ['$scope', 'bookmarks', 'Bookmark', function ($scope, bookmarks, Bookmark) {
        $scope.bookmarkList = bookmarks;

        $scope.$on('search:newSearchInfo', function(e, searchInfo) {
            var searchQuery = '{"bookmarkName" : {"$regex": "^' + searchInfo.bookmarkName + '"} }';
            $scope.bookmarkList = Bookmark.query({q : searchQuery});
        })
    }]);