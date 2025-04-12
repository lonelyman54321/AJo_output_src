/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class zzeq {
    public static int zza(int n3, int n4, int n7) {
        if (n3 >= 0 && n3 < n7) {
            return n3;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
        throw indexOutOfBoundsException;
    }

    public static Object zzb(Object object) {
        if (object != null) {
            return object;
        }
        object = new IllegalStateException();
        throw object;
    }

    public static String zzc(String object) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            return object;
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public static void zzd(boolean bl2) {
        if (bl2) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public static void zze(boolean bl2, Object object) {
        if (bl2) {
            return;
        }
        object = (String)object;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public static void zzf(boolean bl2) {
        if (bl2) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException();
        throw illegalStateException;
    }

    public static void zzg(boolean bl2, Object object) {
        if (bl2) {
            return;
        }
        object = (String)object;
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }
}

