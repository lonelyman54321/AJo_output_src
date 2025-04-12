/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbfa;

final class zzbez
extends zzbfa {
    private static final String zzb(String string2) {
        char c2;
        int n3;
        int n4;
        int n7 = TextUtils.isEmpty((CharSequence)string2);
        if (n7 != 0) {
            return string2;
        }
        n7 = string2.length();
        int n8 = 0;
        int n10 = 0;
        while (true) {
            n4 = string2.length();
            n3 = 44;
            if (n10 >= n4 || (n4 = (int)string2.charAt(n10)) != n3) break;
            ++n10;
        }
        while (n7 > 0 && (c2 = string2.charAt(n4 = n7 + -1)) == n3) {
            n7 = n4;
        }
        if (n7 < n10) {
            return null;
        }
        if (n10 == 0) {
            n10 = string2.length();
            if (n7 == n10) {
                return string2;
            }
        } else {
            n8 = n10;
        }
        return string2.substring(n8, n7);
    }

    public final String zza(String string2, String string3) {
        string2 = zzbez.zzb(string2);
        string3 = zzbez.zzb(string3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return string3;
        }
        bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (bl2) {
            return string2;
        }
        return n1.a(string2, ",", string3);
    }
}

