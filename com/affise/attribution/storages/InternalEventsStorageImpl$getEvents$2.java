/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.storages;

import com.affise.attribution.utils.TimestampKt;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

final class InternalEventsStorageImpl$getEvents$2
extends Lambda
implements Function1 {
    public static final InternalEventsStorageImpl$getEvents$2 INSTANCE;

    static {
        InternalEventsStorageImpl$getEvents$2 internalEventsStorageImpl$getEvents$2;
        INSTANCE = internalEventsStorageImpl$getEvents$2 = new InternalEventsStorageImpl$getEvents$2();
    }

    public InternalEventsStorageImpl$getEvents$2() {
        super(1);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Boolean invoke(File file) {
        long l2 = file.lastModified();
        long l3 = TimestampKt.timestamp();
        long l4 = 604800000;
        long l7 = l2 - (l3 -= l4);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        boolean bl2 = object > 0;
        Boolean bl3 = bl2;
        if (bl2) return bl3;
        try {
            // empty try
        }
        catch (Throwable throwable) {
            vl2_2.a(throwable);
            return bl3;
        }
        {
            file.delete();
            return bl3;
        }
    }
}

