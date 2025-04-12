/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore;
import java.io.File;
import java.util.Comparator;

public final class b
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (File)object;
        object2 = (File)object2;
        return CrashlyticsAppQualitySessionsStore.b((File)object, (File)object2);
    }
}

