/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore;
import java.io.File;
import java.io.FilenameFilter;

public final class a
implements FilenameFilter {
    public final boolean accept(File file, String string2) {
        return CrashlyticsAppQualitySessionsStore.a(file, string2);
    }
}

