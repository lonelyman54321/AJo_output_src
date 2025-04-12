/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.graph.AbstractBaseGraph$2;

public final class a
implements Function {
    public final /* synthetic */ AbstractBaseGraph$2 a;

    public /* synthetic */ a(AbstractBaseGraph$2 abstractBaseGraph$2) {
        this.a = abstractBaseGraph$2;
    }

    public final Object apply(Object object) {
        return AbstractBaseGraph$2.d(this.a, object);
    }
}

