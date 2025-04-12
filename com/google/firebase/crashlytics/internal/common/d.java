/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.CrashlyticsController;
import java.io.File;
import java.io.FilenameFilter;

public final class d
implements FilenameFilter {
    public final boolean accept(File file, String string2) {
        return CrashlyticsController.a(file, string2);
    }
}

