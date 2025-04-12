/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcfh;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;
import com.google.android.gms.internal.ads.zzcfn;
import com.google.android.gms.internal.ads.zzcfo;
import java.lang.ref.WeakReference;
import java.util.Map;

public abstract class zzcfp
implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcfp(zzcee zzcee2) {
        Object object;
        this.zza = object = zzcee2.getContext();
        zzt zzt2 = zzu.zzp();
        String string2 = zzcee2.zzn().afmaVersion;
        object = zzt2.zzc((Context)object, string2);
        this.zzb = object;
        super(zzcee2);
        this.zzc = object;
    }

    public static /* bridge */ /* synthetic */ void zze(zzcfp object, String string2, Map map2) {
        object = (zzcee)((zzcfp)object).zzc.get();
        if (object != null) {
            string2 = "onPrecacheEvent";
            object.zzd(string2, map2);
        }
    }

    public void release() {
    }

    public abstract void zzf();

    public final void zzg(String string2, String string3, String string4, String string5) {
        Handler handler = zzf.zza;
        zzcfo zzcfo2 = new zzcfo(this, string2, string3, string4, string5);
        handler.post((Runnable)zzcfo2);
    }

    public final void zzh(String string2, String string3, int n3) {
        Handler handler = zzf.zza;
        zzcfm zzcfm2 = new zzcfm(this, string2, string3, n3);
        handler.post((Runnable)zzcfm2);
    }

    public final void zzj(String string2, String string3, long l2) {
        Handler handler = zzf.zza;
        zzcfn zzcfn2 = new zzcfn(this, string2, string3, l2);
        handler.post((Runnable)zzcfn2);
    }

    public final void zzn(String string2, String string3, int n3, int n4, long l2, long l3, boolean bl2, int n7, int n8) {
        Handler handler = zzf.zza;
        zzcfl zzcfl2 = new zzcfl(this, string2, string3, n3, n4, l2, l3, bl2, n7, n8);
        handler.post((Runnable)zzcfl2);
    }

    public final void zzo(String string2, String string3, long l2, long l3, boolean bl2, long l4, long l7, long l8, int n3, int n4) {
        Object object;
        Object object2 = this;
        Handler handler = object = zzf.zza;
        object = object2;
        Object object3 = object2;
        object2 = this;
        object(this, string2, string3, l2, l3, l4, l7, l8, bl2, n3, n4);
        object = handler;
        object2 = object3;
        handler.post((Runnable)object3);
    }

    public void zzp(int n3) {
    }

    public void zzq(int n3) {
    }

    public void zzr(int n3) {
    }

    public void zzs(int n3) {
    }

    public abstract boolean zzt(String var1);

    public boolean zzu(String string2, String[] stringArray) {
        return this.zzt(string2);
    }

    public boolean zzw(String string2, String[] stringArray, zzcfh zzcfh2) {
        return this.zzt(string2);
    }
}

