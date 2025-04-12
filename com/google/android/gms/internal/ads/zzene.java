/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzcsg;
import com.google.android.gms.internal.ads.zzctg;
import com.google.android.gms.internal.ads.zzcvf;
import com.google.android.gms.internal.ads.zzehl;
import com.google.android.gms.internal.ads.zzena;
import com.google.android.gms.internal.ads.zzenb;
import com.google.android.gms.internal.ads.zzenc;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgu;
import com.google.android.gms.internal.ads.zzfgy;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfkx;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflt;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzene
implements zzehl {
    private final Context zza;
    private final zzctg zzb;
    private final zzbfk zzc;
    private final zzgge zzd;
    private final zzflt zze;

    public zzene(Context context, zzctg zzctg2, zzflt zzflt2, zzgge zzgge2, zzbfk zzbfk2) {
        this.zza = context;
        this.zzb = zzctg2;
        this.zze = zzflt2;
        this.zzd = zzgge2;
        this.zzc = zzbfk2;
    }

    public final ListenableFuture zza(zzfhf object, zzfgt object2) {
        zzenc zzenc2;
        Object object3 = this.zza;
        Object object4 = new View(object3);
        zzena zzena2 = new zzena();
        Object object5 = object3 = ((zzfgt)object2).zzv.get(0);
        object5 = (zzfgu)object3;
        object3 = zzenc2;
        Object object6 = this;
        zzenc2 = new zzenc(this, (View)object4, null, zzena2, (zzfgu)object5);
        object3 = new zzcvf((zzfhf)object, (zzfgt)object2, null);
        object = this.zzb.zza((zzcvf)object3, zzenc2);
        object6 = ((zzcsg)object).zzl();
        object2 = ((zzfgt)object2).zzt;
        object4 = ((zzfgy)object2).zzb;
        object2 = ((zzfgy)object2).zza;
        object3 = new zzbff((zzg)object6, (String)object4, (String)object2);
        object2 = zzfln.zzt;
        object6 = new zzenb(this, (zzbff)object3);
        object3 = this.zze;
        object4 = this.zzd;
        object2 = zzfld.zzd((zzfkx)object6, (zzgge)object4, object2, (zzfll)object3);
        object3 = zzfln.zzu;
        object2 = ((zzflk)object2).zzb(object3);
        object = zzgft.zzh(((zzcsg)object).zza());
        return ((zzflk)object2).zzd((ListenableFuture)object).zza();
    }

    public final boolean zzb(zzfhf object, zzfgt zzfgt2) {
        object = this.zzc;
        return object != null && (object = zzfgt2.zzt) != null && (object = ((zzfgy)object).zza) != null;
    }

    public final /* synthetic */ void zzc(zzbff zzbff2) {
        this.zzc.zze(zzbff2);
    }
}

