/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.TreeTraverser;

class TreeTraverser$1
extends TreeTraverser {
    final /* synthetic */ Function val$nodeToChildrenFunction;

    public TreeTraverser$1(Function function) {
        this.val$nodeToChildrenFunction = function;
    }

    public Iterable children(Object object) {
        return (Iterable)this.val$nodeToChildrenFunction.apply(object);
    }
}

