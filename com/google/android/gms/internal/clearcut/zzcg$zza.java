/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzas;
import com.google.android.gms.internal.clearcut.zzat;
import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzcg$zzg;
import com.google.android.gms.internal.clearcut.zzdo;
import com.google.android.gms.internal.clearcut.zzdq;
import com.google.android.gms.internal.clearcut.zzea;
import com.google.android.gms.internal.clearcut.zzew;

public class zzcg$zza
extends zzat {
    private final zzcg zzjs;
    protected zzcg zzjt;
    protected boolean zzju;

    public zzcg$zza(zzcg zzcg2) {
        this.zzjs = zzcg2;
        int n3 = zzcg$zzg.zzkg;
        this.zzjt = zzcg2 = (zzcg)zzcg2.zza(n3, null, null);
        this.zzju = false;
    }

    private static void zza(zzcg zzcg2, zzcg zzcg3) {
        zzea.zzcm().zzp(zzcg2).zzc(zzcg2, zzcg3);
    }

    public /* synthetic */ Object clone() {
        zzdq zzdq2 = this.zzjs;
        int n3 = zzcg$zzg.zzkh;
        zzdq2 = (zzcg$zza)((zzcg)zzdq2).zza(n3, null, null);
        zzcg zzcg2 = (zzcg)this.zzbi();
        ((zzcg$zza)zzdq2).zza(zzcg2);
        return zzdq2;
    }

    public final boolean isInitialized() {
        return zzcg.zza(this.zzjt, false);
    }

    public final /* synthetic */ zzat zza(zzas zzas2) {
        zzas2 = (zzcg)zzas2;
        return this.zza((zzcg)zzas2);
    }

    public final zzcg$zza zza(zzcg zzcg2) {
        this.zzbf();
        zzcg$zza.zza(this.zzjt, zzcg2);
        return this;
    }

    public final /* synthetic */ zzdo zzbe() {
        return this.zzjs;
    }

    public void zzbf() {
        boolean bl2 = this.zzju;
        if (bl2) {
            zzcg zzcg2 = this.zzjt;
            int n3 = zzcg$zzg.zzkg;
            zzcg2 = (zzcg)zzcg2.zza(n3, null, null);
            zzcg zzcg3 = this.zzjt;
            zzcg$zza.zza(zzcg2, zzcg3);
            this.zzjt = zzcg2;
            bl2 = false;
            zzcg2 = null;
            this.zzju = false;
        }
    }

    public zzcg zzbg() {
        boolean bl2 = this.zzju;
        if (bl2) {
            return this.zzjt;
        }
        zzcg zzcg2 = this.zzjt;
        zzea.zzcm().zzp(zzcg2).zzc(zzcg2);
        this.zzju = true;
        return this.zzjt;
    }

    public final zzcg zzbh() {
        int n3;
        zzcg zzcg2 = (zzcg)this.zzbi();
        int n4 = zzcg$zzg.zzkd;
        Object object = (Byte)zzcg2.zza(n4, null, null);
        if ((n4 = (int)((Byte)object).byteValue()) != (n3 = 1)) {
            if (n4 == 0) {
                n3 = 0;
            } else {
                object = zzea.zzcm().zzp(zzcg2);
                n3 = (int)(object.zzo(zzcg2) ? 1 : 0);
                n4 = zzcg$zzg.zzke;
                zzcg zzcg3 = n3 != 0 ? zzcg2 : null;
                zzcg2.zza(n4, zzcg3, null);
            }
        }
        if (n3 != 0) {
            return zzcg2;
        }
        object = new zzew(zzcg2);
        throw object;
    }

    public /* synthetic */ zzdo zzbi() {
        return this.zzbg();
    }

    public final /* synthetic */ zzdo zzbj() {
        int n3;
        zzcg zzcg2 = (zzcg)this.zzbi();
        int n4 = zzcg$zzg.zzkd;
        Object object = (Byte)zzcg2.zza(n4, null, null);
        if ((n4 = (int)((Byte)object).byteValue()) != (n3 = 1)) {
            if (n4 == 0) {
                n3 = 0;
            } else {
                object = zzea.zzcm().zzp(zzcg2);
                n3 = (int)(object.zzo(zzcg2) ? 1 : 0);
                n4 = zzcg$zzg.zzke;
                zzcg zzcg3 = n3 != 0 ? zzcg2 : null;
                zzcg2.zza(n4, zzcg3, null);
            }
        }
        if (n3 != 0) {
            return zzcg2;
        }
        object = new zzew(zzcg2);
        throw object;
    }

    public final /* synthetic */ zzat zzt() {
        return (zzcg$zza)this.clone();
    }
}

