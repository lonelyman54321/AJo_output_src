/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzehl;
import com.google.android.gms.internal.ads.zzenh;
import com.google.android.gms.internal.ads.zzeni;
import com.google.android.gms.internal.ads.zzeno;
import com.google.android.gms.internal.ads.zzens;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgy;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfkx;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflt;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzenj
implements zzehl {
    private final zzbfk zza;
    private final zzgge zzb;
    private final zzflt zzc;
    private final zzens zzd;

    public zzenj(zzflt zzflt2, zzgge zzgge2, zzbfk zzbfk2, zzens zzens2) {
        this.zzc = zzflt2;
        this.zzb = zzgge2;
        this.zza = zzbfk2;
        this.zzd = zzens2;
    }

    public static /* bridge */ /* synthetic */ zzens zzd(zzenj zzenj2) {
        return zzenj2.zzd;
    }

    public final ListenableFuture zza(zzfhf object, zzfgt object2) {
        zzeni zzeni2;
        zzccn zzccn2 = new zzccn();
        zzeno zzeno2 = new zzeno();
        Object object3 = zzeni2;
        Object object4 = this;
        zzeni2 = new zzeni(this, zzccn2, (zzfhf)object, (zzfgt)object2, zzeno2);
        zzeno2.zzd(zzeni2);
        object2 = ((zzfgt)object2).zzt;
        object3 = ((zzfgy)object2).zzb;
        object2 = ((zzfgy)object2).zza;
        object = new zzbff(zzeno2, (String)object3, (String)object2);
        object2 = zzfln.zzt;
        object3 = new zzenh(this, (zzbff)object);
        object = this.zzc;
        object4 = this.zzb;
        object = zzfld.zzd((zzfkx)object3, (zzgge)object4, object2, (zzfll)object);
        object2 = zzfln.zzu;
        return ((zzflk)object).zzb(object2).zzd(zzccn2).zza();
    }

    public final boolean zzb(zzfhf object, zzfgt zzfgt2) {
        object = this.zza;
        return object != null && (object = zzfgt2.zzt) != null && (object = ((zzfgy)object).zza) != null;
    }

    public final /* synthetic */ void zzc(zzbff zzbff2) {
        this.zza.zze(zzbff2);
    }
}

