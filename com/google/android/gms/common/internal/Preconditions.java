/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 */
package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.util.zzd;
import java.util.Objects;

public final class Preconditions {
    private Preconditions() {
        AssertionError assertionError = new AssertionError((Object)"Uninstantiable");
        throw assertionError;
    }

    public static void checkArgument(boolean bl2) {
        if (bl2) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, Object object) {
        if (bl2) {
            return;
        }
        object = String.valueOf(object);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, Object ... objectArray) {
        if (bl2) {
            return;
        }
        string2 = String.format(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static double checkArgumentInRange(double d2, double d5, double d7, String string2) {
        int n3 = 2;
        int n4 = 1;
        int n7 = 3;
        Object object = d2 == d5 ? 0 : (d2 < d5 ? -1 : 1);
        if (object >= 0) {
            object = d2 == d7 ? 0 : (d2 > d7 ? 1 : -1);
            if (object <= 0) {
                return d2;
            }
            Object object2 = d5;
            Double d9 = d7;
            Object[] objectArray = new Object[n7];
            objectArray[0] = string2;
            objectArray[n4] = object2;
            objectArray[n3] = d9;
            object2 = Preconditions.zza("%s is out of range of [%f, %f] (too high)", objectArray);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object2);
            throw illegalArgumentException;
        }
        Object object3 = d5;
        Double d12 = d7;
        Object[] objectArray = new Object[n7];
        objectArray[0] = string2;
        objectArray[n4] = object3;
        objectArray[n3] = d12;
        object3 = Preconditions.zza("%s is out of range of [%f, %f] (too low)", objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object3);
        throw illegalArgumentException;
    }

    public static float checkArgumentInRange(float f5, float f6, float f7, String string2) {
        int n3 = 2;
        int n4 = 1;
        int n7 = 3;
        Object object = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (object >= 0) {
            object = f5 == f7 ? 0 : (f5 > f7 ? 1 : -1);
            if (object <= 0) {
                return f5;
            }
            Object object2 = Float.valueOf(f6);
            Float f8 = Float.valueOf(f7);
            Object[] objectArray = new Object[n7];
            objectArray[0] = string2;
            objectArray[n4] = object2;
            objectArray[n3] = f8;
            object2 = Preconditions.zza("%s is out of range of [%f, %f] (too high)", objectArray);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object2);
            throw illegalArgumentException;
        }
        Object object3 = Float.valueOf(f6);
        Float f11 = Float.valueOf(f7);
        Object[] objectArray = new Object[n7];
        objectArray[0] = string2;
        objectArray[n4] = object3;
        objectArray[n3] = f11;
        object3 = Preconditions.zza("%s is out of range of [%f, %f] (too low)", objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object3);
        throw illegalArgumentException;
    }

    public static int checkArgumentInRange(int n3, int n4, int n7, String string2) {
        int n8 = 2;
        int n10 = 1;
        int n14 = 3;
        if (n3 >= n4) {
            if (n3 <= n7) {
                return n3;
            }
            Object object = n4;
            Integer n15 = n7;
            Object[] objectArray = new Object[n14];
            objectArray[0] = string2;
            objectArray[n10] = object;
            objectArray[n8] = n15;
            object = Preconditions.zza("%s is out of range of [%d, %d] (too high)", objectArray);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        Object object = n4;
        Integer n16 = n7;
        Object[] objectArray = new Object[n14];
        objectArray[0] = string2;
        objectArray[n10] = object;
        objectArray[n8] = n16;
        object = Preconditions.zza("%s is out of range of [%d, %d] (too low)", objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public static long checkArgumentInRange(long l2, long l3, long l4, String string2) {
        int n3 = 2;
        int n4 = 1;
        int n7 = 3;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object >= 0) {
            object = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
            if (object <= 0) {
                return l2;
            }
            Object object2 = l3;
            Long l7 = l4;
            Object[] objectArray = new Object[n7];
            objectArray[0] = string2;
            objectArray[n4] = object2;
            objectArray[n3] = l7;
            object2 = Preconditions.zza("%s is out of range of [%d, %d] (too high)", objectArray);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object2);
            throw illegalArgumentException;
        }
        Object object3 = l3;
        Long l8 = l4;
        Object[] objectArray = new Object[n7];
        objectArray[0] = string2;
        objectArray[n4] = object3;
        objectArray[n3] = l8;
        object3 = Preconditions.zza("%s is out of range of [%d, %d] (too low)", objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object3);
        throw illegalArgumentException;
    }

    public static void checkHandlerThread(Handler object) {
        Object object2;
        Object object3 = Looper.myLooper();
        if (object3 != (object2 = object.getLooper())) {
            object3 = object3 != null ? object3.getThread().getName() : "null current looper";
            object = object.getLooper().getThread().getName();
            object = uc0_0.a("Must be called on ", (String)object, " thread, but got ", (String)object3, ".");
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
    }

    public static void checkHandlerThread(Handler object, String string2) {
        Looper looper = Looper.myLooper();
        if (looper == (object = object.getLooper())) {
            return;
        }
        object = new IllegalStateException(string2);
        throw object;
    }

    public static void checkMainThread() {
        Preconditions.checkMainThread("Must be called on the main application thread");
    }

    public static void checkMainThread(String string2) {
        boolean bl2 = zzd.zza();
        if (bl2) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static String checkNotEmpty(String object) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            return object;
        }
        object = new IllegalArgumentException("Given String is empty or null");
        throw object;
    }

    public static String checkNotEmpty(String object, Object object2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            return object;
        }
        object2 = String.valueOf(object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public static void checkNotGoogleApiHandlerThread() {
        Preconditions.checkNotGoogleApiHandlerThread("Must not be called on GoogleApiHandler thread.");
    }

    public static void checkNotGoogleApiHandlerThread(String string2) {
        String string3;
        boolean bl2;
        Object object = Looper.myLooper();
        if (object != null && (bl2 = Objects.equals(object = object.getThread().getName(), string3 = "GoogleApiHandler"))) {
            object = new IllegalStateException(string2);
            throw object;
        }
    }

    public static void checkNotMainThread() {
        Preconditions.checkNotMainThread("Must not be called on the main application thread");
    }

    public static void checkNotMainThread(String string2) {
        boolean bl2 = zzd.zza();
        if (!bl2) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static Object checkNotNull(Object object) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException("null reference");
        throw object;
    }

    public static Object checkNotNull(Object object, Object object2) {
        if (object != null) {
            return object;
        }
        object2 = String.valueOf(object2);
        object = new NullPointerException((String)object2);
        throw object;
    }

    public static int checkNotZero(int n3) {
        if (n3 != 0) {
            return n3;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Given Integer is zero");
        throw illegalArgumentException;
    }

    public static int checkNotZero(int n3, Object object) {
        if (n3 != 0) {
            return n3;
        }
        object = String.valueOf(object);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public static long checkNotZero(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            return l2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Given Long is zero");
        throw illegalArgumentException;
    }

    public static long checkNotZero(long l2, Object object) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            return l2;
        }
        String string2 = String.valueOf(object);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkState(boolean bl2) {
        if (bl2) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException();
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, Object object) {
        if (bl2) {
            return;
        }
        object = String.valueOf(object);
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, Object ... objectArray) {
        if (bl2) {
            return;
        }
        string2 = String.format(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static String zza(String object, Object ... objectArray) {
        int n3;
        String string2;
        int n4;
        int n7;
        int n8 = ((String)object).length();
        StringBuilder stringBuilder = new StringBuilder(n8 += 48);
        n8 = 0;
        Object object2 = null;
        int n10 = 0;
        String string3 = null;
        while (n8 < (n7 = 3) && (n4 = ((String)object).indexOf(string2 = "%s", n10)) != (n3 = -1)) {
            string3 = ((String)object).substring(n10, n4);
            stringBuilder.append(string3);
            n10 = n8 + 1;
            object2 = objectArray[n8];
            stringBuilder.append(object2);
            n8 = n4 + 2;
            int n14 = n10;
            n10 = n8;
            n8 = n14;
        }
        object = ((String)object).substring(n10);
        stringBuilder.append((String)object);
        if (n8 < n7) {
            object = " [";
            stringBuilder.append((String)object);
            int n15 = n8 + 1;
            object2 = objectArray[n8];
            stringBuilder.append(object2);
            while (n15 < n7) {
                object2 = ", ";
                stringBuilder.append((String)object2);
                n8 = n15 + 1;
                object = objectArray[n15];
                stringBuilder.append(object);
                n15 = n8;
            }
            object = "]";
            stringBuilder.append((String)object);
        }
        return stringBuilder.toString();
    }
}

