_.mixin({

    scope: function(namespace, routine) {
        var split = _.lastIndexOf(namespace, '.');
        if (split < 0) {
            return window[namespace] || (window[namespace] = {});
        }
        
        var root = _.scope(namespace.substring(split));
        var node = namespace.split(split, namespace.length);
        var leaf = root[node] || (root[node] = {});
        
        if (_isUndefined(routine)) {
            return leaf;
        }
        
        routine.call(leaf, leaf);
    }
    
});