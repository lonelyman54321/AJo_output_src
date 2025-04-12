/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.common.util;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

public final class CrashUtils {
    private static final String[] zza = new String[]{"android.", "com.android.", "dalvik.", "java.", "javax."};

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean addDynamiteErrorToDropBox(Context context, Throwable throwable) {
        try {
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(throwable);
            return false;
        }
        catch (Exception exception) {
            return false;
        }
    }
}

