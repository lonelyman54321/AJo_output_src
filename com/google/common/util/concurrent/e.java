/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate;

public final class e
implements Supplier {
    public final /* synthetic */ AbstractScheduledService$ServiceDelegate a;

    public /* synthetic */ e(AbstractScheduledService$ServiceDelegate abstractScheduledService$ServiceDelegate) {
        this.a = abstractScheduledService$ServiceDelegate;
    }

    public final Object get() {
        return AbstractScheduledService$ServiceDelegate.a(this.a);
    }
}

