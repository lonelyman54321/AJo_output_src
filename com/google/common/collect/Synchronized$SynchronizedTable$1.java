/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Synchronized;
import com.google.common.collect.Synchronized$SynchronizedTable;
import java.util.Map;

class Synchronized$SynchronizedTable$1
implements Function {
    final /* synthetic */ Synchronized$SynchronizedTable this$0;

    public Synchronized$SynchronizedTable$1(Synchronized$SynchronizedTable synchronized$SynchronizedTable) {
        this.this$0 = synchronized$SynchronizedTable;
    }

    public Map apply(Map map2) {
        Object object = this.this$0.mutex;
        return Synchronized.map(map2, object);
    }
}

