/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  android.text.TextUtils
 *  android.util.Log
 */
package com.google.android.play.core.assetpacks.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

public final class o {
    private final String a;

    public o(String string2) {
        int n3 = Process.myUid();
        int n4 = Process.myPid();
        this.a = string2 = z41.a("UID: [", "]  PID: [", "] ", n3, n4).concat(string2);
    }

    private static String f(String string2, String string3, Object ... object) {
        int n3 = ((Object[])object).length;
        if (n3 > 0) {
            Object object2 = Locale.US;
            try {
                string3 = String.format((Locale)object2, string3, object);
            }
            catch (IllegalFormatException illegalFormatException) {
                object2 = String.valueOf(string3);
                "Unable to format ".concat((String)object2);
                object = TextUtils.join((CharSequence)", ", (Object[])object);
                object2 = " [";
                String string4 = "]";
                string3 = y02.a(string3, (String)object2, (String)object, string4);
            }
        }
        return n1.a(string2, " : ", string3);
    }

    public final int a(String string2, Object ... objectArray) {
        String string3 = "PlayCore";
        boolean bl2 = Log.isLoggable((String)string3, (int)3);
        if (bl2) {
            string2 = o.f(this.a, string2, objectArray);
            return Log.d((String)string3, (String)string2);
        }
        return 0;
    }

    public final int b(String string2, Object ... objectArray) {
        String string3 = "PlayCore";
        boolean bl2 = Log.isLoggable((String)string3, (int)6);
        if (bl2) {
            string2 = o.f(this.a, string2, objectArray);
            return Log.e((String)string3, (String)string2);
        }
        return 0;
    }

    public final int c(Throwable throwable, String string2, Object ... objectArray) {
        String string3 = "PlayCore";
        boolean bl2 = Log.isLoggable((String)string3, (int)6);
        if (bl2) {
            string2 = o.f(this.a, string2, objectArray);
            return Log.e((String)string3, (String)string2, (Throwable)throwable);
        }
        return 0;
    }

    public final int d(String string2, Object ... objectArray) {
        String string3 = "PlayCore";
        boolean bl2 = Log.isLoggable((String)string3, (int)4);
        if (bl2) {
            string2 = o.f(this.a, string2, objectArray);
            return Log.i((String)string3, (String)string2);
        }
        return 0;
    }

    public final int e(String string2, Object ... objectArray) {
        String string3 = "PlayCore";
        boolean bl2 = Log.isLoggable((String)string3, (int)5);
        if (bl2) {
            string2 = o.f(this.a, string2, objectArray);
            return Log.w((String)string3, (String)string2);
        }
        return 0;
    }
}

