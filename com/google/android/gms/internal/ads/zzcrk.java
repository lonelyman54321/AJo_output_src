/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcqw;
import com.google.android.gms.internal.ads.zzcqz;
import com.google.android.gms.internal.ads.zzcrj;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcrk
implements zzban {
    private zzchd zza;
    private final Executor zzb;
    private final zzcqw zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcqz zzg;

    public zzcrk(Executor executor, zzcqw zzcqw2, Clock clock) {
        zzcqz zzcqz2;
        this.zzg = zzcqz2 = new zzcqz();
        this.zzb = executor;
        this.zzc = zzcqw2;
        this.zzd = clock;
    }

    private final void zzg() {
        JSONException jSONException2;
        block10: {
            block9: {
                zzcqw zzcqw2;
                try {
                    zzcqw2 = this.zzc;
                }
                catch (JSONException jSONException2) {}
                Object object = this.zzg;
                zzcqw2 = zzcqw2.zza((zzcqz)object);
                object = this.zza;
                if (object == null) break block9;
                object = this.zzb;
                zzcrj zzcrj2 = new zzcrj(this, (JSONObject)zzcqw2);
                object.execute(zzcrj2);
                return;
                break block10;
            }
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", jSONException2);
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        this.zzg();
    }

    public final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    public final void zzdp(zzbam zzbam2) {
        long l2;
        zzcqz zzcqz2;
        boolean bl2 = this.zzf;
        if (bl2) {
            bl2 = false;
            zzcqz2 = null;
        } else {
            bl2 = zzbam2.zzj;
        }
        zzcqz zzcqz3 = this.zzg;
        zzcqz3.zza = bl2;
        zzcqz3.zzd = l2 = this.zzd.elapsedRealtime();
        zzcqz2 = this.zzg;
        zzcqz2.zzf = zzbam2;
        boolean bl3 = this.zze;
        if (bl3) {
            this.zzg();
        }
    }

    public final void zze(boolean bl2) {
        this.zzf = bl2;
    }

    public final void zzf(zzchd zzchd2) {
        this.zza = zzchd2;
    }
}

