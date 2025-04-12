/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.google.android.gms.internal.ads;

import android.util.Base64;

public final class zzavo {
    /*
     * WARNING - void declaration
     */
    public static String zza(byte[] byArray, boolean bl2) {
        void var1_4;
        boolean bl3 = true;
        if (bl3 != bl2) {
            int n3 = 2;
        } else {
            int n4 = 11;
        }
        return Base64.encodeToString((byte[])byArray, (int)var1_4);
    }

    public static byte[] zzb(String string2, boolean bl2) {
        int n3 = 2;
        Object object = Base64.decode((String)string2, (int)n3);
        int n4 = ((byte[])object).length;
        if (n4 == 0 && (n4 = string2.length()) > 0) {
            string2 = "Unable to decode ".concat(string2);
            object = new IllegalArgumentException;
            object(string2);
            throw object;
        }
        return object;
    }
}

