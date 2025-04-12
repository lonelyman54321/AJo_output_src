/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzpc;
import com.google.android.gms.measurement.internal.zzpp;

final class zzpd
implements zzpp {
    final /* synthetic */ zzou zza;

    public zzpd(zzou zzou2) {
        this.zza = zzou2;
    }

    public final void zza(String object, String string2, Bundle bundle) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            object = zzou.zza(this.zza);
            if (object != null) {
                zzou.zza(this.zza).zzj().zzg().zza("AppId not known when logging event", string2);
                return;
            }
        } else {
            zzhv zzhv2 = this.zza.zzl();
            zzpc zzpc2 = new zzpc(this, (String)object, string2, bundle);
            zzhv2.zzb(zzpc2);
        }
    }
}

