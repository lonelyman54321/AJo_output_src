/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdx;
import com.google.android.gms.internal.ads.zzdz;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class zzea
implements zzdz {
    protected zzdx zzb;
    protected zzdx zzc;
    private zzdx zzd;
    private zzdx zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzea() {
        Object object = zzdz.zza;
        this.zzf = object;
        this.zzg = object;
        this.zzd = object = zzdx.zza;
        this.zze = object;
        this.zzb = object;
        this.zzc = object;
    }

    public final zzdx zza(zzdx zzdx2) {
        this.zzd = zzdx2;
        this.zze = zzdx2 = this.zzi(zzdx2);
        boolean bl2 = this.zzg();
        zzdx2 = bl2 ? this.zze : zzdx.zza;
        return zzdx2;
    }

    public ByteBuffer zzb() {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2 = this.zzg;
        this.zzg = byteBuffer = zzdz.zza;
        return byteBuffer2;
    }

    public final void zzc() {
        Object object = zzdz.zza;
        this.zzg = object;
        this.zzh = false;
        this.zzb = object = this.zzd;
        this.zzc = object = this.zze;
        this.zzk();
    }

    public final void zzd() {
        this.zzh = true;
        this.zzl();
    }

    public final void zzf() {
        this.zzc();
        Object object = zzdz.zza;
        this.zzf = object;
        this.zzd = object = zzdx.zza;
        this.zze = object;
        this.zzb = object;
        this.zzc = object;
        this.zzm();
    }

    public boolean zzg() {
        zzdx zzdx2 = this.zze;
        zzdx zzdx3 = zzdx.zza;
        return zzdx2 != zzdx3;
    }

    public boolean zzh() {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        boolean bl2 = this.zzh;
        return bl2 && (byteBuffer2 = this.zzg) == (byteBuffer = zzdz.zza);
    }

    public zzdx zzi(zzdx zzdx2) {
        throw null;
    }

    public final ByteBuffer zzj(int n3) {
        ByteBuffer byteBuffer;
        Object object = this.zzf;
        int n4 = ((Buffer)object).capacity();
        if (n4 < n3) {
            byteBuffer = ByteBuffer.allocateDirect(n3);
            object = ByteOrder.nativeOrder();
            this.zzf = byteBuffer = byteBuffer.order((ByteOrder)object);
        } else {
            byteBuffer = this.zzf;
            byteBuffer.clear();
        }
        this.zzg = byteBuffer = this.zzf;
        return byteBuffer;
    }

    public void zzk() {
    }

    public void zzl() {
    }

    public void zzm() {
    }

    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}

