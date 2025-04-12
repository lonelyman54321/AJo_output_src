/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.StandardTable$ColumnMap$ColumnMapEntrySet;
import java.util.Map;

class StandardTable$ColumnMap$ColumnMapEntrySet$1
implements Function {
    final /* synthetic */ StandardTable$ColumnMap$ColumnMapEntrySet this$2;

    public StandardTable$ColumnMap$ColumnMapEntrySet$1(StandardTable$ColumnMap$ColumnMapEntrySet columnMapEntrySet) {
        this.this$2 = columnMapEntrySet;
    }

    public Map apply(Object object) {
        return this.this$2.this$1.this$0.column(object);
    }
}

