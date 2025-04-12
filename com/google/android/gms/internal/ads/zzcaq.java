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
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzcau;

public final class zzcaq
implements zzban {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzcaq(Context object, String string2) {
        Context context = object.getApplicationContext();
        if (context != null) {
            object = object.getApplicationContext();
        }
        this.zza = object;
        this.zzc = string2;
        this.zzd = false;
        this.zzb = object;
    }

    public final String zza() {
        return this.zzc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(boolean bl2) {
        Context context;
        Object object = zzu.zzn();
        boolean bl3 = ((zzcau)object).zzp(context = this.zza);
        if (!bl3) {
            return;
        }
        object = this.zzb;
        synchronized (object) {
            Throwable throwable2;
            block8: {
                try {
                    boolean bl4 = this.zzd;
                    if (bl4 == bl2) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                this.zzd = bl2;
                Object object2 = this.zzc;
                bl2 = TextUtils.isEmpty((CharSequence)object2);
                if (bl2) {
                    return;
                }
                bl2 = this.zzd;
                if (bl2) {
                    object2 = zzu.zzn();
                    context = this.zza;
                    String string2 = this.zzc;
                    ((zzcau)object2).zzf(context, string2);
                } else {
                    object2 = zzu.zzn();
                    context = this.zza;
                    String string3 = this.zzc;
                    ((zzcau)object2).zzg(context, string3);
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzdp(zzbam zzbam2) {
        boolean bl2 = zzbam2.zzj;
        this.zzb(bl2);
    }
}

