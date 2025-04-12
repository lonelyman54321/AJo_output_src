/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.android.installreferrer.commons;

import android.util.Log;

public final class InstallReferrerCommons {
    public static void logVerbose(String string2, String string3) {
        Log.isLoggable((String)string2, (int)2);
    }

    public static void logWarn(String string2, String string3) {
        Log.isLoggable((String)string2, (int)5);
    }
}

