/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzdg;

public final class zzde {
    public static int zza(int n3, int n4) {
        Object object;
        int n7 = 2;
        int n8 = 1;
        if (n3 >= 0 && n3 < n4) {
            return n3;
        }
        String string2 = "index";
        if (n3 >= 0) {
            if (n4 < 0) {
                String string3 = tk3_2.a(26, n4, "negative size: ");
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
                throw illegalArgumentException;
            }
            object = n3;
            Integer n10 = n4;
            int n14 = 3;
            Object[] objectArray = new Object[n14];
            objectArray[0] = string2;
            objectArray[n8] = object;
            objectArray[n7] = n10;
            object = zzdg.zza("%s (%s) must be less than size (%s)", objectArray);
        } else {
            object = n3;
            Object[] objectArray = new Object[n7];
            objectArray[0] = string2;
            objectArray[n8] = object;
            object = zzdg.zza("%s (%s) must not be negative", objectArray);
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)object);
        throw indexOutOfBoundsException;
    }

    public static Object zza(Object object) {
        object.getClass();
        return object;
    }

    public static Object zza(Object object, Object object2) {
        if (object != null) {
            return object;
        }
        object2 = String.valueOf(object2);
        object = new NullPointerException((String)object2);
        throw object;
    }

    private static String zza(int n3, int n4, String string2) {
        int n7 = 1;
        int n8 = 2;
        if (n3 < 0) {
            Integer n10 = n3;
            Object[] objectArray = new Object[n8];
            objectArray[0] = string2;
            objectArray[n7] = n10;
            return zzdg.zza("%s (%s) must not be negative", objectArray);
        }
        if (n4 >= 0) {
            Integer n14 = n3;
            Integer n15 = n4;
            Object[] objectArray = new Object[3];
            objectArray[0] = string2;
            objectArray[n7] = n14;
            objectArray[n8] = n15;
            return zzdg.zza("%s (%s) must not be greater than size (%s)", objectArray);
        }
        String string3 = tk3_2.a(26, n4, "negative size: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public static void zza(int n3, int n4, int n7) {
        Object object;
        if (n3 >= 0 && n4 >= n3 && n4 <= n7) {
            return;
        }
        if (n3 >= 0 && n3 <= n7) {
            if (n4 >= 0 && n4 <= n7) {
                Integer n8 = n4;
                object = n3;
                n7 = 2;
                Object[] objectArray = new Object[n7];
                objectArray[0] = n8;
                n4 = 1;
                objectArray[n4] = object;
                object = zzdg.zza("end index (%s) must not be less than start index (%s)", objectArray);
            } else {
                object = zzde.zza(n4, n7, "end index");
            }
        } else {
            String string2 = "start index";
            object = zzde.zza(n3, n7, string2);
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)object);
        throw indexOutOfBoundsException;
    }

    public static void zza(boolean bl2, Object object) {
        if (bl2) {
            return;
        }
        object = String.valueOf(object);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public static int zzb(int n3, int n4) {
        if (n3 >= 0 && n3 <= n4) {
            return n3;
        }
        String string2 = zzde.zza(n3, n4, "index");
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public static void zzb(boolean bl2, Object object) {
        if (bl2) {
            return;
        }
        object = String.valueOf(object);
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }
}

