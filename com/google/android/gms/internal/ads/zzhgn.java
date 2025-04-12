/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhgp;
import com.google.android.gms.internal.ads.zzhij;
import com.google.android.gms.internal.ads.zzhim;
import com.google.android.gms.internal.ads.zzhir;
import com.google.android.gms.internal.ads.zzhit;
import com.google.android.gms.internal.ads.zzhjh;
import java.util.Collections;
import java.util.List;

public final class zzhgn
extends zzhbi
implements zzhdf {
    private zzhgn() {
        throw null;
    }

    public /* synthetic */ zzhgn(zzhfr object) {
        object = zzhjh.zze();
        super((zzhbo)object);
    }

    public final zzhgn zza(Iterable iterable) {
        this.zzbu();
        zzhjh.zzr((zzhjh)this.zza, iterable);
        return this;
    }

    public final zzhgn zzb(Iterable iterable) {
        this.zzbu();
        zzhjh.zzs((zzhjh)this.zza, iterable);
        return this;
    }

    public final zzhgn zzc(zzhir zzhir2) {
        this.zzbu();
        zzhjh.zzm((zzhjh)this.zza, zzhir2);
        return this;
    }

    public final zzhgn zzd() {
        this.zzbu();
        zzhjh.zzo((zzhjh)this.zza);
        return this;
    }

    public final zzhgn zze(String string2) {
        this.zzbu();
        zzhjh.zzn((zzhjh)this.zza, string2);
        return this;
    }

    public final zzhgn zzf(zzhit zzhit2) {
        this.zzbu();
        zzhjh.zzq((zzhjh)this.zza, zzhit2);
        return this;
    }

    public final zzhgn zzg(zzhgp zzhgp2) {
        this.zzbu();
        zzhjh.zzl((zzhjh)this.zza, zzhgp2);
        return this;
    }

    public final zzhgn zzh(String string2) {
        this.zzbu();
        zzhjh.zzk((zzhjh)this.zza, string2);
        return this;
    }

    public final zzhgn zzi(zzhij zzhij2) {
        this.zzbu();
        zzhjh.zzp((zzhjh)this.zza, zzhij2);
        return this;
    }

    public final zzhgn zzj(zzhim zzhim2) {
        this.zzbu();
        zzhjh.zzi((zzhjh)this.zza, zzhim2);
        return this;
    }

    public final zzhgn zzk(String string2) {
        this.zzbu();
        zzhjh.zzj((zzhjh)this.zza, string2);
        return this;
    }

    public final String zzl() {
        return ((zzhjh)this.zza).zzf();
    }

    public final String zzm() {
        return ((zzhjh)this.zza).zzg();
    }

    public final List zzn() {
        return Collections.unmodifiableList(((zzhjh)this.zza).zzh());
    }
}

