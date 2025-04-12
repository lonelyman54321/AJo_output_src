/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.TextureView
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;
import com.google.android.gms.internal.ads.zzcdj;
import com.google.android.gms.internal.ads.zzcdy;
import com.google.android.gms.internal.ads.zzceh;
import com.google.android.gms.internal.ads.zzcei;

public abstract class zzcdk
extends TextureView
implements zzceh {
    protected final zzcdy zza;
    protected final zzcei zzb;

    public zzcdk(Context context) {
        super(context);
        Object object = new zzcdy();
        this.zza = object;
        this.zzb = object = new zzcei(context, this);
    }

    public void zzA(int n3) {
    }

    public void zzB(int n3) {
    }

    public void zzC(String string2, String[] stringArray, Integer n3) {
        this.zzs(string2);
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract int zzc();

    public abstract int zzd();

    public abstract int zze();

    public abstract long zzf();

    public abstract long zzg();

    public abstract long zzh();

    public abstract String zzj();

    public abstract void zzn();

    public abstract void zzo();

    public abstract void zzp();

    public abstract void zzq(int var1);

    public abstract void zzr(zzcdj var1);

    public abstract void zzs(String var1);

    public abstract void zzt();

    public abstract void zzu(float var1, float var2);

    public Integer zzw() {
        return null;
    }

    public void zzx(int n3) {
    }

    public void zzy(int n3) {
    }

    public void zzz(int n3) {
    }
}

