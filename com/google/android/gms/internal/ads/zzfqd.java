/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzfoh;

public final class zzfqd {
    public static void zza() {
        boolean bl2 = zzfoh.zzb();
        if (bl2) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Method called before OM SDK activation");
        throw illegalStateException;
    }

    public static void zzb(String object, String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            return;
        }
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static void zzc(Object object, String string2) {
        if (object != null) {
            return;
        }
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static void zzd(String object, int n3, String string2) {
        int n4 = ((String)object).length();
        if (n4 <= (n3 = 256)) {
            return;
        }
        object = new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
        throw object;
    }
}

