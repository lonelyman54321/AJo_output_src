/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Maps$EntryTransformer;

class Maps$10
implements Function {
    final /* synthetic */ Object val$key;
    final /* synthetic */ Maps$EntryTransformer val$transformer;

    public Maps$10(Maps$EntryTransformer maps$EntryTransformer, Object object) {
        this.val$transformer = maps$EntryTransformer;
        this.val$key = object;
    }

    public Object apply(Object object) {
        Maps$EntryTransformer maps$EntryTransformer = this.val$transformer;
        Object object2 = this.val$key;
        return maps$EntryTransformer.transformEntry(object2, object);
    }
}

