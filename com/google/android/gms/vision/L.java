/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.google.android.gms.vision;

import android.util.Log;

public class L {
    public static final String TAG = "Vision";

    public static int d(String string2, Object ... objectArray) {
        String string3 = TAG;
        boolean bl2 = Log.isLoggable((String)string3, (int)3);
        if (bl2) {
            string2 = String.format(string2, objectArray);
            return Log.d((String)string3, (String)string2);
        }
        return 0;
    }

    public static int d(Throwable throwable, String string2, Object ... objectArray) {
        String string3 = TAG;
        boolean bl2 = Log.isLoggable((String)string3, (int)3);
        if (bl2) {
            string2 = String.format(string2, objectArray);
            return Log.d((String)string3, (String)string2, (Throwable)throwable);
        }
        return 0;
    }

    public static int e(String string2, Object ... objectArray) {
        String string3 = TAG;
        boolean bl2 = Log.isLoggable((String)string3, (int)6);
        if (bl2) {
            string2 = String.format(string2, objectArray);
            return Log.e((String)string3, (String)string2);
        }
        return 0;
    }

    public static int e(Throwable object, String string2, Object ... object2) {
        String string3 = TAG;
        int n3 = Log.isLoggable((String)string3, (int)6);
        if (n3 != 0) {
            n3 = Log.isLoggable((String)string3, (int)3);
            if (n3 != 0) {
                string2 = String.format(string2, (Object[])object2);
                return Log.e((String)string3, (String)string2, (Throwable)object);
            }
            string2 = String.format(string2, (Object[])object2);
            object = String.valueOf(object);
            int n4 = string2.length() + 2;
            n3 = ((String)object).length() + n4;
            object2 = new StringBuilder(n3);
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append(": ");
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
            return Log.e((String)string3, (String)object);
        }
        return 0;
    }

    public static int i(String string2, Object ... objectArray) {
        String string3 = TAG;
        boolean bl2 = Log.isLoggable((String)string3, (int)4);
        if (bl2) {
            string2 = String.format(string2, objectArray);
            return Log.i((String)string3, (String)string2);
        }
        return 0;
    }

    public static int v(String string2, Object ... objectArray) {
        String string3 = TAG;
        boolean bl2 = Log.isLoggable((String)string3, (int)2);
        if (bl2) {
            string2 = String.format(string2, objectArray);
            return Log.v((String)string3, (String)string2);
        }
        return 0;
    }

    public static int w(String string2, Object ... objectArray) {
        String string3 = TAG;
        boolean bl2 = Log.isLoggable((String)string3, (int)5);
        if (bl2) {
            string2 = String.format(string2, objectArray);
            return Log.w((String)string3, (String)string2);
        }
        return 0;
    }

    public static int w(Throwable object, String string2, Object ... object2) {
        String string3 = TAG;
        int n3 = Log.isLoggable((String)string3, (int)5);
        if (n3 != 0) {
            n3 = Log.isLoggable((String)string3, (int)3);
            if (n3 != 0) {
                string2 = String.format(string2, (Object[])object2);
                return Log.w((String)string3, (String)string2, (Throwable)object);
            }
            string2 = String.format(string2, (Object[])object2);
            object = String.valueOf(object);
            int n4 = string2.length() + 2;
            n3 = ((String)object).length() + n4;
            object2 = new StringBuilder(n3);
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append(": ");
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
            return Log.w((String)string3, (String)object);
        }
        return 0;
    }
}

