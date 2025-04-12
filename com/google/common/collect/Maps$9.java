/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Maps$EntryTransformer;

class Maps$9
implements Maps$EntryTransformer {
    final /* synthetic */ Function val$function;

    public Maps$9(Function function) {
        this.val$function = function;
    }

    public Object transformEntry(Object object, Object object2) {
        return this.val$function.apply(object2);
    }
}

