/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzczy;
import com.google.android.gms.internal.ads.zzdjh;
import com.google.android.gms.internal.ads.zzdjo;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzehr;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzfim;
import java.util.concurrent.Executor;

public final class zzejs
implements zzehr {
    private final Context zza;
    private final zzdjh zzb;
    private final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzejs(Context context, VersionInfoParcel versionInfoParcel, zzdjh zzdjh2, Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdjh2;
        this.zzd = executor;
    }

    public final void zzb(zzfhf object, zzfgt zzfgt2, zzeho zzeho2) {
        Object object2;
        Object object3 = object2 = zzeho2.zzb;
        object3 = (zzfim)object2;
        object = ((zzfhf)object).zza.zza;
        String string2 = zzfgt2.zzw.toString();
        String string3 = zzbw.zzm(zzfgt2.zzt);
        Context context = this.zza;
        zzl zzl2 = ((zzfho)object).zzd;
        Object object4 = object = zzeho2.zzc;
        object4 = (zzbrl)object;
        ((zzfim)object3).zzo(context, zzl2, string2, string3, (zzbrl)object4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzc(zzeho object, boolean n3, Context context, zzczy object2) {
        zzfhv zzfhv22;
        block3: {
            try {
                object2 = ((zzeho)object).zzb;
                object2 = (zzfim)object2;
                ((zzfim)object2).zzv(n3 != 0);
                VersionInfoParcel versionInfoParcel = this.zzc;
                n3 = versionInfoParcel.clientJarVersion;
                object2 = zzbep.zzaI;
                zzben zzben2 = zzba.zzc();
                object2 = zzben2.zza((zzbeg)object2);
                object2 = (Integer)object2;
                int n4 = (Integer)object2;
                if (n3 < n4) {
                    object = ((zzeho)object).zzb;
                    object = (zzfim)object;
                    ((zzfim)object).zzx();
                    return;
                }
            }
            catch (zzfhv zzfhv22) {
                break block3;
            }
            object = ((zzeho)object).zzb;
            object = (zzfim)object;
            ((zzfim)object).zzy(context);
            return;
        }
        zzm.zzi("Cannot show interstitial.");
        Throwable throwable = zzfhv22.getCause();
        zzdjo zzdjo2 = new zzdjo(throwable);
        throw zzdjo2;
    }
}

