/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.internal.location.zzes;

public final class zzer {
    public static void zza(boolean bl2) {
        if (bl2) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public static void zzb(boolean bl2, Object object) {
        if (bl2) {
            return;
        }
        object = (String)object;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public static int zzc(int n3, int n4, String string2) {
        Object object;
        int n7 = 2;
        int n8 = 1;
        if (n3 >= 0 && n3 < n4) {
            return n3;
        }
        String string3 = "index";
        if (n3 >= 0) {
            if (n4 < 0) {
                n7 = String.valueOf(n4).length();
                StringBuilder stringBuilder = new StringBuilder(n7 += 15);
                stringBuilder.append("negative size: ");
                stringBuilder.append(n4);
                String string4 = stringBuilder.toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string4);
                throw illegalArgumentException;
            }
            object = n3;
            Integer n10 = n4;
            int n14 = 3;
            Object[] objectArray = new Object[n14];
            objectArray[0] = string3;
            objectArray[n8] = object;
            objectArray[n7] = n10;
            object = zzes.zza("%s (%s) must be less than size (%s)", objectArray);
        } else {
            object = n3;
            Object[] objectArray = new Object[n7];
            objectArray[0] = string3;
            objectArray[n8] = object;
            object = zzes.zza("%s (%s) must not be negative", objectArray);
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)object);
        throw indexOutOfBoundsException;
    }

    public static int zzd(int n3, int n4, String object) {
        if (n3 >= 0 && n3 <= n4) {
            return n3;
        }
        String string2 = zzer.zzf(n3, n4, "index");
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public static void zze(int n3, int n4, int n7) {
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
                object = zzes.zza("end index (%s) must not be less than start index (%s)", objectArray);
            } else {
                object = zzer.zzf(n4, n7, "end index");
            }
        } else {
            String string2 = "start index";
            object = zzer.zzf(n3, n7, string2);
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)object);
        throw indexOutOfBoundsException;
    }

    private static String zzf(int n3, int n4, String string2) {
        int n7 = 1;
        int n8 = 2;
        if (n3 < 0) {
            Integer n10 = n3;
            Object[] objectArray = new Object[n8];
            objectArray[0] = string2;
            objectArray[n7] = n10;
            return zzes.zza("%s (%s) must not be negative", objectArray);
        }
        if (n4 >= 0) {
            Integer n14 = n3;
            Integer n15 = n4;
            Object[] objectArray = new Object[3];
            objectArray[0] = string2;
            objectArray[n7] = n14;
            objectArray[n8] = n15;
            return zzes.zza("%s (%s) must not be greater than size (%s)", objectArray);
        }
        int n16 = String.valueOf(n4).length();
        StringBuilder stringBuilder = new StringBuilder(n16 += 15);
        stringBuilder.append("negative size: ");
        stringBuilder.append(n4);
        String string3 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }
}

