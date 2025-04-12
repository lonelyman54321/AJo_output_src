/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.common.collect.Maps$AsMapView;
import com.google.common.collect.Maps$EntrySet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Maps$AsMapView$1EntrySetImpl
extends Maps$EntrySet {
    final /* synthetic */ Maps$AsMapView this$0;

    public Maps$AsMapView$1EntrySetImpl(Maps$AsMapView maps$AsMapView) {
        this.this$0 = maps$AsMapView;
    }

    public Iterator iterator() {
        Set set = this.this$0.backingSet();
        Function function = this.this$0.function;
        return Maps.asMapEntryIterator(set, function);
    }

    public Map map() {
        return this.this$0;
    }
}

