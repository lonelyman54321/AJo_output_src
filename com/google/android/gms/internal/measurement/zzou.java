/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.android.gms.internal.measurement.zzhu;
import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzif;
import com.google.android.gms.internal.measurement.zzor;

public final class zzou
implements zzor {
    private static final zzhx zza;

    static {
        Uri uri = zzhu.zza("com.google.android.gms.measurement");
        zzif zzif2 = new zzif(uri);
        zzif2 = zzif2.zzb().zza();
        boolean bl2 = true;
        zzif2.zza("measurement.sdk.collection.enable_extend_user_property_size", bl2);
        zzif2.zza("measurement.sdk.collection.last_deep_link_referrer2", bl2);
        zza = zzif2.zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        zzif2.zza("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    public final boolean zza() {
        return (Boolean)zza.zza();
    }
}

