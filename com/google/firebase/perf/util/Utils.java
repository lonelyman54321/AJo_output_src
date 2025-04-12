/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.firebase.perf.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.firebase.perf.logging.AndroidLogger;
import kotlin.jvm.internal.Intrinsics;

public class Utils {
    private static Boolean isDebugLoggingEnabled;

    public static int bufferToInt(byte[] byArray) {
        int n3;
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = 4) && i3 < (n3 = byArray.length); ++i3) {
            n3 = byArray[i3] & 0xFF;
            int n7 = i3 * 8;
            n4 |= (n3 <<= n7);
        }
        return n4;
    }

    public static void checkArgument(boolean bl2, String string2) {
        if (bl2) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static boolean isDebugLoggingEnabled(Context object) {
        String string2;
        Boolean bl2 = isDebugLoggingEnabled;
        if (bl2 != null) {
            return bl2;
        }
        bl2 = null;
        Object object2 = object.getPackageManager();
        object = object.getPackageName();
        int n3 = 128;
        object = object2.getApplicationInfo((String)object, n3);
        object = ((ApplicationInfo)object).metaData;
        object2 = "firebase_performance_logcat_enabled";
        boolean bl3 = object.getBoolean((String)object2, false);
        object = bl3;
        try {
            isDebugLoggingEnabled = object;
            return (Boolean)object;
        }
        catch (NullPointerException nullPointerException) {
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            // empty catch block
        }
        object2 = AndroidLogger.getInstance();
        StringBuilder stringBuilder = new StringBuilder("No perf logcat meta data found ");
        string2 = ((Throwable)((Object)string2)).getMessage();
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        object2.debug(string2);
        return false;
    }

    public static int saturatedIntCast(long l2) {
        long l3 = Integer.MAX_VALUE;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            return -1 >>> 1;
        }
        l3 = 0x80000000L;
        long l7 = l2 - l3;
        object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object < 0) {
            return -1 << -1;
        }
        return (int)l2;
    }

    public static String stripSensitiveInfo(String object) {
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = new Ob1$a();
        try {
            ((Ob1$a)object2).e(null, (String)object);
            object2 = ((Ob1$a)object2).b();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            object2 = null;
        }
        if (object2 != null) {
            object = ((ob1_1)object2).f();
            String string2 = "";
            Intrinsics.checkNotNullParameter(string2, "username");
            ((Ob1$a)object).b = object2 = Ob1$b.a(string2, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
            string2 = "";
            Intrinsics.checkNotNullParameter(string2, "password");
            int n3 = 251;
            String string3 = " \"':;<=>@[]^`{}|/\\?#";
            ((Ob1$a)object).c = object2 = Ob1$b.a(string2, 0, 0, string3, false, false, false, false, null, n3);
            ((Ob1$a)object).g = null;
            ((Ob1$a)object).h = null;
            object = ((Ob1$a)object).toString();
        }
        return object;
    }

    public static String truncateURL(String string2, int n3) {
        int n4;
        int n7 = string2.length();
        if (n7 <= n3) {
            return string2;
        }
        n7 = string2.charAt(n3);
        if (n7 == (n4 = 47)) {
            return string2.substring(0, n3);
        }
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        ob1_1 ob1_12 = null;
        try {
            Intrinsics.checkNotNullParameter(string2, (String)object);
        }
        catch (IllegalArgumentException illegalArgumentException) {}
        object = new Ob1$a();
        ((Ob1$a)object).e(null, string2);
        ob1_12 = ((Ob1$a)object).b();
        if (ob1_12 == null) {
            return string2.substring(0, n3);
        }
        object = ob1_12.b();
        n7 = ((String)object).lastIndexOf(n4);
        if (n7 >= 0) {
            n7 = n3 + -1;
            if ((n7 = string2.lastIndexOf(n4, n7)) >= 0) {
                return string2.substring(0, n7);
            }
        }
        return string2.substring(0, n3);
    }
}

