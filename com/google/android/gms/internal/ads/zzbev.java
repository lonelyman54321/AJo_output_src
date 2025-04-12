/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbes;
import com.google.android.gms.internal.ads.zzbeu;
import java.util.Map;

public final class zzbev {
    public static final void zza(zzbeu object, zzbes object2) {
        Object object3 = ((zzbes)object2).zza();
        if (object3 != null) {
            object3 = ((zzbes)object2).zzb();
            boolean bl2 = TextUtils.isEmpty((CharSequence)object3);
            if (!bl2) {
                object3 = ((zzbes)object2).zza();
                String string2 = ((zzbes)object2).zzb();
                String string3 = ((zzbes)object2).zzc();
                object2 = ((zzbes)object2).zzd();
                ((zzbeu)object).zzd((Context)object3, string2, string3, (Map)object2);
                return;
            }
            object = new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
            throw object;
        }
        object = new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        throw object;
    }
}

