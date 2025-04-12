/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.Locale;

public final class zzes {
    public static final /* synthetic */ int zza;
    private static final byte[] zzb;
    private static final String[] zzc;

    static {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[4];
        byte[] byArray3 = byArray;
        byArray2[0] = 0;
        byArray3[1] = 0;
        byArray2[2] = 0;
        byArray3[3] = 1;
        zzb = byArray;
        zzc = new String[]{"", "A", "B", "C"};
    }

    public static String zza(int n3, int n4, int n7) {
        Integer n8 = n3;
        Integer n10 = n4;
        Integer n14 = n7;
        Object[] objectArray = new Object[]{n8, n10, n14};
        return String.format("avc1.%02X%02X%02X", objectArray);
    }

    public static String zzb(int n3, boolean n4, int n7, int n8, int[] nArray, int n10) {
        String[] stringArray = zzc;
        Object object = stringArray[n3];
        Object object2 = n7;
        Object[] objectArray = Integer.valueOf(n8);
        int n14 = 1;
        n4 = n14 != n4 ? 76 : 72;
        Object object3 = Character.valueOf((char)n4);
        Integer n15 = n10;
        int n16 = 5;
        Object[] objectArray2 = new Object[n16];
        objectArray2[0] = object;
        objectArray2[n14] = object2;
        objectArray2[2] = objectArray;
        objectArray2[3] = object3;
        objectArray2[4] = n15;
        object = Locale.US;
        object3 = "hvc1.%s%d.%X.%c%d";
        object = String.format((Locale)object, (String)object3, objectArray2);
        StringBuilder stringBuilder = new StringBuilder((String)object);
        n3 = 6;
        while (n3 > 0 && (n7 = nArray[n4 = n3 + -1]) == 0) {
            n3 = n4;
        }
        object3 = null;
        for (n4 = 0; n4 < n3; n4 += n14) {
            n7 = nArray[n4];
            object2 = n7;
            objectArray = new Object[n14];
            objectArray[0] = object2;
            object2 = String.format(".%02X", objectArray);
            stringBuilder.append((String)object2);
        }
        return stringBuilder.toString();
    }

    public static byte[] zzc(byte[] byArray, int n3, int n4) {
        byte[] byArray2 = new byte[n4 + 4];
        byte[] byArray3 = zzb;
        int n7 = 4;
        System.arraycopy(byArray3, 0, byArray2, 0, n7);
        System.arraycopy(byArray, n3, byArray2, n7, n4);
        return byArray2;
    }
}

