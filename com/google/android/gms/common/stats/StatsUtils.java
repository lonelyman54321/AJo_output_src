/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.PowerManager$WakeLock
 *  android.os.Process
 *  android.text.TextUtils
 */
package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;

public class StatsUtils {
    public static String getEventKey(PowerManager.WakeLock object, String string2) {
        long l2 = Process.myPid();
        long l3 = System.identityHashCode(object);
        int n3 = 32;
        l2 = l2 << n3 | l3;
        object = String.valueOf(l2);
        boolean bl2 = true;
        boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2 == bl3) {
            string2 = "";
        }
        object = String.valueOf(object);
        string2 = String.valueOf(string2);
        return ((String)object).concat(string2);
    }
}

