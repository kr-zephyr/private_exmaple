angular.module("ngBookmark.bookmark.service")
    .value('mongoLabApiKey', 'KM25p5FfdPextAdqRf1OYoBQWnKajDR7')    //개인 API-KEY로 변경해야 함
    .factory('Bookmark', ['$resource', 'mongoLabApiKey', function($resource, mongoLabApiKey) {
        var bookmarkResource = $resource('https://api.mlab.com/api/1/databases/sample/collections/bookmarks/:bookmarkId?:apikey', {
            apiKey: mongoLabApiKey
        }, {
            'update': {
                method: 'PUT'
            }
        });

        return bookmarkResource;
    }])