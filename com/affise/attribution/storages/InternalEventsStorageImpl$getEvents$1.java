/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.storages;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

final class InternalEventsStorageImpl$getEvents$1
extends Lambda
implements Function1 {
    public static final InternalEventsStorageImpl$getEvents$1 INSTANCE;

    static {
        InternalEventsStorageImpl$getEvents$1 internalEventsStorageImpl$getEvents$1;
        INSTANCE = internalEventsStorageImpl$getEvents$1 = new InternalEventsStorageImpl$getEvents$1();
    }

    public InternalEventsStorageImpl$getEvents$1() {
        super(1);
    }

    public final Boolean invoke(File file) {
        return file.isFile();
    }
}

