/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.common.collect.TransformedIterator;
import java.util.Iterator;
import java.util.Map;

class Maps$3
extends TransformedIterator {
    final /* synthetic */ Function val$function;

    public Maps$3(Iterator iterator, Function function) {
        this.val$function = function;
        super(iterator);
    }

    public Map.Entry transform(Object object) {
        Object object2 = this.val$function.apply(object);
        return Maps.immutableEntry(object, object2);
    }
}

