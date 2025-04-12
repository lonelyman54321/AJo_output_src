/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzfu;
import com.google.android.gms.internal.clearcut.zzfw;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class zzfy {
    private static final Charset ISO_8859_1;
    private static final Charset UTF_8;
    public static final Object zzrr;

    static {
        Object object;
        UTF_8 = Charset.forName("UTF-8");
        ISO_8859_1 = Charset.forName("ISO-8859-1");
        zzrr = object = new Object();
    }

    public static boolean equals(int[] nArray, int[] nArray2) {
        int n3;
        int n4;
        if (nArray != null && (n4 = nArray.length) != 0) {
            return Arrays.equals(nArray, nArray2);
        }
        return nArray2 == null || (n3 = nArray2.length) == 0;
        {
        }
    }

    public static boolean equals(long[] lArray, long[] lArray2) {
        int n3;
        int n4;
        if (lArray != null && (n4 = lArray.length) != 0) {
            return Arrays.equals(lArray, lArray2);
        }
        return lArray2 == null || (n3 = lArray2.length) == 0;
        {
        }
    }

    public static boolean equals(Object[] objectArray, Object[] objectArray2) {
        int n3 = objectArray == null ? 0 : objectArray.length;
        int n4 = objectArray2 == null ? 0 : objectArray2.length;
        int n7 = 0;
        int n8 = 0;
        while (true) {
            Object object;
            boolean bl2;
            Object object2;
            if (n7 < n3 && (object2 = objectArray[n7]) == null) {
                ++n7;
                continue;
            }
            while (n8 < n4 && (object2 = objectArray2[n8]) == null) {
                ++n8;
            }
            boolean bl3 = true;
            if (n7 >= n3) {
                bl2 = true;
            } else {
                bl2 = false;
                object = null;
            }
            boolean bl4 = n8 >= n4;
            if (bl2 && bl4) {
                return bl3;
            }
            if (bl2 != bl4) {
                return false;
            }
            object2 = objectArray[n7];
            object = objectArray2[n8];
            bl3 = object2.equals(object);
            if (!bl3) {
                return false;
            }
            ++n7;
            ++n8;
        }
    }

    public static int hashCode(int[] nArray) {
        int n3;
        if (nArray != null && (n3 = nArray.length) != 0) {
            return Arrays.hashCode(nArray);
        }
        return 0;
    }

    public static int hashCode(long[] lArray) {
        int n3;
        if (lArray != null && (n3 = lArray.length) != 0) {
            return Arrays.hashCode(lArray);
        }
        return 0;
    }

    public static int hashCode(Object[] objectArray) {
        int n3 = objectArray == null ? 0 : objectArray.length;
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7;
            Object object = objectArray[i3];
            if (object == null) continue;
            n4 *= 31;
            n4 = n7 = object.hashCode() + n4;
        }
        return n4;
    }

    public static int zza(byte[][] byArray) {
        int n3 = byArray == null ? 0 : byArray.length;
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7;
            byte[] byArray2 = byArray[i3];
            if (byArray2 == null) continue;
            n4 *= 31;
            n4 = n7 = Arrays.hashCode(byArray2) + n4;
        }
        return n4;
    }

    public static void zza(zzfu object, zzfu zzfu2) {
        object = ((zzfu)object).zzrj;
        if (object != null) {
            zzfu2.zzrj = object = (zzfw)((zzfw)object).clone();
        }
    }

    public static boolean zza(byte[][] byArray, byte[][] byArray2) {
        int n3 = byArray == null ? 0 : byArray.length;
        int n4 = byArray2 == null ? 0 : byArray2.length;
        int n7 = 0;
        int n8 = 0;
        while (true) {
            byte[] byArray3;
            boolean bl2;
            byte[] byArray4;
            if (n7 < n3 && (byArray4 = byArray[n7]) == null) {
                ++n7;
                continue;
            }
            while (n8 < n4 && (byArray4 = byArray2[n8]) == null) {
                ++n8;
            }
            boolean bl3 = true;
            if (n7 >= n3) {
                bl2 = true;
            } else {
                bl2 = false;
                byArray3 = null;
            }
            boolean bl4 = n8 >= n4;
            if (bl2 && bl4) {
                return bl3;
            }
            if (bl2 != bl4) {
                return false;
            }
            byArray4 = byArray[n7];
            byArray3 = byArray2[n8];
            bl3 = Arrays.equals(byArray4, byArray3);
            if (!bl3) {
                return false;
            }
            ++n7;
            ++n8;
        }
    }
}

