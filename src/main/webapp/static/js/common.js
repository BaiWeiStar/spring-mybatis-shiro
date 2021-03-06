//声明一个map
//使用方式：
/*var map=new Map();
 map.put('h','hello');
 map.put('hw','world');
 console.log(map);*/
function Map() {
    var struct = function (key, value) {
        this.key = key;
        this.value = value;
    }

    var put = function (key, value) {
        for (var i = 0; i < this.arr.length; i++) {
            if (this.arr[i].key === key) {
                this.arr[i].value = value;
                return;
            }
        }
        this.arr[this.arr.length] = new struct(key, value);
    }

    var get = function (key) {
        for (var i = 0; i < this.arr.length; i++) {
            if (this.arr[i].key === key) {
                return this.arr[i].value;
            }
        }
        return null;
    }

    var containsKey = function (needle) {
        for (i in this.arr) {
            if (this.arr[i].key === needle) return true;
        }
        return false;
    }

    var remove = function (key) {
        var v;
        for (var i = 0; i < this.arr.length; i++) {
            v = this.arr.pop();
            if (v.key === key) {
                continue;
            }
            this.arr.unshift(v);
        }
    }

    var size = function () {
        return this.arr.length;
    }

    var isEmpty = function () {
        return this.arr.length <= 0;
    }
    this.arr = new Array();
    this.get = get;
    this.put = put;
    this.remove = remove;
    this.size = size;
    this.isEmpty = isEmpty;
    this.containsKey = containsKey;
}
//扩展js数组功能 是否包含某元素
Array.prototype.contains = function (needle) {
    for (i in this) {
        if (this[i] == needle) return true;
    }
    return false;
}

//js set 集合用法
/*
 window.onload = function() {
 var a = [ 1, 4, 2, 4, 3, 8, 10, 3, 9, 1, 9, 7, 111 ];
 var r = a.distinct();
 alert(a.join(','));
 alert(r.join(','));
 } */

Array.prototype.distinct = function() {
    var x = [], r = [];
    for(var i = 0; i < this.length; i++) {
        x['_' + this[i]] = this[i];
    }
    for(var b in x) {
        if(typeof x[b] != 'function') {
            r.push(x[b]);
        }
    }
    return r;
}

