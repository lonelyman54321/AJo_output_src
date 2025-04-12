/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.common.collect.Tables$TransformedTable;
import java.util.Map;

class Tables$TransformedTable$3
implements Function {
    final /* synthetic */ Tables$TransformedTable this$0;

    public Tables$TransformedTable$3(Tables$TransformedTable tables$TransformedTable) {
        this.this$0 = tables$TransformedTable;
    }

    public Map apply(Map map2) {
        Function function = this.this$0.function;
        return Maps.transformValues(map2, function);
    }
}

