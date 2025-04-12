/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.util.Log
 */
package com.google.android.datatransport.runtime.logging;

import android.os.Build;
import android.util.Log;

public final class Logging {
    private static final String LOG_PREFIX = "TRuntime.";
    private static final int MAX_LOG_TAG_SIZE_IN_SDK_N = 23;

    private Logging() {
    }

    private static String concatTag(String string2, String string3) {
        int n3;
        int n4 = (string2 = Ft2.a(string2, string3)).length();
        if (n4 > (n3 = 23)) {
            n4 = 0;
            string3 = null;
            string2 = string2.substring(0, n3);
        }
        return string2;
    }

    public static void d(String string2, String string3) {
        Log.isLoggable((String)Logging.getTag(string2), (int)3);
    }

    public static void d(String objectArray, String string2, Object object) {
        int n3;
        int n4 = (int)(Log.isLoggable((String)(objectArray = Logging.getTag((String)objectArray)), (int)(n3 = 3)) ? 1 : 0);
        if (n4 != 0) {
            n4 = 1;
            objectArray = new Object[n4];
            n3 = 0;
            objectArray[0] = object;
            String.format(string2, objectArray);
        }
    }

    public static void d(String objectArray, String string2, Object object, Object object2) {
        int n3;
        int n4 = Log.isLoggable((String)(objectArray = Logging.getTag((String)objectArray)), (int)(n3 = 3));
        if (n4 != 0) {
            n4 = 2;
            objectArray = new Object[n4];
            n3 = 0;
            objectArray[0] = object;
            int n7 = 1;
            objectArray[n7] = object2;
            String.format(string2, objectArray);
        }
    }

    public static void d(String string2, String string3, Object ... objectArray) {
        int n3;
        boolean bl2 = Log.isLoggable((String)(string2 = Logging.getTag(string2)), (int)(n3 = 3));
        if (bl2) {
            String.format(string3, objectArray);
        }
    }

    public static void e(String string2, String string3, Throwable throwable) {
        Log.isLoggable((String)Logging.getTag(string2), (int)6);
    }

    private static String getTag(String string2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        String string3 = LOG_PREFIX;
        if (n3 < n4) {
            return Logging.concatTag(string3, string2);
        }
        return kp1_0.c(string3, string2);
    }

    public static void i(String objectArray, String string2, Object object) {
        int n3;
        int n4 = (int)(Log.isLoggable((String)(objectArray = Logging.getTag((String)objectArray)), (int)(n3 = 4)) ? 1 : 0);
        if (n4 != 0) {
            n4 = 1;
            objectArray = new Object[n4];
            n3 = 0;
            objectArray[0] = object;
            String.format(string2, objectArray);
        }
    }

    public static void w(String objectArray, String string2, Object object) {
        int n3;
        int n4 = (int)(Log.isLoggable((String)(objectArray = Logging.getTag((String)objectArray)), (int)(n3 = 5)) ? 1 : 0);
        if (n4 != 0) {
            n4 = 1;
            objectArray = new Object[n4];
            n3 = 0;
            objectArray[0] = object;
            String.format(string2, objectArray);
        }
    }
}

