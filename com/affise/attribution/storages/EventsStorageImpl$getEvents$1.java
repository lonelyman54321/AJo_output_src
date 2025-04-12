/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.storages;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

final class EventsStorageImpl$getEvents$1
extends Lambda
implements Function1 {
    public static final EventsStorageImpl$getEvents$1 INSTANCE;

    static {
        EventsStorageImpl$getEvents$1 eventsStorageImpl$getEvents$1;
        INSTANCE = eventsStorageImpl$getEvents$1 = new EventsStorageImpl$getEvents$1();
    }

    public EventsStorageImpl$getEvents$1() {
        super(1);
    }

    public final Boolean invoke(File file) {
        return file.isFile();
    }
}

