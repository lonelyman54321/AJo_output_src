/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioManager
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzesf;
import com.google.android.gms.internal.ads.zzesh;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzesg
implements zzexw {
    private final zzgge zza;
    private final Context zzb;

    public zzesg(zzgge zzgge2, Context context) {
        this.zza = zzgge2;
        this.zzb = context;
    }

    public final int zza() {
        return 13;
    }

    public final ListenableFuture zzb() {
        zzesf zzesf2 = new zzesf(this);
        return this.zza.zzb(zzesf2);
    }

    /*
     * WARNING - void declaration
     */
    public final /* synthetic */ zzesh zzc() {
        void var10_13;
        int n3;
        Object object = this.zzb;
        String string2 = "audio";
        object = (AudioManager)object.getSystemService(string2);
        int n4 = object.getMode();
        boolean bl2 = object.isMusicActive();
        boolean bl3 = object.isSpeakerphoneOn();
        int n7 = 3;
        int n8 = object.getStreamVolume(n7);
        Object object2 = zzbep.zzkV;
        zzben zzben2 = zzba.zzc();
        object2 = (Boolean)zzben2.zza((zzbeg)object2);
        boolean n10 = (Boolean)object2;
        if (n10) {
            object2 = zzu.zzq();
            int n14 = ((zzab)object2).zzj((AudioManager)object);
            n3 = n7 = object.getStreamMaxVolume(n7);
        } else {
            n7 = -1;
            int n15 = -1;
            n3 = -1;
        }
        int n16 = object.getRingerMode();
        int n17 = object.getStreamVolume(2);
        float f5 = zzu.zzr().zza();
        boolean bl4 = zzu.zzr().zze();
        string2 = object;
        object = new zzesh(n4, bl2, bl3, n8, (int)var10_13, n3, n16, n17, f5, bl4);
        return object;
    }
}

