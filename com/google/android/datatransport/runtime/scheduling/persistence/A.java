/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function;

public final class A
implements SQLiteEventStore$Function {
    public final Object apply(Object object) {
        return SQLiteEventStore.h((Throwable)object);
    }
}

